/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.command;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author zak
 */
public class CFCommand extends DOSCommand {

    @Override
    public void execute(String[] params) {
        if (params.length > 1) {
            File file = new File(params[1]);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                } else {
                    System.out.println("File exists.");
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } else {
            System.out.println(params[0] + ": missing file operand \n Try 'touch --help' for more information.");

        }
    }

}
