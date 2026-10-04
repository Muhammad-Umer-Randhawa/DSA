public class CountInversions{
    public static void main(String[] args){
       int[] arr = {10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
       System.out.println(countInversions(arr));
    }
    // public static int countInversions(int[] arr){ // bad approach > T.C = n^2/2
    //      int count = 0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i] > arr[j]) count++;
    //         }
    //     }
    //     return count;
    // }

    //better approach
    static int count;
    public static int countInversions(int[] arr){
        count = 0;
        mergeSort(arr);
        return count;
    }
     public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx = 0; // idx travel karega arr.
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);
    }
    
    public static void merge(int[] a, int[] b, int[] c){
        int i=0; int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else{
                count += (a.length-i); // just had to add this one line
                c[k++] = b[j++];
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}