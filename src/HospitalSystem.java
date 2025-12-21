import java.util.ArrayList;
import java.util.HashMap;

public class HospitalSystem {
    PatientList patientList;
    TreatmentQueue priorityQueue;
    TreatmentQueue normalQueue;
    DischargeStack dischargeStack;
    HashMap < Integer , Patient> patientMap;

    public HospitalSystem(){
        patientList = new PatientList();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>(); }

    public void addPatient(Patient data){     //add a element
        patientList.addPatient((data));
        patientMap.put(data.id, data); }
    public void addTreatmentRequest(TreatmentRequest data){
        if(data.isPriority){
            priorityQueue.enqueue(data); }
        else{
            normalQueue.enqueue(data); } }   //add patient

    public Patient processTreatment(){      //checking priority
        TreatmentRequest data;
        if(priorityQueue.size() > 0){
            data = priorityQueue.dequeue(); }
        else if (normalQueue.size() >0 ){
            data = normalQueue.dequeue(); }
        else{
            return null; }
        DischargeRecord d1 = new DischargeRecord(data.patientID);
        dischargeStack.push(d1);
        return patientMap.get(data.patientID); }
    public void printSystem(){
        System.out.println("Patients in the system: ");
        patientList.printList();
        System.out.println();
        System.out.println("Priority treatment: ");
        priorityQueue.printQueue();
        System.out.println();
        System.out.println("Normal treatment: ");
        normalQueue.printQueue();
        System.out.println();
        System.out.println("Discharge data: ");
        dischargeStack.printStack();







    }    //printing data

    public void merge(ArrayList<Patient> list , int right , int mid , int left){
        int rightSize = right - mid;
        int leftSize = mid - left + 1;
        ArrayList<Patient> r1 = new ArrayList<>();
        ArrayList<Patient> l1 = new ArrayList<>();
        for( int index = 0 ; index < rightSize ; index++){
            r1.add(list.get(mid + index + 1));
        }
        for( int index = 0 ; index < leftSize ; index++){
            l1.add(list.get(left + 1)); }
        int rightIndex = 0;
        int leftIndex = 0;
        int mergedIndex = left;
        while (leftIndex <leftSize && rightIndex< rightSize) {
            if (l1.get(leftIndex).severity >= r1.get(rightIndex).severity) {
                list.set(mergedIndex, l1.get(leftIndex));
                leftIndex++;}
            else {
                list.set(mergedIndex, r1.get( rightIndex));
                rightIndex++; }
            mergedIndex++; }

        while (rightIndex < rightSize) {
            list.set(mergedIndex , r1.get(rightIndex));
            rightIndex++;
            mergedIndex++; }
        while (leftIndex < leftSize) {
            list.set(mergedIndex, l1.get(leftIndex));
            leftIndex++;
            mergedIndex++; }









    }
    public void mergeSortBySeverity(ArrayList<Patient> list , int right ,int left){
        if(right>left){
            int mid = (right+ left) / 2;

            mergeSortBySeverity(list,left ,mid);
            mergeSortBySeverity(list , mid +1 , right);
            merge(list, left , mid ,right);
        }
    }
    public void printPatientSortedSever(){
        ArrayList<Patient> p1 = new ArrayList<>(patientMap.values());
        mergeSortBySeverity(p1 ,0 , p1.size() - 1);
        System.out.println();
        System.out.println("Patients sorted by severity(high-low): ");

        for(Patient p : p1){
            System.out.println(p); }

    }

}
