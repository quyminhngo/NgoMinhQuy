import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisk itemOrdered[] = new DigitalVideoDisk[MAX_NUMBERS_ORDERED];

    private int qtyOrdered; // current DVD

    public Cart(int qtyOrdered )
    {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitVideoDisk (DigitalVideoDisk disk)
    {
        if(qtyOrdered > 20)
        {
            System.out.println("One cart must contain maximum 20 DVD's!");
            return;
        }
        else
        {

            itemOrdered[qtyOrdered] = disk;
            qtyOrdered++;
            System.out.println("The disk has been added!");
        }
    }
    public void removeDigitalVideoDisk(DigitalVideoDisk disk)
    {
        if(qtyOrdered == 0)
        {
            System.out.println("Your cart does not have any DVD!");
            return;
        }
        else
        {
            for(int i=0;i<qtyOrdered;i++)
            {
                if(itemOrdered[i] == disk)
                {
                    for(int j=i+1;j<qtyOrdered;j++)
                    {
                        itemOrdered[j-1] = itemOrdered[j];
                    }
                    qtyOrdered--;
                    System.out.println("This disk deleted in your cart!");
                    return;
                }
            }
            System.out.println("This disk is not in your cart!");
        }
    }
    void showListDVD()
    {

        System.out.println("Your cart has " + qtyOrdered + " DVD! They are shown in the table below!");
        System.out.println("___ START OF LIST ___");
        for(int i=0;i<qtyOrdered;i++)
        {
            System.out.printf("%-5d%-20s%-20s%-20s%-20d%-20.2f\n",i+1,itemOrdered[i].getTitle(),itemOrdered[i].getCategory(),
                    itemOrdered[i].getDirectory(),itemOrdered[i].getLength(),itemOrdered[i].getCost());
        }
        System.out.println("___ END OF LIST ___");
    }
    public float totalCost()
    {
        float sum = 0;
        for(int i=0;i<qtyOrdered;i++)
        {
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
}
