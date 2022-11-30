package chapter7;

public class PassOb {
    public static void main(String[] args) {
        Test t = new Test(11,22);
        Test t2 = new Test(11,22);
        Test t3 = new Test(111,222);

        System.out.println(t.equals(t2));
        System.out.println(t2.equals(t3));
    }
}

class Test{
    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equals(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
