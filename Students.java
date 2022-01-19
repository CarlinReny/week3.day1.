package assignment4;

public class Students {

	public void getStudentinfo(int id) {
		System.out.println("Student ID:"+id);
	}
	public void getStudentinfo(String name) {
		System.out.println("StudentName:"+name);
	}
	public void getStudentinfo(long phone,String email) {
		System.out.println("StudentEmail and phone number:"+email);
		System.out.println("Student phNo:"+phone);
	}
	public  void main(String[] args) {

		Students S =new Students();
		S.getStudentinfo(15);
		S.getStudentinfo("carlin");
		S.getStudentinfo(988786789, "email@email.com");

	}

}
