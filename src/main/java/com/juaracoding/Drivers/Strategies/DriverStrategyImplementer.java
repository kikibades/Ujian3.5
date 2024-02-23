package com.juaracoding.Drivers.Strategies;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            default:
                return null;
        }



    }
}
