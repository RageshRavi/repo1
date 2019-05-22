package com.mac.rag;

class SubClass extends SuperClass {
    private static final String constant;
    private final String constant1;
    private final String constant2;

    {
        constant1 = "";
    }
    static{
        constant = "static initialization";
    }
    SubClass(){

        super();
        constant2="";
        System.out.println("Inside subclass");
    }
    SubClass(int x){
        constant2="sdsd";
    }
}
