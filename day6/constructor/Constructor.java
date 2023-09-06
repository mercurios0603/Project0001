package day6.constructor;

public class Constructor {
    public static void main(String[] args) {

        Car car1 = new Car();

        Person p1 = new Person(20, "홍길동", car1);

        // 올바른 데이터 세팅 <---- 반.드.시 필요한 것. 이 과정이 없으면 객체는 무쓸모하다.
        // 객체 초기화(initialize)
//        p1.age = 20;
//        p1.name = "홍길동";
//
//        // p1에게
//        p1.mycar = new Car();
        
        // 객체 초기화를 조금 더 편하게 개선하는 방법 -> 메서드(함수)로 제작


        // 객체의 함수는 데이터를 이용해서 기능을 수행.
        // 데이터가 있어야 함수가 올바르게 작동한다.

        p1.introduce();
        p1.drive();

        // 객체를 만들면 묻지도 따지지도 않고 그냥 실행해버리는 메서드??? -> 생성자
        // 생성자를 사용하면 객체를 초기화하는 데 별도의 초기화 메서드나 코드가 필요하지 않습니다.
        // 생성자는 객체가 생성될 때 자동으로 호출되며, 이곳에서 객체의 초기 상태를 설정하거나 초기화할 수 있습니다.
        // Person p1 = new Person(); // Person() -> 메서드(생성자)

    }
}

class Person {
    int age; // 0
    String name; // null
    Car myCar; // null

    // 생성자
    // 리턴타입 X (즉 void 부분을 사용하지 않는다는 뜻, 메서드명은 클래스명과 동일)

    public Person(int age, String name, Car myCar) {
        System.out.println("사람 한명 생성");
        // 함수는 자기 것을 우선적으로 사용하기 떄문에 인스턴스 변수를 가리키기 위해 this를 사용한다.
        this.age = age; // 좌변의 this.age는 int age고, 우변의 age는 입력값 int age다.
        this.name = name; // 이하동문
        this.myCar = myCar;  // 이하동문
    }

//    public void init(int age, String name, Car myCar) {
//        age = age;
//        name = name;
//        myCar = myCar;
//    }

    public void introduce() {
        System.out.printf("안녕하세요 저는 %d살 %s 입니다.", age, name);
    }

    public void drive() {
        myCar.use();
    }
}

class Car {
    public void use() {
        System.out.println("자동차를 타고 나갑니다");
    }
}
