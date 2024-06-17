package Part2_Test;

public class Main {
    public static void main(String[] args) {
        ex01();
    }

    public static void ex01() {
        int number = 3;
        System.out.println(number);
    }

    public static void ex02() {
        // 상수 PI를 만들어보세요.

        final double PI = 3.14159;

        int radius = 5;
        double result = radius * 2 * PI;
        System.out.println(result);
    }

    public static void ex03() {
        boolean isFun = false;
        char charValue = 'a';
        int intValue = 20;
        long longValue = 2147483648L;

        System.out.println(isFun);
        System.out.println(charValue);
            System.out.println(intValue);
            System.out.println(longValue);
    }

    public static void ex04() {
        int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.
        long longValue = intValue;

        System.out.println(longValue);
    }

    public static void ex05() {
        long longValue = 20;
        //이 아래줄에 int형 변수 intValue를 선언하고 longValue에 들어있는 값을 담아보세요.
        int intValue = (int)longValue;

        System.out.println(intValue);
    }

    public static void ex06() {
        int a = 7;
        int b = 3;
        //c는 a와 b의 합
        int c = a + b;
        //d는 a와 b의 차
        int d = a - b;
        //e는 a와 b의 곱
        int e = a * b;
        //f는 a를 b로 나눈 나머지
        int f = a % b;

        System.out.printf("c는: %d\n", c);
        System.out.printf("d는: %d\n", d);
        System.out.printf("e는: %d\n", e);
        System.out.printf("f는: %d\n", f);
    }

    public static boolean[] ex07(int a, int b) {
        //변수 a와 b는 int형 변수입니다. 각각 어떤 값을 가지고 있는지는 비교해 보기 전에는 모릅니다.
        //a와 b가 주어져 있다고 가정하고 아래 지시에 따라 문제를 풀어 보세요.

        //a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.
        boolean c = a > b;
        //a와 b가 같은지 비교한 결과를 d에 저장하세요.
        boolean d = a == b;
        //a와 b가 다른지 비교한 결과를 e에 저장하세요.
        boolean e = a != b;
        //이 아래 코드는 결과 테스트를 위한 코드입니다.
        boolean ret[] = {c, d, e};
        return ret;
    }
}
