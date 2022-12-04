package chapter8;


class T{
    int weight, height;

    T(int w, int h ){
        weight = w;
        height = h;
    }

    T(){
        weight = -1;
        height = -1;
    }
    int volume(){
        return weight * height;
    }
}

class T2 extends T{
    int width;

    T2(int wi, int w , int h){
        super(w, h);
        width = wi;
    }
}
public class SuperTest {
    public static void main(String[] args) {
        T2 t = new T2(3,4,4);
        int v;
        v = t.volume();
        System.out.println(v);
        System.out.println(t.width);
    }
}
