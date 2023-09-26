import java.util.Scanner;

public class string01 {
    static String remove(String str, int idx){
        //base case.
        if(idx == str.length()){
            return "";
        }
        //recursion.
        String small = remove(str,idx+1);
        //self work.
        char c = str.charAt(idx);

        if(c != 'a'){
            return c+small;
        }
        else{
            return small;
        }


    }
    static void printRev(String str){
        if(str.length() == 0) return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans =  remove(s,0);

        System.out.println(ans);
    }
}
