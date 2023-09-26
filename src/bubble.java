import java.util.Scanner;

public class bubble {

    static void sortt(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //more optimize array.
    static void bubbleSort(int[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }

            }if(flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
       // int[] arr = new int[5];
        int[] arr = {2,3,4,1,5};
        sortt(arr);
        for (int nn :
                arr) {
            System.out.println(nn);
        }
    }
}
