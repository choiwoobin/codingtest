import java.util.*;
package codingtest;


class test4 {
  public String test4(String s) {
       String answer;
      char[] tmp=s.toCharArray();
      if(s.length()%2==1)
          answer=Character.toString(tmp[tmp.length/2]);
    
      else
          answer=Character.toString(tmp[tmp.length/2-1]).concat(Character.toString(tmp[tmp.length/2]));
       return answer;
  }
}