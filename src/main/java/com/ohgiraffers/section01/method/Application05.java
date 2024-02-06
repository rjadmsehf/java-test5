package com.ohgiraffers.section01.method;

public class Application05 {

    public static void main(String[] args) {

        /* 목표 메소드 리턴에 대해 이해할 수 있다.
            필기
             return 이란?
             모든 메소드 내부에는 return; 이 존재한다.
             void 메스드의 경우 return; 울 명시적으로 작성하지 않아도 마지막 줄에
             컴파일러가 자동으로 추가해준다.
             retrun 은 현재 메소드를 강제 종료하고, 호출한 구문으로 다시 돌아가는 명령이다.
         */
        System.out.println("main() 메소드가 시작됨 ....");

        Application05 app05 = new Application05();
        app05.testMethod();;

        System.out.println("main() 메소드가 종료됨 ....");





    }


    public void testMethod(){

        System.out.println("testMethod() 동작하니?");

        /* 필기
            reyurn; 은 컴파일러에 의해 자동으로 추가되는 구문이다.
            가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.
         */

        return;

//        System.out.println("test"); 에러가 발생한다. return 은 메소드 가장 마지막에 작성해야 한다. void 는 자동으로 마지막 문단에 return 이포함됨



    }

}
