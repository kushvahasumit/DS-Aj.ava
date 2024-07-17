package arrays;

// stack implimentaion 2 pointer & Array
public class stackimp {
    int[] stack;
    int top;
    int size;

    // constructor 
    public stackimp(int sizestack){
            stack = new int[sizestack];
            size = sizestack;
            top = -1;
    }


    // push 
    public void push(int el){
        if(top >= size){
            System.out.println("stack is full - Overflow");
            return ;
        }
        top++;
        stack[top] = el;
    }

    public boolean isEmpty(){
        return top <= -1;
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }


    public int pop(int el){
        int peek = peek(); // get the top element 
        
        if(peek != Integer.MIN_VALUE){
            top--;
        }

        
        return peek;
    }

    public void printStack(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println( " ");
    }


    public static void main(String[] args) {
        int n = 5;
        stackimp stack = new stackimp(n);
        System.out.println("isEmpty :" + stack.isEmpty());
        stack.push(5);
        stack.printStack();
        stack.push(7);
        stack.printStack();
        stack.pop(7);
        stack.printStack();
        stack.push(5);
        stack.printStack();
        stack.push(7);
        stack.printStack();
        stack.pop(7);
        stack.printStack();

    }
}
