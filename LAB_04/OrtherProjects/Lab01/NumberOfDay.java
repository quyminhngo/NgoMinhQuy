import java.time.YearMonth;
import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0, month=0;
        String monthName="";
        boolean validInput = false;
        while (!validInput) {
            System.out.print(
                    "Enter a month (in full name, abbreviation, in 3 letters, or in number): ");
            monthName = scanner.next().toLowerCase();
            System.out.print("Enter a year: ");
            year = scanner.nextInt();
            // Check if the input month is valid
            switch (monthName) {
                case "january":
                case "jan":
                case "1":
                    month = 1;
                    validInput = true;
                    break;
                case "february":
                case "feb":
                case "2":
                    month = 2;
                    validInput = true;
                    break;
                case "march":
                case "mar":
                case "3":
                    month = 3;
                    validInput = true;
                    break;
                case "april":
                case "apr":
                case "4":
                    month = 4;
                    validInput = true;
                    break;
                case "may":
                case "5":
                    month = 5;
                    validInput = true;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    validInput = true;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    validInput = true;
                    break;
                case "august":
                case "aug":
                case "8":
                    month = 8;
                    validInput = true;
                    break;
                case "september":
                case "sep":
                case "9":
                    month = 9;
                    validInput = true;
                    break;
                case "october":
                case "oct":
                case "10":
                    month = 10;
                    validInput = true;
                    break;
                case "november":
                case "nov":
                case "11":
                    month = 11;
                    validInput = true;
                    break;
                case "december":
                case "dec":
                case "12":
                    month = 12;
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid month input. Please try again.");
                    break;
            }
            // Check if the input year is valid
            if (year < 0) {
                System.out.println("Invalid year input. Please try again.");
                validInput = false;
            }
        }
        scanner.close();
        // Get the number of days in the input month and year
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Number of days in " + monthName + " " + year + " is " +
                daysInMonth);
    }

}