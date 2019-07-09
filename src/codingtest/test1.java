package codingtest;

import java.util.*;
    public class test1{
    
    
    
    
        public String test1(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i]))
               return answer = participant[i];
                
        }
        
        return participant[participant.length-1];
        
    }
}

