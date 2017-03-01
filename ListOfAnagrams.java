import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class ListOfAnagrams {
	//public static String [] wordList = null;
	//public static String word = null;
	
	//public static int wordLength = word.length() ;
	
	
	public static void main(String[] args) throws IOException{
		Scanner scnr = new Scanner(System.in);
		System.out.println("What file of words to you want to use?");
		String filename = scnr.next();
		ArrayList<Anagram> anagramList = getAnagramList(filename);
		System.out.println("What word do you want to search for?");
		String userWord = scnr.next();
		String match = findAnagrams(userWord, anagramList);
		System.out.println(match);
		scnr.close();

	}
	
	public static String findAnagrams(String word, ArrayList<Anagram> anagramList) {
		String listOfWords = "No match found";
		String wordKey = Anagram.computeKey(word);
		//boolean isMatch = false;
		for (int i = 0; i <= anagramList.size() - 1; i++) {
			if (wordKey.equals(anagramList.get(i).getKey())) {
				/*ArrayList<String> sourceWordList = anagramList.get(i).getValues();
				for (int j = 0; j <= sourceWordList.size(); j++) {
					if (listOfWords.equals("")) {
						listOfWords = sourceWordList.get(j);
					}
				}*/
				listOfWords = anagramList.get(i).toString();
				//isMatch = true;
				break;
			}
		}
		return listOfWords;
	}
	
	public static ArrayList<Anagram> getAnagramList(String filename) throws IOException {
		ArrayList<Anagram> anagramList = new ArrayList<Anagram>();
		FileInputStream fileIn = new FileInputStream(filename);
		Scanner scnr = new Scanner(fileIn);
		String fileWord = "";
		
		while (scnr.hasNext()){
			fileWord = scnr.next().toLowerCase();
			/*for(int i=0;i<wordList.length;i++) {
				if (Anagrams.computeKey(fileWord).equals())
			}*/
			int i = 0;
			Boolean equalsBool = false;
			
			while(i<=anagramList.size() - 1 && equalsBool == false ) {
				if (Anagram.computeKey(fileWord).equals(anagramList.get(i).getKey())) {
					equalsBool = true;
					anagramList.get(i).addWord(fileWord);
				}
				i++;
				//System.out.println("THis worked" + fileWord);
			}
			
			if (equalsBool == false) {
				Anagram newWord = new Anagram(fileWord);
				anagramList.add(newWord);
			}
		}
		scnr.close();
		return anagramList;
	}
	
	/*public static getFileLength(String filename) {
		
	}*/

}

