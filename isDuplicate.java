import java.util.*;
public class file5 {
    static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.push(ch);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }

}
