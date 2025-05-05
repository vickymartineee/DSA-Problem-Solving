package DataStructs.stacks;

public class Demo {
    public static void main(String[] args) {
        StackImpl s = new StackImpl(3);
        s.push(1);
        s.push(2);
        boolean f = s.push(34);
        System.out.println(f);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
