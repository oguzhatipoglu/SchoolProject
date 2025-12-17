public class PatientList {
    private class Node{
        Patient veriable;
        Node next;

        Node (Patient veriable){
            this.veriable = veriable;
            this.next = null; } }

    private Node head;


    public void addPatient(Patient veriable){
        Node a1 = new Node(veriable);
        if( head == null){  //if empty list
            head = a1;
            return;}
        Node temp = head;
        while (temp.next != null){ //Not empty
            temp = temp.next; }
        temp.next = a1; }

    public void removePatient(int id){
        if (head == null){
            System.out.println("This is a empty list ");
            return; }
        Node temp = head;
        Node prev = null;
        while ( temp != null && temp.veriable.id != id){   //We search a patient id
            prev = temp;
            temp = temp.next; }
        if (prev == null){    //THİS İS A FİRST PATİENT
            head = temp.next; }
        else if (temp == null) {
            System.out.println("Not found");
            return; }
        else {
            prev.next = temp.next;
        }
    }

    public Patient findPatient(int id){
        Node temp = head;
        while(temp != null){
            if(temp.veriable.id == id){
            return temp.veriable; }
            temp = temp.next; }
        return null;
    }

    public PatientList(){    //refresh list
        this.head = null;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println("Name: " + temp.veriable.Name + ", ID: " + temp.veriable.id +
                    ", Age: " + temp.veriable.age + ", Severity: " + temp.veriable.severity );
            temp =temp.next;
        }
    }
}
