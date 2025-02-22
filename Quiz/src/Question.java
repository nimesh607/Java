
public class Question {
	int id;
	private String question;
	private String[] options=new String[4];
	private String ans;
	
	public Question(int id, String question, String[] options, String ans) {
		super();
		this.id = id;
		this.question = question;
		this.options = options;
		this.ans = ans;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String[] getOptions() {
		return options;
	}
	
	public void setOptions(String[] options) {
		this.options = options;
	}
	
	public String getAns() {
		return ans;
	}
	
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	

}
