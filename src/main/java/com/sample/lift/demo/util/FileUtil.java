package com.sample.lift.demo.util;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class FileUtil {
    static Logger logger = (Logger) LoggerFactory.getLogger(FileUtil.class);

    public static File openFile(String path) {
        File file = null;
        if (path.isEmpty()){
            new RuntimeException();
        }
        file = new File(path);
        if (file.exists()){
            logger.info("filename {} ", file.getName());
        } else {
            new RuntimeException();
        }
        return file;
    }

    public static File openFolder(String path){
        File file = openFile(path);
        if (file != null && !file.isDirectory()){
            new RuntimeException(path + " not is a directory.");
        }
        return file;
    }
}
