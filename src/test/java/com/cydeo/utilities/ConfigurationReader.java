package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    /*
    In this class we will be creating a reusable logic to read from configuration.properties file
         */
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.err.println("File not found with given path");
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyWord ){
        return  properties.getProperty(keyWord);
    }







}
