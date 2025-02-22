import java.util.Scanner;

public class QuestionService {
	Question[] questions = new Question[5];
	String[] choosed=new String[5];
	
	
	
	 public QuestionService() {
	        questions[0] = new Question(1, "size of int", new String[]{"4", "1 ", "2 ", "3 ", "4 "}, "4");
	        questions[1] = new Question(2, "size of float", new String[]{"4", "1 ", "2 ", "3 ", "4 "}, "4");
	        questions[2] = new Question(3, "size of double", new String[]{"4", "1 ", "2 ", "3 ", "4 "}, "8");
	        questions[3] = new Question(4, "size of char", new String[]{"4", "1 ", "2 ", "3 ", "4 "}, "1");
	        questions[4] = new Question(5, "size of boolean", new String[]{"4", "1 ", "2 ", "3 ", "4 "}, "1");
	    }
	public void playQuiz()
	{
		int j=0;
		for(Question q:questions)	
		{
			
				System.out.println("Question id: 	"+q.getId());
				System.out.println("Question : "+q.getQuestion());
				System.out.println("Options : ");
				 String[] options = q.getOptions();
				 for (int i = 0; i < options.length; i++) {
		                System.out.println( options[i]);
		            }
				Scanner sc = new Scanner(System.in);
				
				choosed[j]=sc.nextLine();
				j++;
				
			
		}
		for(String s:choosed)
		{
			
			System.out.println(s);
			
		}	
		
			
	}
	public void printScore() {
		int score=0;
		for(int i=0;i<questions.length;i++)
		{
			Question que=questions[i];
			String actualans=que.getAns();
			String userAns=choosed[i];
			if(actualans.equals(userAns))
			{
				score++;
			}
		}
		System.out.println("your total score is : "+score);
	}
}
