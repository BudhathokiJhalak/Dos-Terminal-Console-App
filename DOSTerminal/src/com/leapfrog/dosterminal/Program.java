/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal;

import com.leapfrog.dosterminal.command.DOSCommand;
import com.leapfrog.dosterminal.command.factory.DOSCommandFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zak
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File pwd = new File(".");
        String path = pwd.getAbsolutePath();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(path + ">");
        String line = "";
        try {
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                String[] tokens = line.split(" ");
                DOSCommand cmd = DOSCommandFactory.get(tokens[0]);
                if(cmd!=null){
                    cmd.execute(tokens);
                }else{
                    System.out.println("'"+tokens[0]+"' is not recognized as an internal or external command, \n operable program or batch file.");
                }
                System.out.print(path + ">");
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
