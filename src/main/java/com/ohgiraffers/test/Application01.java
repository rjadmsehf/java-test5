package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /* 목표 메소드의 호출 흐름을 연습해보자 */
        System.out.println(" main 프로그램 시작 ..... " );



        Application01 app1 = new Application01();
        app1.testMethod1();



        System.out.println(" main 프로그램이 모든 작업을 종료 후 없어집니다....");




    }


    public void testMethod1() {

        System.out.println("안녕 나는 testmethod1 이야 불럿냐 ");

        testMethod2();

        System.out.println("test1  용무다 봤으니까 갈게 ");

    }

    public void testMethod2(){                //필기 ........ void 는 return을 생략한다.

        System.out.println("하이 나는 testMethod2 야 불렀니?");

//        testMethod3();                        //필기 ....... 메소드3 값자체가 왔지만 출력이없어 출력안됀다.
        String hi = testMethod3();              //필기 ....... hi 는 testMethod3 로 변수지정함
        System.out.println("hi = " + hi);       //필기 ....... 변수로 hi 를 만들어줫기 때문에 변수 hi를 출력하면 test 메소드3이 출려됨

        System.out.println("test2 용무 마쳣으니 돌아가볼게~~~~~~");

    }

    public String testMethod3() {            //필기 ........ 값을 가지고 돌아온다.


        return "안녕 불렀어?";                 //필기 ........보내주는 값  퍼블릭 (자료형) = testMethod3()(<< 자료형 이름)

        
        
    }

}




