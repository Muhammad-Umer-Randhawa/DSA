class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class NodeArray {
    public static void main(String[] args) {
        Node[] arr = new Node[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node(i + 1);
        }
        traverse(arr, 0);
    }
    public static void traverse(Node[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index].data + " ");
        traverse(arr, index + 1);
    }
}