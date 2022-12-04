package chapter6;


class Box{
    double w;

    Box(double w){
        System.out.println("Конструирование ");
        this.w = w;
    }

}
public class BoxConstruct {
    public static void main(String[] args) {
        Box b = new Box(10);
        System.out.println(b.w);
    }
}
