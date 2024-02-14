package InstitudeProject;

public class Student extends Thread {
	String name;
    EducationInstitute institute;
    
    public Student()
    {
    	
    }
    public Student(String name,EducationInstitute institute)
    {
        this.name=name;
        this.institute=institute;
    }
    public synchronized void viewCoursesAndFees()
    {
    	System.out.println("Available Courses");
       for(int i=0;i<institute.course.length;i++)
       {
    	   System.out.println(institute.course[i].id+" "+institute.course[i].name+" Total Fees:"+institute.course[i].fee); 
       }
    }
    public void viewOffers()
    {
    	for(int i=0;i<institute.offers.length;i++)
        {
     	   System.out.println("Offers "+institute.offers[i].getOfferText()+" on"); 
        }
    }
    public void enrolllnCourse(int courseId)
    {
        institute.enrollStudentInCourse(courseId, name);
    }
}
