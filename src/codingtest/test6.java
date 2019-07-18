package codingtest;
import java.util.*;

public class test6 {	
	
	  public int[] solution(int[] arr, int divisor) {	     
	      int n=0;
	      int[] tmp = new int[arr.length];
	      Arrays.sort(arr);
	      for(int i = 0; i < arr.length; i++){         
	          if(arr[i]%divisor == 0){
	              tmp[n] = arr[i];
	              n++;
	          }
	      }
	      int[] answer = new int[n];
	      if(n==0){
	        answer = new int[1];
	          answer[0] = -1;
	      }
	        
	      else{
	        for(int i=0; i<n;i++)
	            answer[i] = tmp[i];
	      }
	      
	      
	          
	      return answer;
	  }
	}

