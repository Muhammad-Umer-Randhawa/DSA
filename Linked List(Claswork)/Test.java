class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class Test {
    public static Node insert(Node start, int val){
        if(start == null || start.data > val){ 
            start = new Node(val, start);
        }
        Node p = start;
        while(p != null){
            if(p.next.data > val){
                break;
            }
            p = p.next; // else
        }
        p.next = new Node(val, p.next);
        return start;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        for(int i = 2; i <= 10; i++){
            insert(list1, i);
        }

        Node list2 = new Node(100);
        for(int i = 101; i <= 105; i++){
            insert(list2, i);
        }   

        //sum of both lists;
        int sum = 0;
        for(Node p = list1; p != null; p = p.next){
            for(Node q = list2; q != null; q = q.next){
                sum += p.data + q.data;
            }
        }
        System.out.println(sum);

        //print even numbers only from list1;
        for(Node r = list1; r != null; r = r.next){
            if(r.data % 2 == 0){
                System.out.print(r.data + " ");
            }
        }
        
        //replace 104 in list2 with 2000;
        Node a = list2;
        while(a != null){
            if(a.data == 104){
                a.data = 2000;
                break;
            }
            a = a.next;
        }

        //save the data of list1 in an array;
        int count = 0;
        Node s = list1;
        while(s != null){
            s = s.next;
            count++;
        }
        s = list1;
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = s.data;
            s = s.next;
        }
        
        Node list3 = new Node(arr[9]);
        list3.next = new Node(arr[8]);
        list3.next.next = new Node(arr[7]);
        list3.next.next.next = new Node(arr[6]);
        list3.next.next.next.next = new Node(arr[5]);
        list3.next.next.next.next.next = new Node(arr[4]);
        list3.next.next.next.next.next.next = new Node(arr[3]);
        list3.next.next.next.next.next.next.next = new Node(arr[2]);
        list3.next.next.next.next.next.next.next.next = new Node(arr[1]);
        list3.next.next.next.next.next.next.next.next.next = new Node(arr[0]);

    }
}