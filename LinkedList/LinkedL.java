public class LinkedL{

    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFront(int data){
        Node curr = new Node(data);

        if(head == null){
            head = curr;
            tail = curr;
        }else{
            curr.next = head;
            head = curr;
        }

    }

    public void addLast(int data){
        Node curr = new Node(data);
        if(tail == null){
            tail = curr;
            head = curr;
        }else{
            tail.next = curr;
            tail = curr;
        }
    }

    public void insertAt(int data, int index){
        Node curr = new Node(data);
        if(index == 0){
            addFront(data);
        }else{
            Node temp = head;
            while(index-->1){
                temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node temp = head.next;
            Node prev = head;
            while(index-->1){
                temp = temp.next;
                prev = prev.next;
            }
            prev.next = temp.next;
            temp.next = null;
        }
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        LinkedL ll = new LinkedL();
        ll.addFront(1);
        ll.addFront(2);
        ll.addFront(3);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.printLL();
        ll.insertAt(100, 4);
        ll.insertAt(200, 0);
        ll.printLL();
        ll.deleteAt(2);
        ll.printLL();
    }
}