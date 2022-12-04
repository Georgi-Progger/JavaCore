package chapter7;

public class RetOb {
    public static void main(String[] args) {
        Test2 t1 = new Test2(2);
        Test2 t2 = t1.incrByTen();

        System.out.println(t2.a);
    }
}

class Test2{
    int a;

    Test2(int a){
        this.a =a;
    }

    Test2 incrByTen(){
        Test2 t = new Test2(a + 10);
        return t;
    }

}