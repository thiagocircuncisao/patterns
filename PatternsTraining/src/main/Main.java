/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thiago
 */
public class Main {
    public static void main (String[] args){
        int i;
        File dir = new File("./plugins/");
        String[] plugins = dir.list();
        int j;
        URL[] jars = new URL[plugins.length];
        for(j = 0; j < plugins.length; j++){
            try {
                jars[j] = (new File("./plugins/" + plugins[j]).toURL());
            } catch (MalformedURLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader url = new URLClassLoader(jars);
        for(i = 0; i < plugins.length; i++){
            plugins[i] = plugins[i].split("\\.")[0];
            System.out.println(plugins[i] + i+1);
        }
        System.out.println("Atualizar plugins" + i+1);
        System.out.println("0 para sair");
        /*Scanner 
        if()*/
    }
}
