public class HospitalSystemTest {
    public static void main(String[] args){
        HospitalSystem s1 = new HospitalSystem();
        System.out.println("Adding patients: ");    //add patient
        s1.addPatient(new Patient("Oğuz" , 20 , 100 , 10));  //risk
        s1.addPatient(new Patient("Yavuz" , 30 , 101 , 1));
        s1.addPatient(new Patient("Ali" , 40 , 102 , 2));
        s1.addPatient(new Patient("Mehmet" , 50 , 103 , 9)); //risk
        s1.addPatient(new Patient("Cenk" , 55 , 104 , 8)); //risk
        s1.addPatient(new Patient("Can" , 66 , 105 , 3));
        s1.addPatient(new Patient("İsmail" , 52 , 106 , 1));
        s1.addPatient(new Patient("Elif" , 6 , 107 , 4));
        s1.addPatient(new Patient("Ayşe" , 78 , 108 , 5));
        s1.addPatient(new Patient("Deniz" , 22 , 109 , 2));
        System.out.println("All patient added. ");

        s1.printPatientSortedSever();
        System.out.println("Adding treatment request: ");
        s1.addTreatmentRequest(new TreatmentRequest(100 , true));    //priority is true
        s1.addTreatmentRequest(new TreatmentRequest(103 , true));
        s1.addTreatmentRequest(new TreatmentRequest(104 , true));

        s1.addTreatmentRequest((new TreatmentRequest(101,false)));    //priority is false
        s1.addTreatmentRequest((new TreatmentRequest(102,false)));
        s1.addTreatmentRequest((new TreatmentRequest(105,false)));
        s1.addTreatmentRequest((new TreatmentRequest(106,false)));
        s1.addTreatmentRequest((new TreatmentRequest(108,false)));

        System.out.println("Request added: ");

        System.out.println("Processing 4 request (priority first): ");
        s1.processTreatment();
        System.out.println("First patient gone.");
        s1.processTreatment();
        System.out.println("Second patient gone.");
        s1.processTreatment();
        System.out.println("Third patient gone.");
        s1.processTreatment();
        System.out.println("Fourth patient gone.");

        System.out.println("Discharge adding: ");
        s1.dischargeStack.push(new DischargeRecord(107));
        s1.dischargeStack.push(new DischargeRecord(109));
        System.out.println("Discharge added: ");


        System.out.println();
        System.out.println("     Final System State     ");
        s1.printSystem();
    }
}
