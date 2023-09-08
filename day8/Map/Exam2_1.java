package day8.Map;
import java.util.HashMap;

public class Exam2_1 {
    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4

        HashMap<String, Object> hong = new HashMap<>();
        hong.put("이름1", "홍길동");
        hong.put("나이1", 22);
        hong.put("키1", 170.5);

        hong.put("이름2", "홍길순");
        hong.put("나이2", 25);
        hong.put("키2", 162.4);

        String name1 = (String) hong.get("이름1");
        int age1 = (int) hong.get("나이1");
        double tall1 = (double) hong.get("키1");

        String name2 = (String) hong.get("이름2");
        int age2 = (int) hong.get("나이2");
        double tall2 = (double) hong.get("키2");

        System.out.println("사람1 정보");
        System.out.println("이름 : " + name1);
        System.out.println("나이 : " + age1);
        System.out.println("키 : " + tall1);

        System.out.println("사람2 정보");
        System.out.println("이름 : " + name2);
        System.out.println("나이 : " + age2);
        System.out.println("키 : " + tall2);

    }
}
