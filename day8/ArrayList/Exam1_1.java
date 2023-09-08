package day8.ArrayList;
import java.util.ArrayList;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.
public class Exam1_1 {
    public static void main(String[] args) {

        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.

        ArrayList<Integer> a저장소 = new ArrayList<>();
        a저장소.add(5);
        a저장소.add(4);
        a저장소.add(3);
        a저장소.add(2);
        a저장소.add(1);
        a저장소.add(0);

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6

        int size = a저장소.size();
        System.out.println("초기 리스트의 사이즈");
        System.out.println(size);

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2
        int num1 = a저장소.get(2);
        int num2 = a저장소.get(3);

        System.out.println("초기 리스트의 3,4번째 값");
        System.out.println(num1);
        System.out.println(num2);

        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0

        System.out.println("리스트 1,2번째 값을 지운 뒤의 3,4번째 값");
        a저장소.remove(0);
        // 와... 1,2번째 값을 지우려면 처음에 지워진 시점에서 빈자리를 기존의 2번쨰 값이 채웠으므로 그대로 유지해야 한다.
        a저장소.remove(0);

        int num3 = a저장소.get(2);
        int num4 = a저장소.get(3);

        System.out.println(num3);
        System.out.println(num4);

        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0

        System.out.println("리스트의 모든 값");
        int size2 = a저장소.size();
            for (int i = 0 ; i < size2 ; i++) {
            System.out.println(a저장소.get(i));
        }
    }
}

