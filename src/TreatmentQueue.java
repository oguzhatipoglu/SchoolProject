public class TreatmentQueue {
    private class Node{
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data){
            this.data = data;
            this.next = null; }
    }
    private Node rear;    //Last item
    private Node front;   //First item
    private int size;    //Queue size
    public TreatmentQueue(){
        this.front = null;
        this.size = 0;
        this.rear = null;
    }
    public void enqueue(TreatmentRequest data){   // add a element
        Node n1 = new Node( data);
        if (front == null){
            front = n1;
            rear = n1;
            size++;
        }  else {
            rear.next = n1;
            rear = n1;
            size++;
        }

    }
    public TreatmentRequest dequeue(){    //remove element
        if (front == null){   //empty list
            System.out.println("Empty list");
            return null; }
        TreatmentRequest temp = front.data;
        front = front.next;
        size--;
        if (front == null){  //We check did delete a last element
            rear = null; }
        return temp;
    }
    public int size(){
        return size; } // count a queue
    public void printQueue(){
        System.out.println("Print the treatment queue: " );
        Node temp = front;
        while( temp != null){
            System.out.println("Patient ID: " + temp.data.patientID + ". Arrival Time: " + temp.data.arrivalTime);
            temp = temp.next;
        }
    }     //printing queue
}
