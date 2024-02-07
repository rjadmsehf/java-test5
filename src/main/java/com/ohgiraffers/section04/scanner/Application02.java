package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* 목표. Scanner 의 nextline() 과 next() 에 대해 구분하여 사용할 수 있다. */
        /* 필기
            nextLine() : 공백을 포함한 한 줄을 임력을 위한 개행문자 전 까지 읽어서 문자열로 반환한다.( 공백 문자 포함
            next() : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
         */

        /* 목차 1. Scaner 객체 생성*/
        Scanner sc = new Scanner(System.in);

        /* 목차 2. 문자열 입력 */
        /* 목차 2-1 nextLine() */


        System.out.print("인사말을 입력해주세요 : ");
        String greeting = sc.nextLine();
        System.out.println(greeting);  // 안녕하세요 반갑습니다.


        /* 목차 2-2. next()*/

        System.out.print("인사말을 입력해주세요2 : ");  //필기 개행(스페이스바) 이후 글자를 읽지 못한다.
        String greeting2 = sc.next();
        System.out.println(greeting2);

    }

}
