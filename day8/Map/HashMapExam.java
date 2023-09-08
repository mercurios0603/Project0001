package day8.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {

        // ArrayList

        ArrayList<String> list = new ArrayList<>();
        
        // 배열은 같은 자료형만 묶을 수 있었다.
        // 데이터 접근은 인덱싱
        
        list.add("홍길동");
        list.add("20");
        list.add("대전");
        
        // 어디에 뭐가 있는지 모른다 -> 그래서 클래스/객체를 사용했었다.
        // 그런데 클래스를 쓰면 생성자도 만들고... 뭔가 번거롭다.
        
        // 단순히 데이터 저장만을 하기 위함이라면?
        // 해시맵 -> 데이터를 키바인딩하여 저장

        HashMap map = new HashMap();

        // 저장 -> put(key, value)

        map.put(0, "홍길동");
        map.put("이름", "홍길동");
        map.put(true, "참");
        map.put("나이", 20);
        map.put("객체", new 사과());

        // 조회 -> get(key)

        System.out.println(map.get(0));
        System.out.println(map.get("이름"));
        System.out.println(map.get(true));
        System.out.println(map.get("나이"));
        System.out.println(map.get("객체"));

        // 수정 -> put(key, value)
        // 삭제 -> remove(key)

        // 제너릭을 사용한 버전

        // 문자열 제너릭
        HashMap<String, String> mymap = new HashMap<>();

        mymap.put("이름","홍길동");
        mymap.put("나이","20");
        mymap.put("거주지","대전");

        System.out.println(map.get("이름"));

        String name = mymap.put("이름","홍길동");

        // 오브젝트 제너릭
        HashMap<String, Object> mymap2 = new HashMap<>();
        mymap2.put("이름","홍길동");
        mymap2.put("나이", 20);
        mymap2.put("거주지","대전");

        String name2 = (String) mymap2.get("이름");
        int age = (int) mymap2.get("나이");

        // 클래스, 객체로 대체 가능 (원래 쓰던 것)

        // 그럼에도 사용하면 편리하다. (클래스 정의 필요없이 단순 저장 용도)
        // 탐색 속도 빠르다. 데이터의 구조가 상대적으로 명확

        // put은 수정 (키가 존재하면 수정, 존재하지 않으면 저장)

        mymap2.put("이름", "이순신");
        System.out.println(mymap2.get("이름"));

        // remove는 제거

        mymap2.remove("이름");
        System.out.println(mymap2.get("이름"));

    }
}

class 사과 {

}