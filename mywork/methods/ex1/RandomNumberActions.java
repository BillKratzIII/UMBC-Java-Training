package mywork.methods.ex1;

/**
 * 
 * @author William Kratz
 * Class that stores methods to fulfill the requirements of the RandomNumbers class
 *
 */

public class RandomNumberActions {
	
	//method that prints the current counts, calculates the time the program ran then exits
		public static void quitProgram(QuitObject q) {
			printStats(q);
			long endTime = System.currentTimeMillis();
			System.out.println("Time to execute program: " + (endTime-q.getStartTime()) + "ms");
			System.exit(q.getStatus());
		}
		
		//Method runs the second loop until either the upperLimit is reached OR
		//the two counts are equal. THen the quitProgram() method is called
		private static void loopWithCheck(int upperLimit, QuitObject q) {
			int i;
			double temp;
			
			for (i=0; i<upperLimit; i++) {
				if(q.getGreaterThan()==q.getLessThan()){
					q.setFinalCount(i+10000);
					q.setStatus(1);
					quitProgram(q);
				}
				temp = Math.random();
				if (temp > 0.5) {
					q.addOneGreaterThan();
				} else {
					q.addOneLessThan();
				}
			}
			
			q.setFinalCount(i+10000);
			q.setStatus(2);
			quitProgram(q);
			
		}

		//Runs the first loop until the upperLimit is reached,
		//prints the current count
		//then calls the second loop that contains a check
		public static void loop(int upperLimit, QuitObject q) {
			int i;
			double temp;
			
			for (i=0; i<upperLimit; i++){
				temp = Math.random();
				if (temp > 0.5) {
					q.addOneGreaterThan();
				} else {
					q.addOneLessThan();
				}
			}
			q.setFinalCount(i);
			printStats(q);
			loopWithCheck(990000, q);
		}
		
		//Method prints the current counts and how many numbers have been generated
		public static void printStats(QuitObject q) {
			System.out.println("Numbers greater than 0.5 after " + q.getFinalCount() +  "= " + q.getGreaterThan());
			System.out.println("Numbers less that or equal to 0.5 after " + q.getFinalCount() + "= " + q.getLessThan());
		}

}
