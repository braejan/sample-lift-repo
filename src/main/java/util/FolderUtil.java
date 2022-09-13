package util;

import java.io.File;

public class FolderUtil {
    public static String openFolder(String path){
        if (path == "") {
            new RuntimeException();
        }
        File file = new File(path);
        if (file != null && file.exists()){
            return "File: " + file.getName();
        }
        return "IO error";
    }
}
