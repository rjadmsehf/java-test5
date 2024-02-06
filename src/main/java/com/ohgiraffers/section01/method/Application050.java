package com.ohgiraffers.section01.method;

public class Application050 {
    public static void main(String[] args) {



        /*  1부터 n까지의 숫자 중에서 마지막 짝수와 짝수의 개수를 더하시오*/

        Application050 app050 = new Application050();
        int x =16;
        app050.methodA(x);
    }

    public void methodA(int x) {
        System.out.println(x-(x % 2 == 0 ? 0 : 1 ) + (x/2));
    }

}
