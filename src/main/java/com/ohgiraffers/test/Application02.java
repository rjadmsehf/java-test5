package com.ohgiraffers.test;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main 메소드 동작 실행함 ..... " );

        Application02 app2 = new Application02();
        app2.testMethod1(100);                                      //필기 불러온 놈한테 값넣어서 돌려보내기



        int result = app2.testMethod2(200);                        //필기 호출과 동시에 이름만들어서 자료형만들기
//        app2.testMethod2(200);

        System.out.println(result +1 );                                  //필기 메소드1 값을 +1 자리를 넣을려면 어떻게 해야할까



        System.out.println("main 메소드 동작 종료함 ..... ");

        app2.testMethod3( "전준규",24,'남');             //필기 불러온 놈 자료형에 맞춰 값넣기

    }

    public void testMethod1(int num){

        System.out.println(++num);


    }

    public int testMethod2 (int num1) {


        System.out.println(num1);


        return num1;


    }

    public void testMethod3(String name , int age, char gender){

        System.out.println("내 이름은 " + name + "이고 ,나이는" + age +"살 이며," + "성별은:" + gender + "자 입니다");


    }
//    public int testMethod3(String name , int age, char gender){
//
//        System.out.println("내 이름은 " + name + "이고 ,나이는" + age +"살 이며," + "성별은:" + gender + "자 입니다");
//
//        return testMethod3(name, age,gender);

}
