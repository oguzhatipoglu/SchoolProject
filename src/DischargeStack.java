public class DischargeStack {

    private static class Node{
        DischargeRecord data;
        Node next;
        Node (DischargeRecord data){
            this.data = data;
            this.next= null; }
    }
    private Node top;     //the top of stacks
    public DischargeStack(){
        this.top = null; }

    public void push(DischargeRecord data){     //add a element of stack
        Node p1 = new Node(data);
        p1.next = top;
        top = p1; }
    public DischargeRecord pop(){      //delete an element
        if(top == null){     //it is a empty list
            return null; }
        DischargeRecord d2 = top.data;
        top = top.next;
        return d2; }
    public DischargeRecord peek(){       //it show the top element
        if(top== null){    //if it is correct it will be a empty list
            return null; }
        return top.data;
        }

    public void printStack(){     //print element
        System.out.println();
        Node temp = top;
        while (temp != null){
            System.out.println("Patient ID: " + temp.data.patientID + " Discharge time: " + temp.data.dischargeTime);
            temp = temp.next;
        }
    }



}
