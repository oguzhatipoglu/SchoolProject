public class PatientTest {
    public static void main(String[] args){
        PatientList p = new PatientList();
        System.out.println("Adding a patient : ");
        p.addPatient(new Patient("Oğuz" ,20 , 100 , 10));
        p.addPatient(new Patient("Yavuz" ,30 , 110 , 2));
        p.addPatient(new Patient("Can" ,70, 120 , 4));
        p.addPatient(new Patient("Ahmet" ,90 , 130 , 7));
        p.addPatient(new Patient("Muharrem" ,56, 140 , 1));
        System.out.println("All patient added");
        p.printList();
        //Remove patient
        System.out.println();
        p.removePatient(100);
        System.out.println("Found and remove ");
        p.printList();



        Patient veriable = p.findPatient(120);    //Find patient
        if (veriable == null || !veriable.Name.equals("Can")){  //if veriable isnt equals to Can we will a failed
            System.out.println("Not found patient");
            return; }
        else{
            System.out.println("Found the patient " + veriable.Name);
        }
        System.out.println();
        p.printList();

    }
}
