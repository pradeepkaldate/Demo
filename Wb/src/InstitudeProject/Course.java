package InstitudeProject;

public class Course {
	int id;
	 String name;
	 double fee;
	 public Course(int id,String name,double fee)
	 {
	     this.id=id;
	     this.name=name;
	     this.fee=fee;
	 }
	 public int getId()
	 {
	     return id;
	 }
	 public String getName()
	 {
	     return name;
	 }
	 public double getFee()
	 {
	     return fee;
	 }
}
