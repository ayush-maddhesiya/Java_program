import java.util.Scanner;

public class reverseString {
    static String f(String s, int idx){
        if(idx == s.length()) return " ";
        String small = f(s,idx+1);
        return small + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans =  f(s,0);
        System.out.println(ans);
    }
}
