package week1.day2;

// Assignment 2.3

public class PrintCross {

	public static void main(String[] args) {
		int [][] star_positions = {
		                           {0, 4},
		                           {1, 3},
		                           {2},
		                           {1, 3},
		                           {0, 4}};
		
		for (int i = 0; i < star_positions.length; i++) {
			String line = "";
			
			// Add underscores until first star position
			for (int j = 0; j < star_positions[i][0]; j++) {
				line = line + "__";
			}
			// First star
			line = line + "*";
			
			// We are done unless there is a second star position
			if (star_positions[i].length > 1) {
				for (int j = 0; j < star_positions[i][1] - star_positions[i][0] - 1; j++) {
					line += "__";
				}
				line += "_*";
			}
			System.out.println(line);	// print the finished line and iterate
		}
	}
}
