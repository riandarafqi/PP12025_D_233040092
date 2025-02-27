package pertemuan4;

public class Node {
    private double data;
    private Node next;

    // Inisialisasi atribut node
    public Node(double data) {
        this.data = data;
    }

    // Getter & Setter
    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}