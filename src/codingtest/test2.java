package codingtest;
import java.util.*;

public class test2 {
	 public int[] test2(int[] array, int[][] commands) {
	        int n=0;
	       
	        int[] answer = new int[commands.length];
	        System.out.println(commands.length);
	       
	        for(int i=0; i<commands.length; i++) {
	                int ans[] = new int[commands[i][1]-commands[i][0]+1];
	            for(int j=commands[i][0]-1; j<=commands[i][1]-1;j++){                    
	                     ans[n] = array[j];
	                     n++;                        
	                 }
	                    Arrays.sort(ans);
	                     answer[i] = ans[commands[i][2]-1];  
	                    n=0;
	                  
	                   
	                           
	        }        
	       return answer;
	    }
	       

}
