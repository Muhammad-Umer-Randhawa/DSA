public class ReverseStringBuilder{
    public static void main(String[] args){
        String s = "Pakistan";
        StringBuilder sb = new StringBuilder(s);
       // sb.reverse(); --> to reverse
       sb.deleteCharAt(2);
       System.out.println(sb);
    }   
}