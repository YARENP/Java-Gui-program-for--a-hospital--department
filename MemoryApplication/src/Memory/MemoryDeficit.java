package Memory;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Improvement.*;
public abstract class MemoryDeficit implements Improvement{
    protected String memoryLoss;
    protected String deficitId;
   
    private static int totalDeficit=0;

    public MemoryDeficit(String deficitId,String memoryLoss) {
        this.deficitId = deficitId;
        this.memoryLoss = memoryLoss;
       
        totalDeficit++;
    }

    @Override
    public String toString() {
        return "Deficit ID: " + deficitId + "\nMemory Loss: " 
                + memoryLoss ;
    }

    public static int getTotalDeficit()
    {
        return totalDeficit;
    }
    
    public boolean findID(String deficitId){
        if(this.deficitId.equals(deficitId))
            return true;
        else
            return false;                            
     }
}
