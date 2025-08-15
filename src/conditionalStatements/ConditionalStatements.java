package conditionalStatements;

public class ConditionalStatements {

	// Conditional Statements ==> Add Conditions along with statements

	// 1. if -else Conditional statement ==> When we don't know the result of the  condition beforehand
	// 2. switch case Conditional statement ==> When we know the result of the condition beforehand and we want to choose one of the options

	public static void main(String[] args) {

		// Example of if-else conditional statement
		boolean isCoolieMovieAvailable = true;
		boolean isWar2MovieAvailable = false;
		boolean isKhadgamMovieAvailable = true;
		
		boolean isReclinerAvailable = false;
		boolean isBolconyAvailable = false;

		if (isCoolieMovieAvailable) {
			System.out.println("Book Collie Movie Tickets");
			if (isReclinerAvailable) {
				System.out.println("Book Recliner Seats");
			} else if (isBolconyAvailable) {
				System.out.println("Book Balcony Seats");
			} else {
				System.out.println("No Recliner or Balcony Seats Available, So Book Normal Seats");
			}
		} else if (isWar2MovieAvailable) {
			System.out.println("Book War 2 Movie Tickets");
		} else if (isKhadgamMovieAvailable) {
			System.out.println("Book Khadgam Movie Tickets");
			// nested if-else
			if (isReclinerAvailable) {
				System.out.println("Book Recliner Seats");
			} else if (isBolconyAvailable) {
				System.out.println("Book Balcony Seats");
			} else {
				System.out.println("No Recliner or Balcony Seats Available, So Book Normal Seats");
			}
		} else {
			System.out.println("No Ticket Available, Go Home");
		}

	}

}
