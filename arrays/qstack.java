package arrays;

import java.util.LinkedList;
import java.util.Queue;

// implimentaion of stack using q
public class qstack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x){
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        q1.offer(x);

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

    }

    public int pop(){
        if(q1.isEmpty()) return -1;

        return q1.poll();
        
    }

    public int peek() {
        if (q1.isEmpty())
            return -1;

        return q1.peek();
    }

    public static void main(String[] args) {
        qstack kyu = new qstack();
        kyu.push(5);
        kyu.push(7);
        kyu.push(8);
        kyu.push(9);

        System.out.println(kyu.peek());
        kyu.pop();
        System.out.println(kyu.peek());

    }
}
