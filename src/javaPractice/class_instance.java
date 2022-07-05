package javaPractice;

class Calculator {
    static double PI = 3.14;
    static int base = 1;
    int left, right;

    public Calculator(int left, int right) {
        // Constructor 생성자다
        this.left = left;
        this.right = right;
    }

    int v = 10;

    void m() {
        int v = 20;
        System.out.println(this.v); // 클래스의 v이다
        System.out.println(v); // v는 m()안의 v이다
    }

    static void static_instance() {
        System.out.println("static instance");
    }

    void instance_static() {
        System.out.println("instance static");
    }


    public void sum() {
        // base는 static으로 선언되어 클래스 안에서 사용 가능하다
        System.out.println(this.left + this.right * base);
    }
}

public class class_instance {

    public static void main(String[] args) {
        /*
        변수: 상태
        메소드: 행동
        */
        Calculator c1 = new Calculator(10, 20); // new를 사용한 instance 라고 한다
        c1.sum();

        System.out.println(Calculator.base);
        Calculator.base = 20;


        System.out.println("update base: " + Calculator.base);
        System.out.println(c1.PI); // 인스턴스를 통해 PI에 접근
        System.out.println(Calculator.PI); // 클래스를 통해서 PI에 접근

        c1.instance_static(); // instance 메소드 접근
        Calculator.static_instance(); // static은 클래스로 접근

        c1.m();
    }
}
