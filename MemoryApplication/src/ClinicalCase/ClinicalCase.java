/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClinicalCase;

public class ClinicalCase {
    private String patient_id;
    private String patient_name;
    private String patient_surname;
    private int age;
    private String gender;

    public ClinicalCase(String patient_id, String patient_name, 
            String patient_surname, int age, String gender) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_surname = patient_surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPatient id: " + patient_id + "\nPatient Name: "
                + patient_name + "\nPatient Surname: " + patient_surname
                + "\nAge: " + age +"\nGender: " +gender;
       
    }
  
}
