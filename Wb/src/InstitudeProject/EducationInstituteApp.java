package InstitudeProject;

import java.util.Scanner;

public class EducationInstituteApp extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Course c1=new Course(1, "java", 25000);
		Course c2=new Course(2, ".NET", 18000);
		Course course[]= {c1,c2};
		Offer of1=new Offer("25% on java");
		Offer of2=new Offer("15% on .NET");
		Offer offer[]= {of1,of2};
		EducationInstitute e1=new EducationInstitute(course, offer);
		Student s1=new Student("Pradeep", e1);
		Student s2=new Student("Sanskar", e1);
		e1.getOffer();
		//Student ss=new Student();
		Scanner s=new Scanner(System.in);
		Thread t1=new Thread(s1)
				{
			      public synchronized void run()
			      {
			    	  s1.viewCoursesAndFees();
			          s1.viewOffers(); 
			          System.out.println("Enter id to Enroll Course you want ");
			           int id=s.nextInt();
			           s1.enrolllnCourse(id);
			      }
				};
				Thread t2=new Thread(s2)
				{
			      public synchronized void run()
			      {
			    	  s2.viewCoursesAndFees();
			          s2.viewOffers(); 
			          System.out.println("Enter id for Course you want to Enroll");
			           int id=s.nextInt();
			           s2.enrolllnCourse(id);
			      }
				};
				
		     
		 t1.start();
		 t1.join();
		 t2.start();
		 t2.join();
         s.close();
          
         
         
         
	}

}
