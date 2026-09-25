import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.print(generateParenthesis(4)+" ");
    }
    public static void generate(int n, int l, int r, String s, List<String> ans) {
        if(r==n){ //base case
            ans.add(s);
            return;
        }
        if(l<n) generate(n, l+1, r, s+"(", ans);
        if(r<l) generate(n, l, r+1, s+")", ans);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }
}
