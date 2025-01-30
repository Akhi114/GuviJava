package ExceptionAndCollection;

import java.util.Scanner;

public class DisplayWeekdays_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayPosition = 0;
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Exit by pressing [77] "); // To exit the loop
        // Running a loop until user exits
        while (dayPosition != 77) {
            try {
                System.out.println("\n\nEnter day position: ");
                dayPosition = scan.nextInt();
                validatePosition(dayPosition);

                System.out.println("Today is " + weekDays[dayPosition]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validatePosition(int position) throws ArrayIndexOutOfBoundsException {
        if (position > 6 && position != 77) {
            throw new ArrayIndexOutOfBoundsException("You have entered day position outside range of 7 days!");
        }
        else if (position == 77) {
            throw new ArrayIndexOutOfBoundsException("You have exited!");
        }
    }

}
