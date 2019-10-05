package Test;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(11);
        stack.push(66);
        stack.push(12);
        stack.push(-3);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println();

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println();
        test();
    }

    static void showpush(Stack st, int a)
    {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
    static void showpop(Stack st)
    {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
    public static void test()
    {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try
        {
            showpop(st);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }
}
