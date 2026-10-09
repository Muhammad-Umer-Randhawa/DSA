class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implementation{
    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(0);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println("Size = " + size(a));
        System.out.println("Sum of values = " + sum(a));
        System.out.println("Product of values = " + product(a));
        System.out.println("Product of only non-zero values is: " + non_zero_product(a));
    }
    public static void display(Node root){
        if(root == null) return; // this method of display can also be attributed to preorder traversal of a binary tree
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){ // for larger values use long etc
        if(root == null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int non_zero_product(Node root){
        if(root == null) return 1;
        if(root.val == 0) return non_zero_product(root.left) * non_zero_product(root.right);
        return root.val * non_zero_product(root.left) * non_zero_product(root.right);
    }
}