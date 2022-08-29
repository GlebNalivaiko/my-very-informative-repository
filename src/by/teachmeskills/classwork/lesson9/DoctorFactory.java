package by.teachmeskills.classwork.lesson9;

public class DoctorFactory {
    public static Doctor getDoctorByMedicalPlan(MedicalPlan medicalPlan) {
    //    if (medicalPlan.getCode()>2) {
      //      return new Terapeft();
        //}
       // return new Surgeon();
        switch (medicalPlan.getCode()){
            case 1->{
                return new Terapeft();
            }
            case 2->{
                return new Dantist();
            }
        }
        return new Surgeon();
    }
}
