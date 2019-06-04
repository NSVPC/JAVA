package basics;

import java.util.Scanner;
import java.util.*;

public class test_hackkerrankp1 {


    static boolean isAnagram(String a, String b) {
        Map<Character,Integer> m = new  HashMap<Character,Integer>();
        Map<Character,Integer> m1 = new  HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++)
        {
            Character c = a.charAt(i);
            Integer value = m.get(c);
            if(value==null)
            {
                m.put(c,1);
            }
            else
            {   value=value+1;
                m.put(c,value);
            }
        }

        for(int i=0;i<b.length();i++)
        {
            Character c = b.charAt(i);
            Integer value = m1.get(c);
            if(value==0)
            {
                m1.put(c,1);
            }
            else
            {   value=value+1;
                m1.put(c,value);
            }
        }
        if(m.equals(m1))
        {
             return true;
        }
        else{
            return false;
        }

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
