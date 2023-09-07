package day7;

// 문제 : double 형 변수 d 에 담긴 10.5 를 float 형 변수 f에 넣어주세요. 그 반대작업도 진행해주세요.
public class Exam2_1 {
    public static void main(String[] args) {
        // 자바에서의 상수  1 => 00000000 00000000 00000000 00000001
        // 자바에서의 상수 1L => 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001

        int i = 1; // int 는 4바이트 즉 돌 32개 짜리 (32 bit)
        long l = (long)i; // long 은 8바이트 즉 돌 64개 짜리 (64 bit)
        // (int) => 110볼트를 220볼트로 변압하듯이 1을 `long 화` 하여 넣는다.

        l = i; // 이 코드는 안전하기 때문에 자동형변환이 발생합니다.
        //i = l; // 이 코드는 안전하지 않기 때문에 자동형변환이 불가능 합니다.

        i = (int)l; // 수동형변환 => 위험에 대한 싸인

        // float - 32 bit
        // double - 64 bit

        double d = 10.5;
        float f;

        // Java에서 실수 리터럴(상수)은 기본적으로 double 형식으로 해석됩니다.
        // 그래서 double 변수에 실수 리터럴을 할당할 때는 별다른 변환 없이 사용할 수 있습니다.
        // 그러나 float 변수에 실수 리터럴을 할당하려면 명시적으로 f 또는 F 접미사를 붙여야 합니다.
        // 아니면 형변환을 수행하여 float로 바꿀 수 있습니다.

        f = (float) d;
        System.out.println(f);

        f = (float) 10.2;

        System.out.println(f);
        // 또는
        f = 10.2f;
        // 좌변의 f는 변수의 f, 우변의 f는 형변환 float의 f.

        System.out.println(f);

        d = f;
        // 또는

        System.out.println(d);

        d = (double) f;

        System.out.println(d);


    }
}
