import java.util.ArrayList;
import java.util.LinkedList;

public class ConcordanceDataStructure implements ConcordanceDataStructureInterface{

	int tableSize;
	String test;
	LinkedList<ConcordanceDataElement>[] list; //is this right, how initialize
	
	public ConcordanceDataStructure(String test, int size) {
		this.test = test;
		this.tableSize = size;
	}
	
	//see javadoc
	public ConcordanceDataStructure(int num) {
		
	}
	
	
	
	@Override
	public int getTableSize() {
		return tableSize;
	}

	@Override
	public ArrayList<String> getWords(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LinkedList<Integer>> getPageNumbers(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(String word, int lineNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
