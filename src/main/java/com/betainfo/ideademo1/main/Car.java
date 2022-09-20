package com.betainfo.ideademo1.main;

/**
 * @author guokai
 * @date 2022/09/15
 **/
public class Car {
    private int age;
    private StringBuffer sb;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StringBuffer getSb() {
        return sb;
    }

    public void setSb(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", sb=" + sb +
                '}';
    }
}
