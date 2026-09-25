public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
    public static void hanoi(int n, char a, char b, char c){
        if(n == 1){
            System.out.println(a + " -> " + c);
            return;
        }
        
        // Take n-1 disk from a to b via c
        hanoi(n-1, a, c, b);
        // Largest disk from a to c
        System.out.println(a + " -> " + c);
        // Take n-1 disk from b to c via a
        hanoi(n-1, b, a, c);
    }
}
