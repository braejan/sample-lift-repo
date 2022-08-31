package com.sample.lift.demo.util;


import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class CommonUtil {


    public static void OpenFile() {
        File file;
        try {
             file = new File("C:\\demo\\demofile.txt");
        } catch (Exception e) {
            throw  e;
        }
        if (file == null) {
            new RuntimeException();
        }
    }


    public static void OpenFolder() {
        File folder;
        try {
            folder = new File("C:\\demo\\demofile.txt");
        } catch (Exception e) {
            throw  e;
        }
        if (folder == null) {
            new RuntimeException();
        }
    }
}
