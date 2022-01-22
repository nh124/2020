public class Node {
    int data;
    Node node;

    public Node(int data){
        this.data = data;
        this.node = null;
    }
    public void setData(Node node ){
       this.node = node;
    }
    public Node getData(){
        return node;
    }
}
