import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class AnagramList {
	//public static String [] wordList = null;
	//public static String word = null;
	
	//public static int wordLength = word.length() ;
	
	
	public static void main(String[] args) throws IOException{
		
		getAnagramList("wordList.txt");
		//System.out.println("we fucked up");

	}
	
	public static ArrayList<Anagrams> getAnagramList(String filename) throws IOException {
		ArrayList<Anagrams> anagramList = new ArrayList<Anagrams>();
		FileInputStream fileIn = new FileInputStream(filename);
		Scanner scnr = new Scanner(fileIn);
		String fileWord = "";
		
		while (scnr.hasNext()){
			fileWord = scnr.next();
			/*for(int i=0;i<wordList.length;i++) {
				if (Anagrams.computeKey(fileWord).equals())
			}*/
			int i = 0;
			Boolean equalsBool = false;
			
			while(i<anagramList.size() - 1 && equalsBool == false ) {
				if (Anagrams.computeKey(fileWord).equals(anagramList.get(i).getKey())) {
					equalsBool = true;
					anagramList.get(i).addWord(fileWord);
				}
				i++;
				System.out.println("THis worked" + fileWord);
			}
		}
		
		return anagramList;
	}
	
	/*public static getFileLength(String filename) {
		
	}*/

}
