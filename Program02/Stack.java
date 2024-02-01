package Java_Programs.Program02;

public class Stack{
    private int arr[];
    private int capacity;
    private int top;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow");
            System.exit(1);
        }
        else{
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getSize(){
        return top + 1;
    }
    public Boolean isFull(){
        return top == capacity - 1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String [] args){
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.print("Stack: ");
        stack.printStack();
        stack.pop();
        System.out.println("\nAfter Popping out:");
        stack.printStack();
    }
}