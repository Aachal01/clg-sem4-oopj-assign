public class Stack {
    int array[];
    private int MAX_STACK_SIZE = 3;
    int size;

    Stack(){
        array = new int[MAX_STACK_SIZE];
    }

    void push(int value) throws Exception {
        if (size >= MAX_STACK_SIZE) {
            throw new Exception("Stack is full");
        } else {
            array[size++] = value;
        }
    }
    void pop() throws Exception {
        if(size > 0){
            size--;
        }
        else{
            throw new Exception("Stack is empty");
        }
    }
}
