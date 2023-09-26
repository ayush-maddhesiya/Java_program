import java.util.Arrays;

public class sortzero {
    //sort zeros sp that all zero al fals in last, in stable sort.


    //by me
    static int[] zero(int[]  a)
    {
        int count = 0;
        int n = a.length;
        //counting the number of zeros in this array .
        for (int i = 0; i < n; i++) {
            if(a[i] == 0){
                count++;
            }
        }

        //new arr to sort.
        int[] aa = new int[n];
        int j = 0;
        for (int i = 0; i < n ; i++) {
            if(aa[i] != 0){
                aa[j++] = aa[i];
            }
        }
        for (int i = n - count; i < n; i++) {
            aa[j++] = 0;
        }
        
        return aa;

    }
    //by teacher
    static void zeroo(int[] a){
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 0){
                count++;
            }
        }//
        for (int k = 1; k <= count; k++) {
            for (int i = 0; i < n-k; i++) {
                int j = i;
                if(a[j] == 0 && a[j+1] != 0 ){
                    //swap.
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0,5,0,3,42};
        //Arrays.sort(a);
         zero(a);
        for (int nn :
                a) {
            System.out.print(nn + " ");
        }
    }
}
