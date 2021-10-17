class Param
 {  
    int id;  
    String name;  
    Param(int i,String n)
	{  
     id = i;  
     name = n;  
    }  
   void display()
   {
     System.out.println(id+" "+name);
	}  
 public static void main(String args[])
 {  
    Param param = new Param(111,"Madhushree");  
    Param param = new Param(222,"ganiga"); 
    param.display();  
    param.display();  
   }  
}  