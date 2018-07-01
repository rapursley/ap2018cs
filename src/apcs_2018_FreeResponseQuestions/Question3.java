package apcs_2018_FreeResponseQuestions; // https://apcentral.collegeboard.org/pdf/ap18-frq-computer-science-a.pdf

public class Question3 {

	public static void main(String[] args) {
		StringChecker sc1 = new CodeWordChecker(5, 8, "$");
		System.out.println("isValid(\"happy\") = " + sc1.isValid("happy"));
		System.out.println("isValid(\"happy$\") = " + sc1.isValid("happy$"));
		System.out.println("isValid(\"Code\") = " + sc1.isValid("Code"));
		System.out.println("isValid(\"happyCode\") = " + sc1.isValid("happyCode"));
		System.out.println("********************");
		StringChecker sc2 = new CodeWordChecker("pass");
		System.out.println("isValid(\"MyPass\") = " + sc2.isValid("MyPass"));
		System.out.println("isValid(\"Mypassport\") = " + sc2.isValid("Mypassport"));
		System.out.println("isValid(\"happy\") = " + sc2.isValid("happy"));
		System.out.println("isValid(\"1,000,000,000,000,000\") = " + sc2.isValid("1,000,000,000,000,000"));
	}

}
