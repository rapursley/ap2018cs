package apcs_2018_FreeResponseQuestions; // https://apcentral.collegeboard.org/pdf/ap18-frq-computer-science-a.pdf

public class Question2 {

	public static void main(String[] args) {
		// Example 1
		String[] wordNums = {"one", "two", "three"};
		WordPairList exampleOne = new WordPairList(wordNums);
		System.out.println(exampleOne);
		System.out.println("matches = " + exampleOne.numMatches());
		
		String[] phrase = {"the", "more", "the", "merrier"};
		WordPairList exampleTwo = new WordPairList(phrase);
		System.out.println(exampleTwo);
		System.out.println("matches = " + exampleTwo.numMatches());
		
		String[] moreWords= {"the", "red", "fox", "the", "red"};
		WordPairList exampleThree = new WordPairList(moreWords);
		System.out.println(exampleThree);
		System.out.println("matches = " + exampleThree.numMatches());

	}

}
