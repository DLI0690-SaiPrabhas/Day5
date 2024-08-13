import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        List<Integer> stack=new Stack<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stack size: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            stack.add(sc.nextInt());
        }
        System.out.println(stack);

        String str="(sa(i))";
        char[] ch=str.toCharArray();
        int count=0;
        for(char c:ch){

            if(c=='('){
                count++;
            } else if (c==')') {
                count--;

            }

        }
        if(stack.isEmpty()){
            System.out.println("Parenthesis is balanced");
        }

    }
}
