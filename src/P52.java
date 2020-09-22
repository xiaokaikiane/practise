import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class P52 {
    public static boolean func(String s){
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(stack.peek()!=map.get(s.charAt(i))||stack.isEmpty()){
                    return false;
                }else if (stack.peek()==map.get(s.charAt(i))){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(func(s));
    }
}
