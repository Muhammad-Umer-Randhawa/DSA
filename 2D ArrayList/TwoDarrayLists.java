import java.util.ArrayList;

public class TwoDarrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(4); a.add(5); a.add(6);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(7); b.add(8); b.add(9); b.add(10);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(11); c.add(12); c.add(13); c.add(14);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        // System.out.println(arr);

        //Print using a for loop:
        // for(int i=0; i<arr.size(); i++){
        //     for(int j=0; j<arr.get(i).size(); j++){
        //         System.out.print(arr.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }

        //Print using a for each loop
        for(ArrayList<Integer> list:arr){
            for(int ele:list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}