import java.util.*;
package codingtest;


class test5 {
  public String test5(int n) {
       String answer = "";
       int k=0;
      while(n>0){           
          k=n%3;          
          n = n/3;
          if(k==0){
              k=4;
              n= n-1;
          }
           answer = Integer.toString(k)+answer;
       }
   
    
      return answer;
  }
}