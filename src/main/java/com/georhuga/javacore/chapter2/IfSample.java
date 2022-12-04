package chapter2;

class IfSample {
    public static void main (String args[]) {
        int x, у;
        x = 10;
        у = 20;
        if(x < у) System.out.print ( "x меньше у " );
        x = x * 2;
        if(x == у) System.out . print ( "x теперь равно у" );
        x = x * 2;
        if (x > у) System . out . print ( "x теперь больше у" ) ;
        if (x == у) System.out . print ( "вы не увидите э того");
    }
}