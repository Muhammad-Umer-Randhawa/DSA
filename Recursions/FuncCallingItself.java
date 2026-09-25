public class FuncCallingItself{
    public static void main(String[] args) {
        A(1);
    }
    public static void A(int n){
        if(n==10) return;
        System.out.println("Apple");
        A(n+1);
    }
}