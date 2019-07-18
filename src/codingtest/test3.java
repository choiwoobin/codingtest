package codingtest;

import java.util.*;
class test3 {
  public String test3(int a, int b) {
       String answer = "";
      Calendar cal = Calendar.getInstance();
       cal.set(Calendar.YEAR,Integer.parseInt("2016"));
       cal.set(Calendar.MONTH,a-1);
       cal.set(Calendar.DATE,b);
      
   switch(cal.get(Calendar.DAY_OF_WEEK)){
       case 1: 
            answer ="SUN";
            break;
           
       case 2:
            answer ="MON";
           break;
       case 3: 
            answer ="TUE";
            break;
        case 4: 
            answer ="WED";
            break;
        case 5: 
            answer ="THU";
            break;
        case 6: 
            answer ="FRI";
            break;
        case 7: 
            answer ="SAT";
            break;
   }

    
      return answer;
  }
}