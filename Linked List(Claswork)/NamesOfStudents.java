import java.util.Scanner;
class Node{
    String name;
    Node next;
    Node(String name){
        this.name = name;
    }
}


public class NamesOfStudents {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        Node n1 = new Node("S1");
        Node n2 = new Node("S2");
        Node n3 = new Node("S3");
        Node n4 = new Node("S4");
        Node n5 = new Node("S5");

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Enter the name you want to search" );
        String name = sc.next();

        search(n1, name);

        sc.close();
    }
    public static void search(Node start, String name){
        for(Node e = start; e != null; e = e.next){
            if(name.equals(e.name)){
                System.out.println("Name found");
                return;
            }
            System.out.println("Name not found");
        }
    }
}
