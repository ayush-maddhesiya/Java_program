public class selection {
    //by me
    static void selectionSort(int[] array)
    {
        int idx = array.length-1;
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[j]>array[max]){
                    max = j;
                }
            }
            if(idx != max){
                int temp = array[idx];
                array[idx] = array[max];
                array[max] = array[idx];
                idx--;
            }
        }
    }
//by teacher.
    static void ss(int[]  array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i; j < n; j++) {
                if(array[j] < array[min_idx]){
                    min_idx = j;
                }

            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
       // int[] arr = new int[n];
        int array[] = {21,31,34,66,90,10};
        //selectionSort(array);
        ss(array);
        for (int nn :
                array) {
            System.out.print(nn + " ");
        }
    }
}
