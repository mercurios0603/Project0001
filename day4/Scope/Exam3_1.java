package day4.Scope;

public class Exam3_1 {
    public static void main(String[] args) {

        // deposit 입금
        // withdraw 출금
        // getRemainder 잔액

        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}

class Account {

    int bank; // 인스턴스 변수 -> 두 함수(메서드)가 공유

    public void deposit (int push) {
        bank = bank + push;
        System.out.printf("%d원을 입금하였습니다.\n", bank);
    }

    public int withdraw (int pull) {  //return을 할 때는 반환하고자 하는 데이터에 맞는 데이터형을 입력해야 함.
        bank = bank - pull;
        System.out.printf("%d원을 출금하였습니다.\n", pull);
        return pull;
    }
    public int getRemainder () {      //return을 할 때는 반환하고자 하는 데이터에 맞는 데이터형을 입력해야 함.
        System.out.printf("잔액은 %d원 입니다.\n", bank);
        return bank;
    }
}
