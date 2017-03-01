import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class AnagramTest {
	private String word = "Testcase";
	private String [] testArray = {"these", "those", "they"};
	private int i =0;
	@Test
	public void testKey() {
		assertNotNull("Key should not be null", Anagram.computeKey(word));
	}
	
	@Test
	public void testConstructor(){
		assertNotNull("The values array should not be null", Anagram.class.getConstructors());
	}
	@Test 
	public void testAnagramValues(){
		Anagram testAnagram = new Anagram(word);
		for (i = 0; i < 3; i++){
			testAnagram.addWord(testArray[i]);
		}
		assertEquals("The values should be passed to the Values array of anagram", 4, testAnagram.getValues().size());
	}
	@Test
	public void testGetAnagramList(){
		try {
			assertNotNull("The getAnagramList method should be returning an arrayList of words", ListOfAnagrams.getAnagramList("wordList.txt"));
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

}
