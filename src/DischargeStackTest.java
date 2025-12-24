public class DischargeStackTest {
    public static void main(String[] args){
        DischargeStack s1 = new DischargeStack();
        //add element
        s1.push(new DischargeRecord(100));
        s1.push(new DischargeRecord(200));
        s1.push(new DischargeRecord(300));
        s1.push(new DischargeRecord(400));
        s1.push(new DischargeRecord(500));
        System.out.println("All person added ");
        s1.printStack();


        System.out.println("popped data "+ s1.pop());    //delete element
        System.out.println("popped data " + s1.pop());   //last in first out
        System.out.println("all test pass");

        s1.printStack();


    }
}
