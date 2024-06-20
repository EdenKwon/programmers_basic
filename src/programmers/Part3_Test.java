package programmers;

import java.util.*;

public class Part3_Test {
    public static void main(String[] args) {
        ex01();
    }

    public static void ex01() {
        int value = 3;
        if( value % 3 == 0 ) {
            System.out.println("value는 3의 배수입니다.");
        }
    }

    public static int ex02(int value) {
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if ( value % 4 == 0){
            ret = 4;
        }
        // 결과 체크를 위한 코드입니다.
        return ret;
    }

    public static boolean ex03(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(
                age <= 19 || age >= 60
        ) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static boolean ex04(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if(
                age >= 20 && age < 30
        ) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }
        return isTwenties;
    }

    public static void ex05() {
        // hour에는 현재 시간이 24시간 단위로 들어 있습니다.
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
        ampm =
                hour < 12 ? "오전" : "오후";

        System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
    }

    public static void ex06() {
        // month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울"; break;
            case 3:
            case 4:
            case 5:
                season = "봄"; break;
            case 6:
            case 7:
            case 8:
                season = "여름"; break;
            default : //9, 10, 11
                season = "가을"; break;
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }

    public static void ex07() {
        int i = 1;
        // while 문을 써서 1부터 10까지 숫자를 출력해보세요.
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        //System.out.println(i);
    }

    public static void ex08() {
        int i = 1;
        while(i < 11){
            // if 문을 추가해, i가 짝수일때만 i를 출력하는 코드를 짜보세요.
            if(i % 2 == 0) System.out.println(i);
            i++;
        }
    }

    public static void ex09() {
        //for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
        for(int i=1; i<=100; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
