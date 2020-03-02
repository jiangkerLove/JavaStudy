package com.study;

public class Test {

    public static void main(String[] args) {
        SwitchBuilder builder = new SwitchBuilder(78,10);
        System.out.println(builder.build());
        System.out.println(builder.reverse().build());
        System.out.println(builder.turnOver().build());
    }
}
