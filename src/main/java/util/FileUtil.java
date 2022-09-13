package util;

import java.io.File;

public class FileUtil {

    public static String openFile(String path){
        if (path == "") {
            new RuntimeException();
        }
        File file = new File(path);
        if (file != null && file.exists()){
            return "File: " + file.getName();
        } else {
            return "Error IO File";
        }
    }
    public static String openFolder(String path){
        if (path == "") {
            new RuntimeException();
        }
        File file = new File(path);
        if (file != null && file.exists()){
            return "File: " + file.getName();
        } else {
            return "Error IO Folder";
        }
    }
}
