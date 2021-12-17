public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if(top==5)
            System.out.println("Overflow");
        else{
            stack[top] = data;        
            top++;
        }    
    }

    public void pop(){
        if(top==0){
            System.out.println("Underflow");
        }
        else{
            int data = stack[top-1];
            stack[top-1]=0;
            top--;
            System.out.println("popped :"+data);
        }
    }

    public void show(){
        for(int i: stack){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
    }
}
