package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        Double ret = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println(ret);
        return ret;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    }
}
