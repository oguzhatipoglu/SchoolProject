public class DischargeStackTest {
    public static void main(String[] args){
        DischargeStack s1 = new DischargeStack();
        //adding element
        s1.push(new DischargeRecord(1));
        s1.push(new DischargeRecord(2));
        s1.push(new DischargeRecord(3));
        s1.push(new DischargeRecord(4));
        s1.push(new DischargeRecord(5));
        System.out.println("All person added ");
        s1.printStack();


        System.out.println("popped data "+ s1.pop());    //delete element
        System.out.println("popped data " + s1.pop());
        System.out.println("all test pass");

        s1.printStack();


    }
}
