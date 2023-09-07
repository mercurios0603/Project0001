package day7.Exam2_6;

// 문제 - 저장소 class를 1개만 사용해서 int, double, 사과를 저장해보세요

public class Exam2_6 {
    public static void main(String[] args) {
        저장소 a저장소1 = new 저장소();

        a저장소1.setData(30);
        int idata = (int) a저장소1.getData(); // 상위타입에서 하위타입으로 데이터 이동시에는 명시적 형변환이 필요하다.
        System.out.println(idata);

        a저장소1.setData(5.5);
        double ddata = (double) a저장소1.getData();

        System.out.println(ddata);

        a저장소1.setData(new 사과());
        사과 a사과 = (사과) a저장소1.getData();

        System.out.println(a사과);

//        a저장소1.setData(30);
//        int a = a저장소1.getData();
//
//        a저장소1.setData(new 사과());
//
//        System.out.println(a);
//
//        Double저장소 a저장소2 = new Double저장소();
//
//        a저장소2.setData(5.5);
//        double b = a저장소2.getData();
//
//        System.out.println(b);
//
//        사과저장소 a저장소3 = new 사과저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = a저장소3.getData();
//
//        System.out.println(c);
    }
}


class 저장소 {
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}

class 사과 {
}

//class Int저장소 {
//    private Object data;
//
//    int getData() {
//        return (int)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class Double저장소 {
//    private Object data;
//
//    double getData() {
//        return (double)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//
//
//class 사과저장소 {
//    private Object data;
//
//    사과 getData() {
//        return (사과)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}

