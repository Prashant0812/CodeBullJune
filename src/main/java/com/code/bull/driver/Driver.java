package com.code.bull.driver;

import org.testng.annotations.BeforeSuite;

public class Driver {

    private static String env = null;
    private static String browser = null;

    @BeforeSuite
    public void envSetup() {
        if (env.equalsIgnoreCase("sit")) {
            env = "SIT";
        } else if (env.equalsIgnoreCase("UAT")) {
            env = "UAT";
        } else if (env.equalsIgnoreCase("PROD")) {
            env = "PROD";
        } else {
            env = "SIT";
        }
    }
}