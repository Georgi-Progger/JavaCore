package chapter8;

class A{
    int i;
    int j;

    void Print(){
        System.out.println(i + j);
    }
}
class B extends A{
    int k;

    void Print(){
        System.out.println(i + j);
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A a1 = new A();
        B b = new B();

        a1.i = 6;
        a1.j = 7;
        a1.Print();

        b.i = 4;
        b.j = 8;
        b.k = 8;
        b.Print();
    }


}
