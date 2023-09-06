package day6.overloading.Exam2_4;

// 문제 - 다양한 데이터를 입력받아 저장할 수 있는 저장소 클래스를 만들어주세요.(개념 - 오버로딩, 자동형변환)
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 다음 코드가 오류없이 진행되도록 해주세요. 오류만 안나면 됩니다.

public class Exam2_4  {
    public static void main(String[] args) {

        저장소 a저장소 = new 저장소();

        a저장소.저장(10);
        a저장소.저장("안녕");
        a저장소.저장(new 사람());
        a저장소.저장(new 사과());
        a저장소.저장(5.5);
        a저장소.저장(false);
        a저장소.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        a저장소.저장(b);
        a저장소.저장(s);
        a저장소.저장(c);
        a저장소.저장(i);
        a저장소.저장(l);
        a저장소.저장(f);
        a저장소.저장(d);
        a저장소.저장(bl);
    }
}

class 저장소 {

    public byte 저장 (byte b){
        return b;
    }

    public char 저장 (char c){
        return c;
    }

    public short 저장 (short s) {
        return s;
    }

    public long 저장 (long l) {
        return l;
    }

    public float 저장 (float f) {
        return f;
    }

    public double 저장 (double d) {
        return d;
    }

    public boolean 저장 (boolean bl) {
        return bl;
    }
    public String 저장 (String st) {
        return st;
    }

    public Object 저장 (Object ob) {
        return ob;
    }
}

class 사람 {
}

class 사과 {
}
