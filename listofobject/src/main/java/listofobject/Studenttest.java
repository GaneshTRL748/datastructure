package listofobject;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.ArrayList;
class student  implements Comparable <student> {
	Logger l= Logger.getLogger("com.api.jar");
	Scanner p1=new Scanner(System.in);
    String studentname;
    double gpa;
    int age;
    student()
    {
    	
    }
    public void setter()
    {
    	l.info("Enter the studentname:");
    	this.studentname=p1.next();
    	l.info("Enter the age:");
    	this.age=p1.nextInt();
    	l.info("Enter the gpa:");
    	this.gpa=p1.nextDouble();
    	
    }
    public student getter()
    {
    	return this;
    }
    public int compareTo(student s1)
    {
        if(this.gpa>s1.gpa)
        {
        	return -1;
        }
        else if(this.gpa<s1.gpa)
        {
        	return 1;
        }
        return 0;
        
    }
}
public class Studenttest {
	public static void main(String[] arg){
		Logger l= Logger.getLogger("com.api.jar");
		Scanner p1=new Scanner(System.in);
	      ArrayList<student> a1=new ArrayList<student>();
	      l.info("Enter the no of object:");
	     int num=p1.nextInt();
	     for(int i=0;i<num;i++)
	     {
	        student a=new student();
	        a.setter();
	        a1.add(a);
	     }
	     student a2=new student();
	     l.info("The student details:");
	     for(int i=0;i<num;i++)
	     {
	    	 a2=a1.get(i).getter();
	    	 l.info("Name:"+a2.studentname+" Age:"+a2.age+" Gpa:"+a2.gpa);
	     }
	     Collections.sort(a1);
	     l.info("After sorting:");
	     for(int i=0;i<num;i++)
	     {
	    	 a2=a1.get(i).getter();
	    	 l.info("Name:"+a2.studentname+" Age:"+a2.age+" Gpa:"+a2.gpa);
	     }
	    }
}
