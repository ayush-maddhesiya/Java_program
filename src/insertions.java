public class insertions {
    static void sort(int[] a)
    {
        int n  = a.length;
        for (int i = 1; i < n; i++)
        {
            int j = i;
            while( j > 0 && a[j] < a[j-1])
            {
                //swap j and j-1 idx
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {12,9,3,1,0};
        sort(a);
        for (int n :
                a) {
            System.out.print(n + " ");
        }
    }
}

