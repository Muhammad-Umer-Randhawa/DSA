public class FirstExample{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,7,-2,2,9,0};
        int n = arr.length;
        print(arr);
        // for(int j=0; j< n-1; j++){ //n-1 passes  
        //     for(int i=0; i< n-1-i; i++){
        //         if(arr[i] >= arr[i+1]){
        //             int temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //     }
        // }


        //Bubble sort optimised
        for(int i=0; i< n-1; i++){ //n-1 passes
            boolean isSorted = true;
            for(int j=0; j< n-1; j++){
                if(arr[j] > arr[j+1]){
                    isSorted = true;
                    break;
                }
            }
            if(isSorted == true) break;
            for(int j=0; j< n-1-i; j++){
                if(arr[j] <= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}