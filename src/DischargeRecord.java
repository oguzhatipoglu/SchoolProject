public class DischargeRecord {
    public int patientID;
    public long dischargeTime;

    public DischargeRecord(int patientID){
        this.patientID =patientID;
        this.dischargeTime = System.currentTimeMillis();
    }
}
