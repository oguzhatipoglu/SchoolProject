public class TreamentRequeast {
    int patientID;
    long arrivalTime;

    public TreamentRequeast(int patientID , long arrivalTime){
        this.arrivalTime = System.currentTimeMillis();
        this.patientID = patientID;
    }
}
