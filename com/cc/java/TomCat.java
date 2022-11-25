package com.cc.java;

public class TomCat extends SuperCat {

    public TomCat(String name, String furColor, int age) {
        super(name, furColor, age);

    }

    public String getAge() {
        return Integer.toString(age);

    }

}
