package chapter7;

class StaticDemo{
    static int c = 6;
    int a = 6;

    static void call(){
        System.out.println(c);

    }
}

public class StaticByName {
    public static void main(String[] args) {
        System.out.println(StaticDemo.c);
        //System.out.println(StaticDemo.a); Ошибка будет
        StaticDemo.call();
    }
}
