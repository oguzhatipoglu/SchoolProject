public class Patient {
    public String name;
    public int id;
    public int age;
    public int severity;

    public Patient(String Name  , int age , int id, int severity){
        this.name = Name;
        this.id = id;
        this.age = age;
        this.severity = severity;
    }
    public String toString() {     //we need a 4th task
        return "Name: " + name  + "  - Age: " + age + "   - ID: " + id + "    - Severity: " + severity ;
    }
}
