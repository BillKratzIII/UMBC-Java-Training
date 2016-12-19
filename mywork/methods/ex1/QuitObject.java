package mywork.methods.ex1;

/**
 * 
 * @author William Kratz
 * Object to store variables needed for Random Number Program
 * Makes it easier to pass stats through different methods
 *
 */

public class QuitObject {
	int status; //status code to be used in System.exit()
	int greaterThan = 0; //count for results greater than 0.5
	int lessThan = 0; //count for results less than or equal to 0.5
	long startTime; //start time in milliseconds of ths program
	int finalCount; //final count of random numbers generated when program terminated
	
	//Constructor
	public QuitObject(long startTime) {
		this.startTime = startTime;
	}

	//Getters and Setters
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGreaterThan() {
		return greaterThan;
	}

	public void setGreaterThan(int greaterThan) {
		this.greaterThan = greaterThan;
	}

	public int getLessThan() {
		return lessThan;
	}

	public void setLessThan(int lessThan) {
		this.lessThan = lessThan;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public void addOneGreaterThan(){
		this.greaterThan++;
	}
	
	public void addOneLessThan(){
		this.lessThan++;
	}

	public int getFinalCount() {
		return finalCount;
	}

	public void setFinalCount(int finalCount) {
		this.finalCount = finalCount;
	}
	
}
