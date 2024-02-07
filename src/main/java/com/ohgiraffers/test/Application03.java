package com.ohgiraffers.test;

public class Application03 {

    public static void main(String[] args) {
     
        /* 목표 매개변수와 리턴값을 복합적으로 활용해보자 */
        Application03 app3 = new Application03();
        
        int result = app3.plusTwoNumbers(40,50);

        System.out.println("result = " + result);
        
        int result2 = app3.minusTwoNumbers(40,50);

        System.out.println("result2 = " + result2);

        System.out.println(result+result2);
        
    }
    
    
    

        public int plusTwoNumbers ( int first, int second){

            return first + second;
        }

        public int minusTwoNumbers (int first , int second){
            
            return first-second;
        }


    
}
