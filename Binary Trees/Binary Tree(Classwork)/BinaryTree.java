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
    public BinaryTree right(){
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
    public static void main(String[] args){
        BinaryTree t1 = new BinaryTree('a');
    }
}