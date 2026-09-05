import java.util.ArrayList;
//import java.util.Collections;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        // System.out.println(arr.get(2));
        // arr.set(2, 50);
        // System.out.println(arr.get(2));

        // int n = arr.size();
        // for(int i=0; i<n; i++){
        //     System.out.print(arr.get(i) + " ");
        // }
        // for(int i : arr){
        //     System.out.print(i + " ");
        // }

        //Arraylist can be reversed by two methods
        //Method 1:

        // Collections.reverse(arr);
        // System.out.println(arr);

        //Method 2:
        int i = 0; int j = arr.size() - 1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.print(arr);
    }
}
