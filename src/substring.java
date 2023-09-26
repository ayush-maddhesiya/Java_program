import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//i dont way this is not working ,.
public class substring {
    static ArrayList<String> f(String s){
        ArrayList<String> ans  = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char c = s.charAt(0);
        ArrayList<String> smallans = f(s.substring(1));

        for (String dd :
                smallans) {
            ans.add(dd);
            ans.add(smallans + dd);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        //String[] arr ;
        ArrayList<String> ans  = f(s);
        for (String ss: ans
             ) {
            System.out.println(ss);
        }




    }
}
