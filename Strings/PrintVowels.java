import java.util.Scanner;
public class PrintVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inp = sc.nextLine();
        for(char ele:inp.toCharArray()){
            if(ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u') {
                System.out.println("Vowel found " + ele);
            }
        }
        sc.close();
    }
}