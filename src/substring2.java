import java.util.Scanner;

public class substring2 {
    static void printsub(String s,String currAns){
        if(s.length() ==  0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remans = s.substring(1);
        printsub(s,currAns+curr);
        printsub(s,currAns);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        printsub(s," ");
    }
}
