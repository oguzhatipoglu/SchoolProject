public class PatientList {
    private class Node{
        Patient variable;
        Node next;

        Node (Patient variable){
            this.variable = variable;
            this.next = null; } }

    private Node head;


    public void addPatient(Patient variable){   //adding list
        Node a1 = new Node(variable);
        if( head== null){  //if empty list
            head = a1;
            return;}   //we need a return otherwise it will be a infinite loop
        Node temp = head;
        while (temp.next != null){ //Not empty this list
            temp = temp.next; }
        temp.next = a1; }



    public void removePatient(int id){      //remove list
        if (head == null){
            System.out.println("This is a empty list ");
            return; }
        Node temp = head;
        Node prev = null;
        while ( temp != null && temp.variable.id != id){   //We search a patient id
            prev = temp;
            temp = temp.next; }
        if (prev == null){    //THİS İS A FİRST PATİENT IN THİS LİST
            head = temp.next; }
        else if (temp == null) {
            System.out.println("Not found");
            return; }
        else {
            prev.next = temp.next;
        }
    }

    public Patient findPatient(int id){    //SEARCH A PATİENT
        Node temp = head;
        while(temp != null){
            if(temp.variable.id == id){
            return temp.variable; }
            temp = temp.next; }
        return null;
    }

    public PatientList(){    //refresh list
        this.head = null;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println("Name: " + temp.variable.name + ", ID: " + temp.variable.id +
                    ", Age: " + temp.variable.age + ", Severity: " + temp.variable.severity );
            temp =temp.next; } }
}
