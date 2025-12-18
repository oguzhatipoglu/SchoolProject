public class TreatmentRequest {
    int patientID;
    long arrivalTime;

    public TreatmentRequest(int patientID){
        this.arrivalTime = System.currentTimeMillis(); //CURRENT TİME
        this.patientID = patientID;
    }
}
