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
        if(qtyOrdered + 1 > 20)
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
    public void addDigitVideoDisk (DigitalVideoDisk dvd1,DigitalVideoDisk dvd2)
    {
        if(qtyOrdered + 2 > 20)
        {
            System.out.println("One cart must contain maximum 20 DVD's!");
            return;
        }
        else
        {
            itemOrdered[qtyOrdered] = dvd1;
            itemOrdered[qtyOrdered+1] = dvd2;
            qtyOrdered += 2;
            System.out.println("The disk has been added!");
        }
    }
    public void addDigitVideoDisk(DigitalVideoDisk[] disk,int size)
    {
        if(size + qtyOrdered > MAX_NUMBERS_ORDERED)
        {
            System.out.println("One cart must contain maximum 20 DVD's!");
            return;
        }
        else {
            int lastQty = qtyOrdered;
            qtyOrdered += size;
            int j=0;
            for(int i=lastQty;i<qtyOrdered;i++)
            {
                itemOrdered[i] = disk[j];
                j++;
            }
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
        System.out.println("___ START OF CART ___");
        System.out.println("Ordered Items:");
        for(int i=0;i<qtyOrdered;i++)
        {
            System.out.printf("%-5d-DVD-%-20s%-20s%-20s%-20d%-20.2f\n",i+1,itemOrdered[i].getTitle(),itemOrdered[i].getCategory(),
                    itemOrdered[i].getDirectory(),itemOrdered[i].getLength(),itemOrdered[i].getCost());
        }
        System.out.println("___ END OF LIST ___");
        System.out.println("Total cost: " + totalCost());
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
    public void printDVD(DigitalVideoDisk itemOrdered)
    {
        System.out.printf("%-20d-DVD-%-20s%-20s%-20s%-20d%-20.2f\n",itemOrdered.getId(),itemOrdered.getTitle(),itemOrdered.getCategory(),
                itemOrdered.getDirectory(),itemOrdered.getLength(),itemOrdered.getCost());
    }
    public void search(int id)
    {
        for(int i=0;i<qtyOrdered;i++)
        {
            if(itemOrdered[i].getId() == id)
            {
                printDVD(itemOrdered[i]);
                return;
            }
        }
        System.out.println("Does not DVD ny ID " + id+" in your cart");

    }
    public void search(String title)
    {
        for(int i=0;i<qtyOrdered;i++)
        {
            if(itemOrdered[i].getTitle().equals(title))
            {
                printDVD(itemOrdered[i]);
                return;
            }
        }
        System.out.println("Does not DVD ny title " + title+" in your cart");
    }

}
class CartTest
{
    public static void main(String[] args) {
        Cart anOrdered = new Cart(0);
        DigitalVideoDisk dvd1 = new DigitalVideoDisk(1234,"TheLionKing","Animation","Roger Allers",
                87,19.95f);
        DigitalVideoDisk dvd2 = new DigitalVideoDisk(1235,"Star War","Science Friction","Lucas Quy",
                87,24.95f);
        DigitalVideoDisk dvd3 = new DigitalVideoDisk(1236,"Your life NMQ","Animation NMQ","Ngo Minh Quy",
                107,69.95f);
        DigitalVideoDisk dvd4 = new DigitalVideoDisk(1237,"Your life MTNA","Animation MTNA","MAi Ngoc ANh",
                107,69.95f);
        DigitalVideoDisk dvd5 = new DigitalVideoDisk(1238,"Your life NTHH","Animation NTJJ","Ngo HOng Hanh",
                107,69.95f);
        anOrdered.addDigitVideoDisk(dvd1);anOrdered.addDigitVideoDisk(dvd2);anOrdered.addDigitVideoDisk(dvd3);
        anOrdered.addDigitVideoDisk(dvd5,dvd4);
        Scanner input = new Scanner(System.in);
        // show list
        anOrdered.showListDVD();
        // search by ID
        int idtest;
        System.out.println("Enter the ID you want to find: ");
        idtest = input.nextInt();
        anOrdered.search(idtest);
        // search by title
        String title;
        System.out.println("Enter the title you want to find: ");
        title = input.next();
        anOrdered.search(title);
    }
}
