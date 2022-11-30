package chapter6;

class Вох2 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo{
    public static void main(String args[]) {
        Вох mybox1 = new Вох();
        Вох mybox2 = new Вох();
        double vol;
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println("объeм равен " + vol);
        vol = mybox2.volume();
        System.out.println("объeм равен " + vol);
    }
}