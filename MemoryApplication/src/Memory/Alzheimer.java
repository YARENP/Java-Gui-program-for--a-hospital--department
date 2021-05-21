/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Memory;
import ClinicalCase.*;

public class Alzheimer extends MemoryDeficit{
    private String decliningArea;
    private static int totalAlzheimer=0;

    private ClinicalCase clin;
    public Alzheimer(String deficitId,String memoryLoss,
            String decliningArea,
            String patientId, String patientName, String patientSurname,
            int age, String gender) {
        super(deficitId,memoryLoss);
        this.decliningArea = decliningArea;
        clin = new ClinicalCase(patientId,patientName,
                patientSurname,age, gender);
        totalAlzheimer++;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + clin + 
                "\nDeclining Area: " + decliningArea;
    }
    
    public static int getTotalAlzheimer()
    {
        return totalAlzheimer;
    }

    @Override
    public String improveMemory() {
        return "\nSolve sudoku puzzles!!";
    }
}
