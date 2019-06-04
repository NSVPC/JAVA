package basics;

class testing_a
{ 
     public void Display() 
     { 
         System.out.println("Base display()"); 
     } 
       
     public static void main(String args[]) 
     { 
         testing_a t1 = new Derived(); 
         t1.Display(); 
     }      
} 

class Derived extends testing_a 
{ 
     @Override
     public void Display() 
     { 
         System.out.println("Derived display()"); 
     } 
} 

