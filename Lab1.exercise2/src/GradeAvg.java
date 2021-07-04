
public class GradeAvg {

	public static void main(String[] args) {
	
	double quizScore1 = 96;
	System.out.println("Quiz Score 1 = "+ quizScore1 +""+ "%" +"");
	
	double quizScore2 = 55;
	System.out.println("Quiz Score 2 = "+ quizScore2 +""+ "%" +"");
	
	double quizScore3 = 77;
	System.out.println("Quiz Score 3 = "+ quizScore3 +""+ "%" +"");
	
	double testScore1 = 65;
	System.out.println("Test Score 1 = "+ quizScore1 +""+ "%" +"");
	
	double testScore2 = 99;
	System.out.println("Test Score 2 = "+ quizScore2 +""+ "%" +"");
	
	double quizScoreAvg = ((quizScore1 + quizScore2 + quizScore3) / 3);
	System.out.println("Quiz Average = "+ quizScoreAvg +""+ "%" +"");
	
	double testScoreAvg = ((testScore1 + testScore2) / 2);
	System.out.println("Test Average = "+ testScoreAvg +""+ "%" +"");
	

	}

}
