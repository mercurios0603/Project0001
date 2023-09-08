package day8.Array;
import java.util.ArrayList;

public class Array {
    public static void  main(String[] args) {

        저장소<Integer> a저장소 = new 저장소<>();

        a저장소.setData(10);
        a저장소.setData(20);
        a저장소.setData(30);

        int num = a저장소.getData(1);
        System.out.println(num);

        int num2 = a저장소.getData(0);
        System.out.println(num2);

        Integer[] iarr = new Integer[10]; // 왜 배열을 안쓰고?

        // 정답 : 배열이 불편해서. 뭐가 불편할까? -> 길이 즉 저장소의 공간이 정해져있다.

        // iarr[10] = 20; <- 아래의 경우 index 10이라서 에러가 뜬다.

        // 배열 삭제, 추가 -> 귀찮습니다.

        int[] arr = {1,2,3,4,5};

        for (int i =0 ; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // 만약 특정 배열을 삭제한다 하면...
        // 1,2,3,4,5
        // 1,2,4,5
        // 사실 배열에는 삭제라는 개념이 없고, 삭제된거 것처럼 보이게 해야한다.
        // 예를 들어 삭제된 배열의 빈공간을 채워넣는다.

        // 몇개 저장했는지 알기 힘듦;

        int[] arr2 = new int[10];

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        // arr2.length는 배열의 길이이지, 데이터를 몇 개나 저장했는지 알려주지 않는다.
        System.out.println(arr2.length);

        // 그래서 개발자들이 고민을 했다.
        // 저장소가 꽉 차면 알아서 늘어나고,
        // 추가, 삭제도 되고,
        // 내가 몇개 저장했는지 세주기도 하고
        // 그런 애가 있으면 좋겠네.
        // 이러한 고민의 결과가 자바가 제공하는 저장소 클래스 -> ArrayList

        ArrayList<Integer> b저장소 = new ArrayList<>();

        // 추가 - add()
        // 삭제 - remove()
        // 수정 - set()
        // 조회 - get()
        // 사이즈 - size()
        // 등등 (그 외의 메서드는 JAVA 문서를 참조하시오!)

        b저장소.add(10);
        b저장소.add(20);
        b저장소.add(30);

        int num3 = b저장소.get(1);
        System.out.println(num3);

        int num4 = b저장소.get(0);
        System.out.println(num4);

        // Index 1번째 값이 20인데, 10으로 수정
        b저장소.set(1, 50);
        b저장소.get(1);
        int num5 = b저장소.get(1);
        System.out.println(num5);

        // 삭제 -> 1번째 값 삭제. (현재 10,50,30 인 상태임)
        b저장소.remove(1);
        int num6 = b저장소.get(1);
        System.out.println(num6);

        // 사이즈
        int size = b저장소.size();
        System.out.println(size);
    }
}

class 저장소<T> {

    private Object[] datas;

    int lastIdx;

    저장소() {
        datas = new Object[3];
        lastIdx = 0;
    }

    public void setData(T data) {
        this.datas[lastIdx] = data;
        lastIdx++;
    }

    public T getData(int idx) {
        return (T)datas[idx];
    }
}