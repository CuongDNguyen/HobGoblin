package com.worldgate.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

public class PropUtil {

    private static Properties prop = null;
    public static InputStream file;


    static {
        InputStream is = null;
        try {
            prop = new Properties();
            is = new FileInputStream("src/test/resources/richard.properties");
            prop.load(is);
        } catch (IOException e) {
            LogUtil.log.error("Error in PropUtil. Properties file not found.");
            e.printStackTrace();
        }
    }

    public static String getVal(String key){
        return prop.getProperty(key);
    }


//    static {
//        try {
//            input = new FileInputStream("src/test/resources/richard.properties");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }



}