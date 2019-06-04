package basics;

interface X1 
{ 
     String geek(); 
} 

interface Y1
{ 
     String geek(); 
}


class ABC implements  X1,Y1{

	 public String geek() 
	    { 
	        return "hello"; 
	    } 
}

class exam_1
{
	public static void main(String[] args) {
		ABC t = new ABC();
		System.out.println(t.geek());
		X1 t1 = new ABC();
		System.out.println(t1.geek());
		Y1 t2 = new ABC();
		System.out.println(t2.geek());
		
		 
	}

}
