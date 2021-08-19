package JavaProgram;

public class Doctor {
    // Concrete method
    public void treatPatient(){
        System.out.println("treatPatient invoked...");

    }

    public static void main(String[] args){
        System.out.println("Doctor class");
        Doctor doc = new Doctor();
        doc.treatPatient();

    }
    
}
