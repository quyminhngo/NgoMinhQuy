import java.util.Scanner;

class Object extends DigitalVideoDisk
{

}
public class DigitalVideoDisk  {

    private int id;
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;


    private static int nbDisk = 0;

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
    public String getDirectory() {
        return directory;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public DigitalVideoDisk()
    {
        nbDisk++;
    }
    public DigitalVideoDisk(String title) {
        this.title = title;
        nbDisk++;
    }
    public DigitalVideoDisk(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDisk++;
    }
    public DigitalVideoDisk(String title, String category, String directory, float cost) {
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;
        nbDisk++;
    }
    public DigitalVideoDisk(int id, String title, String category, String directory, int length, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisk(String title, String category, String directory, int length, float cost) {
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
        nbDisk++;
    }
    static public DigitalVideoDisk[] creatListDVD(int n)
    {
        Scanner input = new Scanner(System.in);
        DigitalVideoDisk list[] = new DigitalVideoDisk[20];
        String temp;
        for(int i=0;i<n;i++)
        {
            list[i] = new DigitalVideoDisk();
            System.out.printf("Enter DVD's title: ");
            list[i].title = input.nextLine();
            System.out.printf("Enter DVD's category: ");
            list[i].category = input.nextLine();
            System.out.printf("Enter DVD's directory: ");
            list[i].directory = input.nextLine();
            System.out.printf("Enter DVD's length: ");
            list[i].length = input.nextInt();
            System.out.printf("Enter DVD's cost: ");
            list[i].cost = (float) input.nextFloat();
            temp = input.nextLine();
        }
        return list;
    }
}
