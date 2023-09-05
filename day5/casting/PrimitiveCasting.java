package day5.casting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // 형변환
        int num = 10;
        double num2 = 3.14;

        // num = num2; // 에러 -> int 변수인 num에 double을 대입하려고 해서.
        // 자바의 변수는 타입이 다른 값을 저장할 수 없다.
//        num2 = num; // int 값이 double변수인 num2에 저장됐다(X)
        // num이 num2에 저장되기 위해서 double로 모습을 바꿨다.

        // 형변환 원칙
        // 안전한 형변환은 자바가 자동으로 해줌(자동 형변환)
        // 위험한 형변환은 안해줌. 직접 해야함(수동 형변환)
        num = (int)num2; // 문제 -> 생길 수도, 안생길 수도(실수를 정수 변수에 넣어야 하기 때문에 소수점이 유실된다.)

        System.out.println(num); // 원래 3.14에서 데이터가 바뀌게 됨(위험)


    }
}
