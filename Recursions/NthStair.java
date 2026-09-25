public class NthStair{
    public static void main(String[] args) {
        
    }
    public static int countWays(int n){
        if(n <= 2) return n; 
        return countWays(n-1) + countWays(n-2);
    }
}