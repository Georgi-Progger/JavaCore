package chapter8;


public class TestEquals {
    public static void main(String[] args) {
        G g1 = new G();
        G g2 = g1;

        System.out.println(g1.equals(g2));
    }
}


class G{
    int i;
}