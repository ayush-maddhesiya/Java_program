

import java.util.Scanner;

        public class palindrome {
        static String f(String s, int idx){
            if(idx == s.length()) return "";
            String small = f(s,idx+1);
            return small + s.charAt(idx);
        }
        //method second.
            static boolean ff(String s, int l, int r){
            if(l >=  r) return true;

            return (s.charAt(l) == s.charAt(r)) && ff(s,l+1,r-1);
            }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

//            String ans =  f(s,0);
//            if(s.equals(ans)){
//                System.out.println("Palindrome");
//
//            }else{
//                System.out.println("not palindrome ");
//            }

            if(ff(s,0,s.length()-1)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("Not pali,..,");
            }
    }
}
