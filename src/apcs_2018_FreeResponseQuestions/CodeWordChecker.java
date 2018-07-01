package apcs_2018_FreeResponseQuestions;

public class CodeWordChecker implements StringChecker{

	private int minRange;
	private int maxRange;
	private String noCode;
	
	public CodeWordChecker(int minRange, int maxRange, String noCode) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.noCode = noCode;
	}
	public CodeWordChecker(String noCode) {
		super();
		this.minRange = 6;
		this.maxRange = 20;
		this.noCode = noCode;
	}

	public boolean isValid(String word){		
		return word.length() >= minRange && word.length() <= maxRange && !word.contains(noCode);
	}
	
}
