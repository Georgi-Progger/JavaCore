package chapter2;

public class FirstProgram {
    public static void main(String args[]) {
        int num;
        num = 100;
        System.out.println("Этo переменная num: " + num);
        num = num * 2;
        System.out.print("Знaчeниe переменной num * 2 равно ");
        System.out.println(num);
        IfSample.Calculate();
    }
}

class IfSample {
    public static void Calculate () {
        int x, у;
        x = 10;
        у = 20;
        if(x < у) System.out . println ( "x меньше у " );
        x = x * 2;
        if(x == у) System.out . println ( "x теперь равно у" );
        x = x * 2;
        if (x > у) System . out . println ( "x теперь больше у" ) ;
        if (x == у) System.out . println ( "вы не увидите э того");
    }
}