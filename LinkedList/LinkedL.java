public class LinkedL{

    Node head;

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
        curr.next = head;
        head = curr;

    }

    public void printLL(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        
        LinkedL ll = new LinkedL();
        ll.addFront(1);
        ll.addFront(2);
        ll.addFront(3);
        ll.printLL();
    }
}