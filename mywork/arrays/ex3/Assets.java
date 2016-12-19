package mywork.arrays.ex3;

/**
 * 
 * @author William Kratz
 * Class that tracks descriptions and and values of specified items.
 * Methods are available to display information about these items.
 *
 */

public class Assets {
	//instance variables
	String names [];
	double values[];
	int size;
	int capacity;
	
	//constructor
	public Assets(int maxSize) {
		names = new String[maxSize];
		values = new double[maxSize];
		size = 0;
		capacity = maxSize;
	}
	
	//method adds an item and its value to this object
	public void addElement(String item, double itemVal) {
		AssetValidation validator = new AssetValidation();
		
		if (validator.canAdd(size, capacity, itemVal)) {	
			names[size] = item;
			values[size] = itemVal;
			size++;
		}
	}
	
	//method that returns number of items currently stored
	public int size() {
		return size;
	}
	
	//method that returns number of items capable of being stored
	public int capacity() {
		return capacity;
	}
	
	//method that returns the total dollar value of all assets being tracked
	public double getTotalValue() {
		double sum = 0;
		
		for (int i=0; i<size; i++) {
			sum+=values[i];
		}
		
		return sum;
	}
	
	//method that returns a String that contains name and value
	//of a particular item
	public String getItem(int whichItem) {
		String item = null;
		AssetValidation validator = new AssetValidation();
		
		if (validator.validItem(whichItem, size)){
			item = names[whichItem] + " \t $" + values[whichItem];
		}
		
		return item;
	}
		
	//method returns table of item names and values
	//in a String object
	public String toString() {
		StringBuffer table = new StringBuffer();
		
		for(int i=0; i<size; i++) {
			table.append(i+1 + ".)\t" + getItem(i) + "\n");
		}
		
		return table.toString();
	}

}
