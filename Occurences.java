import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any sentence:");
        String str = sc.nextLine().toLowerCase();
        int i;
        int[] charCount = new int[256];
        for(i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            
            if (c != ' ')
             {
                charCount[c]++;
             }
       } 
        ArrayList<Integer> output=new ArrayList<>();

        for(i=0;i<charCount.length;i++){
            if(charCount[i]>0){
                 output.add(charCount[i]);
            }
        }
       
         Collections.sort(output, Collections.reverseOrder());

         for(i=0;i<output.size();i++)
         {
            System.out.print(  output.get(i)+" ");
         }

               
    }
    
}
