public class Main {
    public static void main(String[] args) {

        int array[] = {24,345,-34,353,24,14,-25,4,2343,21};

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.print("All element of array: ");
        int sum = 0;
        double average;
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        average = (double) (sum/array.length);
        System.out.println("\nThe sum and average of array : " + sum + " " + average);


    }
}