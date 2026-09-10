public class ToCharArray{
    public static void main(String[] args){
        String s = "Hello World!";
        char[] arr = s.toCharArray();
        for(char ch:arr){
            System.out.print(ch);
        }
    }
}