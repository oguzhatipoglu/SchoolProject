public class TreatmentRequest {
    int patientID;
    long arrivalTime;
    boolean isPriority;

    public TreatmentRequest(int patientID ,  boolean isPriority){
        this.arrivalTime = System.currentTimeMillis(); //CURRENT TİME
        this.patientID = patientID;
        this.isPriority = isPriority;
    }
}
