public class Main {
    public int checkLeapYear(int year)
    {
        if(year % 4==0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    //System.out.println(year + " is a leap year!");
                    return  1;
                }
                else
                {
                    //System.out.println(year + " is not a leap year!");
                    return 0;
                }
            }
            else
            {
               // System.out.println(year + " is a leap year!");
                return 1;
            }

        }
        else
        {
           // System.out.println(year + " is not a leap year!");
            return 0;

        }
    }
    public int getDaysOfMonth(int year,int month)
    {
        switch (month)
        {
            case 1: return 31;
            case 2:
            {
                if(checkLeapYear(year) == 1) return 29;
                else return 28;
            }
            case 3: return 31;

            case 4: return 30;

            case 5: return 31;

            case 6: return 30;

            case 7: return 31;

            case 8: return 31;

            case 9: return 30;

            case 10: return 31;

            case 11:return 30;

            case 12: return 31;

            default:return -1;
        }
    }
    public static void main(String[] args) {

        int year = 1600;
        int month = 2;
        Main y = new Main();
        System.out.println("The days of month " +month+" of " + year +" : "+ y.getDaysOfMonth(year, month));

    }
}