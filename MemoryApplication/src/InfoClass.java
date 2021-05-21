
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Memory.*;
public class InfoClass {
    public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<MemoryDeficit>();
    
    //adds the specified Memory into the list
    public static void addMemory(MemoryDeficit def)
    {
        memoryArrayList.add(def); 
    }
    
    //returns all the Memory(s) 
    public static String getAllMemory() {
      String result = "";

      for (int i = 0; i < memoryArrayList.size(); i++) {
         result += memoryArrayList.get(i).toString() + "\n";
      }
      return result;
   }
    
   public static String getAmnesia()
   {
       String result = "";
       for(int i = 0; i < memoryArrayList.size(); i++)
           if(memoryArrayList.get(i) instanceof Amnesia)
               result += memoryArrayList.get(i).toString() + "\n";
       return result;
   }
   
   public static String getAlzheimer()
   {
       String result = "";
       for(int i = 0; i < memoryArrayList.size(); i++)
           if(memoryArrayList.get(i) instanceof Alzheimer)
               result += memoryArrayList.get(i).toString() + "\n";
       return result;
   }
   
   public static MemoryDeficit searchMemory(String id){
       for(int i=0; i<memoryArrayList.size(); i++)
        {
            MemoryDeficit m = memoryArrayList.get(i);
            if(m.findID(id)){
                memoryArrayList.get(i);
                return m;
            }
        } 
       return null;
    }
    
    public static String showTotalMemory()
    {
        return "" + MemoryDeficit.getTotalDeficit();
    }
    
    public static String showImprovement()
    {
        String result = "";
        for(int i=0; i < memoryArrayList.size(); i++)
            result += memoryArrayList.get(i).improveMemory();
        
        return result;
    }
}
