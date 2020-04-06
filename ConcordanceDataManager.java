import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ConcordanceDataManager implements ConcordanceDataManagerInterface {
	
	
	public ConcordanceDataManager() {
	}
	
	@Override
	public ArrayList<String> createConcordanceArray(String input) {
		
		ConcordanceDataStructure structure = new ConcordanceDataStructure(input.split(" ").length);
		
		String[] lines = input.split("\n");
		
		ArrayList<String> toReturn = new ArrayList<>();
		
		
		for (int i=0; i<lines.length; i++) {
			for (String word: lines[i].split(" ")) {
				if (word.length() > 2 && !word.equals("and") && !word.equals("the"))  {
					word = word.strip();
					word = word.replaceAll(",", "");
					word = word.replace(".", "");
					word = word.replace("?", "");
					word = word.replace("!", "");
					structure.add(word, i+1); 	
				}
			}
		}
		
		
		toReturn = structure.showAll();
		return toReturn;
	}

	@Override
	public boolean createConcordanceFile(File input, File output) throws FileNotFoundException {
		return false;
	}

}
