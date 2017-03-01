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
  values.add(word);
  key = computeKey(word);
 }
 
 public String getKey() {
  return this.key;
 }
 
 public String toString() {
	 String listOfWords = "";
	 if (values.size() < 2) {
		 listOfWords = values.get(0) + " has no anagrams.";
	 }
	 else {
		 for (int j = 0; j <= values.size() - 1; j++) {
			 if (listOfWords.equals("")) {
				 listOfWords = values.get(j);
			 }
			 else {
				 listOfWords += ", " + values.get(j);
			 }
		 }
	 listOfWords += " are anagrams.";
	 }
	 return listOfWords;
 }
 
 public String toString(String word) {
	 String listOfWords = "The anagrams of " + word + " are:";
	 if (values.size() < 2) {
		 listOfWords =  values.get(0) + " has no anagrams.";
	 }
	 else {
		 for (int j = 0; j <= values.size() - 1; j++) {
			 if (!values.get(j).equals(word)) {
				 listOfWords += " " + values.get(j);
			 }
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
