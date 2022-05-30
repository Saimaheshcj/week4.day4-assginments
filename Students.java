package week4.day3.Assignements;

public class Students {
	
	public void studentInfo(String details) {
		System.out.println("Student: Details");
	}
	
	
	public void studentInfo(int id, String name) {
		System.out.println("id:"+id+""+"name:"+name);
	}
 public void studentInfo(String email, long phonenumber) {
	 System.out.println("email:"+email+""+"phonenumber:"+phonenumber);
 }
 public static void main(String[] args) {
	Students stu=new Students();
	stu.studentInfo("Details");
	
	stu.studentInfo(123, "sai");
	
	stu.studentInfo("sai@email.com", 1234567890l);
}
		// TODO Auto-generated method stub
	
	}


