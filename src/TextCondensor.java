import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Condense a text
 * @author isabelle delmas
 *
 */
public class TextCondensor {
	private ArrayList<String> list;
	
	/**
	 * Constructor
	 * @param text list of words
	 */
	public TextCondensor(ArrayList<String> text) {
		this.list = text;
	}
	
	/**
	 * Remove any duplicates and returns an Set<String> containing words without duplicates and in alphabetical order.
	 * @return Set with all the unique words in alphabetical order
	 */
	public Set<String> condenseText(){
		Set<String> set = new TreeSet<>();
		for(String element : this.list) {
			set.add(element);
		}
		return set;
	}
	
	/**
	 * Which gets the number of unique elements in the text.
	 * @return number of unique words in the text
	 */
	public int condensedSize() {
		
		return this.condenseText().size();
	}
	/**
	 * Sets a new list of words
	 * @param newText list of words to add
	 */
	public void setList(ArrayList<String> newText) {
		this.list = newText;
	}
}
