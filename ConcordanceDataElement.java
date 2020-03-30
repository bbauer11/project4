import java.util.LinkedList;

/**
 * Represents a word connected with a list of integers where the word is found.
 * @author Brian Bauer
 *
 */
public class ConcordanceDataElement implements Comparable<ConcordanceDataElement> {

	String word;
	LinkedList<Integer> list; 
	
	public ConcordanceDataElement(String word) {
		this.word = word;
		list = new LinkedList<>();
	}
	
	public String getWord() {
		return word;
	}
	
	public String toString() {		//test this
		String toReturn = word + ": ";
		for (int s: list) {
			toReturn += s + ",";
		}
		return toReturn.substring(0, toReturn.length() - 1);
	}
	
	public int hashCode() {
		return word.hashCode();
	}
	
	public LinkedList<Integer> getList() {
		return list;
	}
	
	public void addPage(int lineNum) {		//should this rearrange? will numbers be added in order automatically?
		list.add(lineNum);
	}
	 
	
	
	
	@Override
	public int compareTo(ConcordanceDataElement o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
