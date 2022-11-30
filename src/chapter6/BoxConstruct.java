package chapter6;


class Box{
    double w;

    Box(double w1){
        System.out.println("Конструирование ");
        w = w1;
    }

}
public class BoxConstruct {
    public static void main(String[] args) {
        Box b = new Box(10);
        System.out.println(b.w);
    }
}
