/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Memory;
import ClinicalCase.*;

public class Amnesia extends MemoryDeficit {
    private String amnesiaType;
    private String cause;
    private String location;
    private static int totalAmnesia=0;
    
    private ClinicalCase clin;

    public Amnesia(String deficitId,String memoryLoss,
            String amnesiaType, String cause, String location,
            String patientId, String patientName, 
            String patientSurname,int age, String gender) {
        super(deficitId,memoryLoss);
        this.amnesiaType = amnesiaType;
        this.cause = cause;
        this.location = location;
        clin = new ClinicalCase(patientId,patientName,
                patientSurname,age, gender);
        totalAmnesia++;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + clin + 
                "\nAmnesia Type: " + amnesiaType + 
                "\nCause: " + cause + "\nLocation: " + location;
    }
    
    public static int getTotalAmnesia()
    {
        return totalAmnesia++;
    }

    @Override
    public String improveMemory() {
        return "\nLook old photos!!";
    }
}
