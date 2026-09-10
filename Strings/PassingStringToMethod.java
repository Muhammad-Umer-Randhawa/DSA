public class PassingStringToMethod {
    public static void main(String[] args) {
        String x = "Bye";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    public static void change(String x) {
        x = "Hello";
    }
}
