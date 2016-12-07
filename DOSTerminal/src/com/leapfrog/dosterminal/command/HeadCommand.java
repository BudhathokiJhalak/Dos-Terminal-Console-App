/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author zak
 */
public class HeadCommand extends DOSCommand {

    @Override
    public void execute(String[] params) {
        if (params.length > 1) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(params[1]));
                String line="";
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } else {
            System.out.println("Invalid Command");
        }
    }

}
