package com.ohgiraffers.section01.method;

public class test {

    public static void main(String[] args) {

        /* 목표. 메소드의 호출 흐름에 대해 이해할 수 있다.*/
        /* 필기
            메소드란?
            메소드(method) 는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         */

        System.out.println("main () 메소드 시작됨 ..." );

        /* 목차 1 작성한 메소드를 호출하는 부분을 작성한다*/
        /* 필기
            메소드 호출 방법
            클래스명 사용할이름 = new 클래스명();
            사용할이름 메소드명();
         */

        test app1 = new test ();
        app1.methodA();




        System.out.println("main () 메소드 종료됨 ..." );




    }
    public void methodA() {
        System.out.println( "methodA() 등장~");

        System.out.println( "methodA() 퇴장~");
        test app1 = new test();
        app1.methodB();

    }
    public void methodB(){
        test app1 = new test();
        app1.methodA();



    }
}

