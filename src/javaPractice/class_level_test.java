package javaPractice;


import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

class Employee {
    Employee() {
        System.out.println("cc");
    }

    void work() {
        System.out.println("ww");
    }
}

class PartEmployee extends Employee {
    void work() {
        System.out.println("w2");
    }
}

public class class_level_test {


    public static int update(int x) {
        x = x + 10;
        return x;
    }

    String name = "KIM";

    public String toString() {
        return name;
    }


    public static void main(String[] args) {

        new Employee();
    }
}
