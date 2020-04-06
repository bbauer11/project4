import java.util.LinkedList;

/**
 * Represents a word connected with a list of integers representing the line which 
 * the word occurs.
 * @author Brian Bauer
 *
 */
public class ConcordanceDataElement implements Comparable<ConcordanceDataElement> {

	private String word;
	private LinkedList<Integer> list; 
	
	public ConcordanceDataElement(String word) {
		this.word = word;
		list = new LinkedList<>();
	}
	
	public String getWord() {
		return word;
	}
	
	/**
	 * Creates a String in the form: "word: 1,5,10"
	 */
	public String toString() {		
		String toReturn = word + ": ";
		for (int s: list) {
			toReturn += s + ", ";
		}
		return toReturn.substring(0, toReturn.length() - 2);
	}
	
	public int hashCode() {
		return Math.abs(word.hashCode()%20);
	}
	
	public LinkedList<Integer> getList() {
		return list;
	}
	
	/**
	 * Adds a new line to the list if it is not already there.
	 * @param lineNum
	 */
	public void addPage(int lineNum) {	
		if (!list.contains(lineNum))
			list.add(lineNum);
	}
	 
	
	
	
	@Override		//what is this used for, what are we comparing
	public int compareTo(ConcordanceDataElement arg0) {
		return this.word.compareTo(arg0.getWord());
	}

}
