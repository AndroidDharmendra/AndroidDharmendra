package JavaProgram;


public class Surgeon {

    public void treatPatient(){
        System.out.println("Surg Class");
    }

    public static void main(String[] args){
        Surgeon doc = new Surgeon();
        doc.treatPatient();

    }
    
}

// class Run{
//     public static void main(String[] args){
//         Doctor doc = new Surgeon();
//         doc.treatPatient();

//     }
// }
