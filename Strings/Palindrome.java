public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        int i = 0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) System.out.println("Not a palindrome");;
            i++;
            j--;
        }
        System.out.println(s + " is a palindrome");
    }
}
