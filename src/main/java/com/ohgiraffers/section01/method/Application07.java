package com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        /* 목표 매개변수와 리턴값을 복합적으로 활용하는 것을 이애하고 활용할 수 있다.*/
        /* 필기
            매개변수와 리턴값을 복합 활용
            매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
         */
        int first = 20;
        int second = 10;

        Application07 app7 = new Application07();  // 필기 Application07 app7 = Application07 안에 불러올놈
        System.out.println("두 수를 더한 결과 : " + app7.plusTowNumbers(first,second));
//        app7.plusTowNumbers(first,second);    =
//        app7.minusTwoNumbers(first,second);
//        app7.divideTwoNumvers(first,second);
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumbers(first,second));
        System.out.println("두 수를 곱한 결과 : "+ app7.divideTwoNumvers(first,second));

    }

    /** 문서화 주석
     * <pre>
     *  매개변수로 전달 받은 두수를 더하여 반환하는 기능 제공
     * @param first1 더하기를 할 첫번째 정수
     * @param second1 더하기를 할 두번째 정수
     * @return  매개변수로 전달 받은 두수를 더한 결과
     * </pre>*/

    public int plusTowNumbers (int first1 ,int second1 ) {          // 필기 인트받아라 int 는 공간개념

        return first1 + second1;


    }

    public int minusTwoNumbers (int first2, int second2){

        return first2 - second2;
    }
    public int divideTwoNumvers (int first3, int second3){

        return first3 * second3;
    }


}
