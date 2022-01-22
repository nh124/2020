public class LinkedList {
    Node head;
    Node tail;

    public void addData(int data){
        Node newNode = new Node(data);
        if(head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            tail.next = newNode;
            this.tail = head;
        }
    }
    public void print(){

    }
}
