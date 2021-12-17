public class LinkedList {
    Node head;

    public void append(int data){
        Node node = new Node(data); 
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head; //temporary variable to traverse
            while(n.next != null){
                n = n.next;
            }
            n.next = new Node(data);
        }
    }

    public void appendBeg(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void appendAt(int index, int data){
        Node node = new Node(data);
        node.next = null;
        if(index == 0){
            appendBeg(data);
        }
        else{
            Node n = head;
            for(int i=0; i< index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleted :"+n1.data);
            n1 = null;
        }
    }

    public void display(){
        Node node = head;
        while(node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(8);
        ll.appendBeg(1);
        ll.appendAt(2, 30);
        ll.deleteAt(2);
        ll.display();
    }
}



