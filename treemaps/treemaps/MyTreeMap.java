/**
 * This is an example of a treemap. 
 */



package treemaps;

import java.util.*;
public class MyTreeMap  {
    // the Map!
    Map<String, String> phonebook = new TreeMap<String, String>();

    // constructor
    public MyTreeMap(String n[], String nums[]) {
       for(int i=0; i< n.length; i++)
           phonebook.put( n[i], nums[i] );
    }

   public static void main(String[] args) {
       // data
       String [] names = { "Lefty", "Guarav", "Wong", "Rupamay" };
       String [] extns = { "4873", "4810", "3769", "0" };

       // get an instance of this class
      MyTreeMap ex = new MyTreeMap( names, extns );

       // dump out the map
       System.out.println("map:  " + ex.phonebook);

       // get the mappings
       Set<Map.Entry<String,String>> s = ex.phonebook.entrySet();

       // iterate over the mappings
       //   for (Iterator i = s.iterator(); i.hasNext(); ) {
       for (Map.Entry me : s) {
           Object ok = me.getKey();
           Object ov = me.getValue();
           System.out.print("key=" + ok );
           System.out.println(", value=" + ov );
       }
   }
}