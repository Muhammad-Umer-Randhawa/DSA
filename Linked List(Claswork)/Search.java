public class Search {
    public static void main(String[] args) {
        
    }
    public static boolean search(Node start, int x){
        if(start == null){
            return false;
        }
        if(start.val == x){
            return true;
        }
        Node p = start;
        while(p != null){
            if(p.val == x) return true;
            p = p.next;
        }
        return false;
    }
}