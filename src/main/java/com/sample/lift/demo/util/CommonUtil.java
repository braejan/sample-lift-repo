package com.sample.lift.demo.util;


import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class CommonUtil {


    public static void OpenFile (){
        try
        {
            File file = new File("C:\\demo\\demofile.txt");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
