import java.util.ArrayList;
import java.util.Arrays;


public class Anagram {
 private String key = null;
 private ArrayList<String> values = null;
 
 
 public static String computeKey(String word){
  char [] letters = word.toCharArray();
  Arrays.sort(letters);
  String sorted = Arrays.toString(letters);
  return sorted;
 }
 
 public Anagram(String word){
  values = new ArrayList<String>();
  key = computeKey(word);
 }
 
 public String getKey() {
  return this.key;
 }
 
 public String toString() {
	 String listOfWords = "";
	 for (int j = 0; j <= values.size() - 1; j++) {
			if (listOfWords.equals("")) {
				listOfWords = values.get(j);
			}
			else {
				listOfWords += listOfWords + " " + values.get(j);
			}
	 }
	 return listOfWords;
 }
 
 public ArrayList<String> getValues() {return this.values;}
 
 public void addWord(String word){
  this.values.add(word);
  return;
 }

}
