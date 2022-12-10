package Module2.bracketsTask;

import java.util.*;

public class Problem {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Deque<Character> deque = new LinkedList<>();
        for (char ch: str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                }
            }
        }
        System.out.println(deque.isEmpty());
    }
}
