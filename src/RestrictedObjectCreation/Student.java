package RestrictedObjectCreation;

public class Student {
	private String name;

	static int a;
	private static Student StudentObj;
	public static int count =0;
	
	private Student(){
		
		name="test" + count;
		
		System.out.println("private Constructor invoked" + name);
		count++;
	}
	
	
	
	public static Student objCreation (){
		
		if(count <=3){
			
					StudentObj =new Student();
					
					return StudentObj;
			 
		}else{
			return StudentObj;
		}
	}
	
	public static void main(String[] args) {
		Student.objCreation();
		Student.objCreation();
		Student.objCreation();
		Student.objCreation();
		
		System.out.println("test"+ Student.objCreation().name);
		
	}
	
}
