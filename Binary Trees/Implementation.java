class Node{
    Object val;
    Node left;
    Node right;
    Node(Object val){
        this.val = val;
    }
}
public class Implementation{
    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);

        System.out.println();

        System.out.println("Size = " + size(a));
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
}