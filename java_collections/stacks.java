import java.util.Stack;
 
public class stacks {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}