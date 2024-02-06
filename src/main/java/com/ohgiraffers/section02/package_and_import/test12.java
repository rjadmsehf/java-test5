package com.ohgiraffers.section02.package_and_import;

public class test12 {

    public static void main(String[] args) {

        int height = 5;
        int width = 10;

        test12 height1 = new test12();

        System.out.println(test12.height1(height,width));

    }
    public static int height1 (int height , int width) {

        return (height + width) * 2;
    }
}