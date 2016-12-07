/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosterminal.command.factory;

import com.leapfrog.dosterminal.command.CFCommand;
import com.leapfrog.dosterminal.command.DIRCommand;
import com.leapfrog.dosterminal.command.DOSCommand;
import com.leapfrog.dosterminal.command.HeadCommand;
import com.leapfrog.dosterminal.command.MDCommand;
import com.leapfrog.dosterminal.command.RMCommand;

/**
 *
 * @author zak
 */
public class DOSCommandFactory {

    public static DOSCommand get(String key) {
        if (key.equalsIgnoreCase("mkdir")) {
            return new MDCommand();
        }else if(key.equalsIgnoreCase("dir")){
            return new DIRCommand();
        }else if(key.equalsIgnoreCase("touch")){
            return new CFCommand();
        }else if(key.equalsIgnoreCase("rm")){
            return new RMCommand();
        }else if(key.equalsIgnoreCase("head")){
            return new HeadCommand();
        }
        return null;
    }
}
