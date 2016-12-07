/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.command;

import java.io.File;

/**
 *
 * @author zak
 */
public class RMCommand extends DOSCommand{

    @Override
    public void execute(String[] params) {
        if(params.length>1){
        File file = new File(params[1]);
        if(!file.exists()){
            System.out.println(params[0]+": cannot remove '"+params[1]+"': No such file or directory");
        }else{
            file.delete();
        }
        }else{
            System.out.println(params[0]+": missing operand \n Try 'rm --help' for more information.");
        }
    }
    
}
