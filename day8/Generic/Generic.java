package day8.Generic;

public class Generic {
    public static void main(String[] args){
        저장소<Integer> a저장소 = new 저장소<>();
        a저장소.setData(10);
        Object num1 = a저장소.getData();

        저장소<사과> b저장소 = new 저장소<>();
        b저장소.setData(new 사과());
        Object num2 = b저장소.getData();

        저장소<감자> c저장소 = new 저장소<>();
        c저장소.setData(new 감자());
        Object num3 = c저장소.getData();

    }
}

// 자료형을 정해 놓지 않는다. -> 제너릭
// 타입매개변수를 사용 -> <타입변수>
// 똑같은 기능인데 타입이 달라 클래스가 여러개 생기는 것을 해결하기 위해 도입
// 일반적으로 자료형은 명확한 것이 좋다. 따라서 Object로 모든 것을 저장하는 것보다
// 가능하면 배열처럼 동일한 자료형끼리 저장하고 사용하는 것이 편하다.
class 저장소<T> {

    private Object data;     // 결국 Object가 T로 변한다. 이는 getData 메서드의 타입형에도 영향을 미친다 (위쪽 참조)

    public void setData(T data) {
        this.data = data;
    }
    public Object getData() {
        return data;       // 결국 Object가 T로 변한다.
    }
}

class 사과 {

}

class 감자 {

}