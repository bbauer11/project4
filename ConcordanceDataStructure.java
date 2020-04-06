import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ConcordanceDataStructure implements ConcordanceDataStructureInterface {

	private int tableSize;
	private String test;	// only to be used in Constructor(String, int)
	private LinkedList<ConcordanceDataElement>[] table;
	
	public ConcordanceDataStructure(String test, int size) {
		this.test = test;
		this.tableSize = size;
		this.table = new LinkedList[size];
	}
	                  
	//see javadoc
	public ConcordanceDataStructure(int num) {
		int temp = (int) (num / 1.5);
		do {
			temp += 2;
		} while (isPrime(temp) == false || isFourKPrime(temp) == false);
		
		this.tableSize = temp;
		this.table = new LinkedList[this.tableSize];
	}
	
	
	
	@Override
	public int getTableSize() {
		return tableSize;
	}
	
	@Override
	public ArrayList<String> getWords(int index) {
		if (table[index] == null)
			return null;
		ArrayList<String> toReturn = new ArrayList<String>();
		for (ConcordanceDataElement element: table[index]) {
			toReturn.add(element.getWord());
		}
		return toReturn;
	}

	@Override
	public ArrayList<LinkedList<Integer>> getPageNumbers(int index) {
		if (table[index] == null)
			return null;
		ArrayList<LinkedList<Integer>> toReturn = new ArrayList<>();
		for (ConcordanceDataElement element: table[index]) {
			toReturn.add(element.getList());
		}
		return toReturn;
	}

	@Override
	public void add(String term, int lineNum) {
		if (table[Math.abs(term.hashCode()%20)] == null) {
			table[Math.abs(term.hashCode()%20)] = new LinkedList<ConcordanceDataElement>();
			ConcordanceDataElement newElement = new ConcordanceDataElement(term);
			newElement.addPage(lineNum);
			table[Math.abs(term.hashCode()%20)].add(newElement);
		} else {
			for (ConcordanceDataElement element: table[Math.abs(term.hashCode()%20)]) {
				if (element.getWord() == term) {
					element.addPage(lineNum);
					return;
				}
			}
			ConcordanceDataElement newElement = new ConcordanceDataElement(term);
			newElement.addPage(lineNum);
			table[Math.abs(term.hashCode()%20)].add(newElement);
		}
	}

	@Override
	public ArrayList<String> showAll() {
		ArrayList<ConcordanceDataElement> elementsArray = new ArrayList<>();
		for (LinkedList<ConcordanceDataElement> lists: table) {
			if (lists != null) {
				for (ConcordanceDataElement element: lists) {
					elementsArray.add(element);
				}
			}
		}
		Collections.sort(elementsArray);
		ArrayList<String> toReturn = new ArrayList<>();
		for (ConcordanceDataElement element: elementsArray) {
			toReturn.add(element.toString() + "/n");
		}
		return toReturn;	
	}
	
	
	private boolean isPrime(int n) {
		  //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
	private boolean isFourKPrime(int n) {
		if ((n-3)%4.0 != 0)
			return false;
		else 
			return true;	
	}
	
} // end structure class
