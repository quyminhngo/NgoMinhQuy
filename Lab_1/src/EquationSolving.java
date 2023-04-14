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
    public void second_degree(double a, double b)
    {
        
    }
    public static void main(String[] args) {

    }
}
