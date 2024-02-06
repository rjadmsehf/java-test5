package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* 목표. static 메소드를 호출할 수 있다*/
        /* 필기.
            static 메소드 호출

         */
        /* 필기.
            static 단검 메소드 호출하는 방법
            클래스명.메소드명(); <- 이런 방식으로 호출한다
         */

        System.out.println("10과 20의합 : " + Application08.sumTwoNumbers(10,20));  // 필기 ... Application08자체에 미리 만들었기 때문에 Application08 는 생략도 가능하다


        /* 필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다.*/ // 필기 ... new 필요없음

        System.out.println("20과 30의 합 : " +sumTwoNumbers(20, 30) );

    }

    public static int sumTwoNumbers (int first, int second){ // 필기 ... 스태틱은 미리 메모리 차지를 함 void 는 필요할때 불러옴

        return first + second;

    }


}
