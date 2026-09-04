class Node{
    Student data;
    Teacher data2;
    Node next;
    Node(Student data, Teacher data2){
        this.data = data;
        this.data2 = data2;
    }
    
    public static void main(String[] args){
        int value = 5;
        Node start = new Node(new Student(20, "Alice"), new Teacher(30, "Bob"));
        for(Node i = start; i != null; i = i.next){
            start.data = i.data;
            start.data2 = i.data2;
            start.next = new Node(start.data, start.data2);
            System.out.print(start.data.name + " ");
        }

        Node p = start;
        for(int i=value; i<=20; i++){
            System.out.println(p.data.name + " " + p.data2.name);
        }


        //CORRECT:

        // Node start = new Node(10);
        // Node curr = start;

        // // Append 5 nodes with incremental values
        // for (int i = 1; i <= 5; i++) {
        //     curr.next = new Node(start.val + i);
        //     curr = curr.next;
        //     System.out.print(curr.val + " ");
        // }
    }
}