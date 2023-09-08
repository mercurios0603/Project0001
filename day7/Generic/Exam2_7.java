package day7.Generic;

public class Exam2_7 {
    public static void main(String[] args) {
        저장소<Integer> a저장소 = new 저장소<>();

        a저장소.setData(30);
        int idata = a저장소.getData();

        System.out.println(idata);

        저장소<Double> b저장소 = new 저장소<>();

        b저장소.setData(5.5);
        double ddata = b저장소.getData();

        System.out.println(ddata);

        저장소<사과> c저장소 = new 저장소<>();

        c저장소.setData(new 사과());
        사과 a사과 = c저장소.getData();

        System.out.println(a사과);
    }
}

class 저장소<T> {
    private T data;

    public void setData(T inputedData) {

        this.data = inputedData;
    }

    public T getData() {

        return data;
    }
}
class 사과 {
}
