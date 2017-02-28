import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class ListOfAnagrams {
	//public static String [] wordList = null;
	//public static String word = null;
	
	//public static int wordLength = word.length() ;
	
	
	public static void main(String[] args) throws IOException{
		
		ArrayList<Anagram> stuff = getAnagramList("wordList.txt");
		//System.out.println("we fucked up");
		System.out.println(stuff);

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
			
			while(i<anagramList.size() - 1 && equalsBool == false ) {
				if (Anagram.computeKey(fileWord).equals(anagramList.get(i).getKey())) {
					equalsBool = true;
					anagramList.get(i).addWord(fileWord);
				}
				i++;
				System.out.println("THis worked" + fileWord);
			}
			
			if (equalsBool == false) {
				Anagram newWord = new Anagram(fileWord);
				anagramList.add(newWord);
			}
		}
		
		return anagramList;
	}
	
	/*public static getFileLength(String filename) {
		
	}*/

}

