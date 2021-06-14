
// Default access modifier class
class defaultSpecifier
{ 
void display() 
 { 
     System.out.println("You are using default access specifier"); 
 } 
} 

//Private access modifier class
class privateSpecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 


public class accessModifiers 
{
	public static void main(String[] args) 
	{
		//default access specifier
		System.out.println("Default access specifier");
		defaultSpecifier defObj = new defaultSpecifier(); 		  
		defObj.display(); 
		
		System.out.println();
			
		//private access specifier
		System.out.println("Private access specifier");
		privateSpecifier priObj = new privateSpecifier();      

	}
}





	
		


