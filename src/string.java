import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'a'){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
