package apcs_2018_FreeResponseQuestions;

import java.util.ArrayList;

public class WordPairList {

	private ArrayList<WordPair> allPairs;
	
	public WordPairList(String[] words) {
		super();
		allPairs = new ArrayList<WordPair>();
		WordPair pair;
		for(int first = 0; first<words.length-1; first++){
			String firstWord = words[first];
			for(int second = first+1; second<words.length; second++){
				String secondWord = words[second];
				pair = new WordPair(firstWord, secondWord);
				allPairs.add(pair);
			}
		}
	}
	
	public int numMatches() {
		int matches = 0;
		for(WordPair pair : allPairs){
			if(pair.getFirst().equals(pair.getSecond())) matches++;
		}
		return matches;
	}
	
	public String toString() {
		String s = "{";
		for (WordPair wordPair : allPairs) {
			s += "(" + wordPair.getFirst() + ", " + wordPair.getSecond() + "), ";
		}
		s = s.substring(0, s.length() - 2) + "}";
		return s;
	}
}
