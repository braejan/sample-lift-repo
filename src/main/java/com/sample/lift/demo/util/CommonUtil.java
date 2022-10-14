package com.sample.lift.demo.util;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class CommonUtil {
    static Logger logger = (Logger) LoggerFactory.getLogger(CommonUtil.class);

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
}
