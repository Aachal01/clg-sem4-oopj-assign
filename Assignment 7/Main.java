/*Design a Base class STACK and Handle runtime anomalies like Overflow when the stack is full  and
underflow when the stack is empty.Display error codes and messages by using appropriate
try and catch block to handle the exceptions thrown */
public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();

        try{
            stack1.pop();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            stack1.push(2);
            stack1.push(34);
            stack1.push(29);
            stack1.push(36);
            stack1.push(43);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
