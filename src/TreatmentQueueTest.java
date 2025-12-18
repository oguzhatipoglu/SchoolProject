public class TreatmentQueueTest {
    public static void main(String[] args) {
        TreatmentQueue q1 = new TreatmentQueue();

        q1.enqueue(new TreatmentRequest(1));   //Add a queueu in the list
        q1.enqueue(new TreatmentRequest(2));
        q1.enqueue(new TreatmentRequest(3));
        q1.enqueue(new TreatmentRequest(4));
        q1.enqueue(new TreatmentRequest(5));
        q1.enqueue(new TreatmentRequest(6));
        q1.enqueue(new TreatmentRequest(7));
        q1.enqueue(new TreatmentRequest(8));
        q1.printQueue();
        System.out.println("\n deleting (Dequeue)  ");    //delete first 3 data
        q1.dequeue();
        q1.dequeue();     //first in first out
        q1.dequeue();

        System.out.println("\n Printing Remaining Queue ");
        q1.printQueue();    //Printing remaining
        System.out.println("The current size is: " + q1.size());  //Printing size

    }
}
