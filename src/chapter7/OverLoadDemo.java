package chapter7;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad l = new OverLoad();
        l.test();
        l.test(9,8,7);
        l.test(5,6);
        System.out.println(l.h);
    }
}
class OverLoad{
    int g;
    int h;
    int w;

    void test(){
        System.out.println("Hello");
    }
    void test(int g, int h){
        this.g = g;
        this.h = h;
    }

    void test(int g, int h, int w){
        this.g = g;
        this.h = h;
        this.w = w;
    }
}
