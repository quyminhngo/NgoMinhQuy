public class EquationSolving {
    public void first_degree(double a,double b)  // return 0 if equation co vo so nghiem
    {
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("The equation has identity solution!");
            }
            else
            {
                System.out.println("The equation has no solution!");
            }
        }
        else
        {
            System.out.println("The equation has only one sultion: x = b/a!" + (double) b/a);
        }
    }
    public void second_degree(double a, double b,double c)
    {
        double dental = b*b - 4*a*c;
        if(a == 0)
        {
            first_degree(b,c);
        }
        else {
            if(dental > 0 )
            {
                System.out.println("The equal tion has 2 solutions: x1 " +
                        ((-b + Math.sqrt(dental) )/2*a) + " and x2 = " + ((-b - Math.sqrt(dental) )/2*a));
            }
            else if(dental == 0)
            {
                System.out.println("The equation has a solution: x1 = x2 = "+(-b)/2*a);
            }
            else {
                System.out.println("The equation has no solution!");
            }
        }
    }

    public void system_equation(double A[][],double b[])
    {
        double detA = A[0][0]*A[1][1] - A[0][1]*A[1][0];

        if(detA != 0)
        {

        }
        else {

        }
    }
    public static void main(String[] args) {

    }
}
