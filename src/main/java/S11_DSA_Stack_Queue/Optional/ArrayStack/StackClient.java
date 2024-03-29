package S11_DSA_Stack_Queue.Optional.ArrayStack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(6);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        System.out.println("pop elements: " + stack.pop());
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
