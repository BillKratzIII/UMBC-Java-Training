package mywork.arrays.ex3;

/**
 * 
 * @author William Kratz
 * Validation methods for the Assets class.
 *
 */

public class AssetValidation {
	
	//method returns true if the arrays have capacity and the value is greater than 0
	boolean canAdd(int size, int capacity, double value) {
		boolean canAdd = false;
		
		if (hasCapacity(size, capacity) && validValue(value)) {
			canAdd = true;
		}
		
		return canAdd;
	}
	
	//method returns true is the array has capacity to store additonal objects
	boolean hasCapacity(int size, int capacity) {
		boolean hasCap = false;
		
		if (size < capacity) {
			hasCap = true;
		} else {
			System.out.println("ERROR: Cannot add item, capacity has been reached.");
		}
		
		return hasCap;
	}
	
	//method returns true is the value is greater than 0
	boolean validValue(double value) { 
		boolean isValidValue = false;
		
		if (value >= 0) {
			isValidValue = true;
		} else {
			System.out.println("ERROR: Cannot store a negative value");
		}
		
		return isValidValue;
	}
	
	//method returns true if the item selected is below the size of the items store in the array
	boolean validItem(int selection, int size) {
		boolean isValidItem = false;
		
		if (selection<size){
			isValidItem = true;
		} else {
			System.out.println("ERROR: Item selected is not valid.");
		}
		
		return isValidItem;
	}
}
