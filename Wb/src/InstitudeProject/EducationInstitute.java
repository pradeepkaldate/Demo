package InstitudeProject;

public class EducationInstitute {
	Course course[]=null;
	  Offer offers[]=null;
	  public EducationInstitute(Course course[],Offer offers[])
	  {
	    this.course=course.clone();
	    this.offers=offers;
	  }
	  public Course[] getCourse()
	  {
	      return course;
	  }
	  public Offer[] getOffer()
	  {
	      return offers;
	  }
	  public void enrollStudentInCourse(int courseId, String studentName)
	  {
		  if(courseId>course.length)
		  {
			 System.out.println("Course not Available "); 
		  }
		  else
			  System.out.println(studentName+" Enroll "+course[courseId-1].name);
	  }
}
