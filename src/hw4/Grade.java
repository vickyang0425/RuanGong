package hw4;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
public class Grade {

	public Grade() {
		
	}
	
	 public char letterGrade(int score) 
	 {
	  char grade;
	  if (score < 0 || score > 100)
	   grade = 'X';
	  else if (score >= 90 && score <= 100)
	   grade = 'A';
	  else if (score >= 80 && score < 90)
	   grade = 'B';
	  else if (score >= 70 && score < 80)
	   grade = 'C';
	  else if (score >= 60 && score < 70)
	   grade = 'D';
	  else
	   grade = 'F';
	  return grade;
	 }
	 public static void main(String args[])
	 {
		 org.junit.runner.JUnitCore.main("GradeTestB");
	 }
	
	
}