import java.util.Objects;

public class BinaryTree{
    Object root;
    BinaryTree left, right;
    public BinaryTree(Object root){
        this.root = root;
    }
    public BinaryTree(Object root, BinaryTree left, BinaryTree right){
        this.root = root;
        this.left = left;
        this.right = right;
    }
    public Object getRoot(){
        return root;
    }
    public BinaryTree getLeft(){
        return left;
    }
    public BinaryTree getRight(){
        return right;
    }
    public Object setRoot(Object root){
        this.root = root;
        return root;
    }
    public BinaryTree setLeft(BinaryTree left){
        this.left = left;
        return left;
    }
    public BinaryTree setRight(BinaryTree right){
        this.right = right;
        return right;
    }
    public String toPreString(){
        StringBuffer st = new StringBuffer();
        st.append(root).append(" ");
        if(left != null){ // implicitly trying to call left waly tree ka toString, beduas eleft aik BinaryTree ka object hy and they are recursive, agar left bhi aik tree tu uss mein bhi function call hoga seperately.
            st.append(left.toPreString());
        }
        if(right != null){
            st.append(right.toPreString());
        }
        return st.toString();
    }
    public String toInString(){
        StringBuilder st = new StringBuilder();
        if(left != null)  st.append(left.toInString());
        st.append(root).append(" ");
        if(right != null) st.append(right.toInString());
        return st.toString();
    }
    public String toPostString(){
        StringBuilder st = new StringBuilder();
        if(left != null)  st.append(left.toPostString());
        if(right != null) st.append(right.toPostString());
        st.append(root).append(" ");
        return st.toString();
    }
    public boolean isLeaf(){
        if(left == null && right == null){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
       int count = 1;
       if(left != null) count += left.size();
       if(right != null) count += right.size();
       return count;
    }
    public int height(){
       int l = (left != null) ? 1 + left.height() : 0;
       int r = (right != null) ? 1 + right.height() : 0;
       return Math.max(l, r);
    }
    public BinaryTree search(Object target){
        if(Objects.equals(root, target)){
            return this;
        }
        if(left != null){
            BinaryTree found = left.search(target);
            if(found != null) return found;
        }
        if(right != null){
            BinaryTree found = right.search(target);
            if(found != null) return found;
        }
        return null;
    }
    public boolean contains(Object target){
        return search(target) != null;
    }
    public static void main(String[] args){
    BinaryTree t = new BinaryTree("A",
    new BinaryTree("B"),
    new BinaryTree("C", new BinaryTree("D"), new BinaryTree("E")));
    System.out.println(t.toPreString().trim()); 
    System.out.println(t.toInString().trim());    
    System.out.println(t.toPostString().trim());  
    System.out.println(t.size());                 
    System.out.println(t.height());               
    System.out.println(t.contains("D"));          
    System.out.println(t.contains("Z"));          
    }
}