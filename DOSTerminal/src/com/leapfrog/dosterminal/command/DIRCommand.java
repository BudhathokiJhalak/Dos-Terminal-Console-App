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
public class DIRCommand extends DOSCommand{

    @Override
    public void execute(String[] params) {
        File file = null;
        boolean isDir = false;
        if(params.length==1){
            file = new File(".");
            isDir = true;
        }else if(params.length==2){
            file = new File(params[1]);
            if(file.isDirectory()){
                isDir = true;
            }
        }
        if(isDir){
            for (File f : file.listFiles()) {
                System.out.println(f.getPath());
            }
        }
    }
    
}
