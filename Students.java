package week3.day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
		
	}
	public void getStudentInfo(String name,int id) {
		System.out.println(name+ id);
		
	}
	public void getStudentInfo(String email,double phonenumber) {
		System.out.println(email+ phonenumber);
		
	}

	public static void main(String[] args) {
		Students obj=new Students();
		
		obj.getStudentInfo(5);
		obj.getStudentInfo("Usha",1234);
		obj.getStudentInfo("usha@gmail.com",9000904498d);
		
	}

}
