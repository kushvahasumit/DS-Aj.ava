package arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// implement q using stack
public class stackq {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enq(int x){
        stack1.push(x);
    }

    public int deq(){
        if(stack1.isEmpty()) return -1;

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int val = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return val;
    }

    public int peek() {
        if (stack1.isEmpty())
            return -1;

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int val = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return val;
    }


    public static void main(String[] args) {
        // Queue<Integer> kyu = new LinkedList<>();
        // kyu.add(5);

        stackq kyu = new stackq();
        kyu.enq(4);
        kyu.enq(5);
        kyu.enq(6);
        kyu.enq(7);
        System.out.println(kyu.deq());
        kyu.enq(1);
        System.out.println(kyu.peek());
        

    }
}
