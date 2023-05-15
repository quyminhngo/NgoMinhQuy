import javax.management.ObjectName;


public class TestPassingParameter {
    public static void swap(Object o1,Object o2)
    {

    }
    public static void changeTitle(DigitalVideoDisk dvd,String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisk(oldTitle);
    }

    public static void main(String[] args) {
        DigitalVideoDisk jungleDVD = new DigitalVideoDisk("Jungle");
        DigitalVideoDisk cindiDVD = new DigitalVideoDisk("Cende");
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cendi dvd title: " + cindiDVD.getTitle());
        System.out.println("After use swap");

        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cendi dvd title: " + cindiDVD.getTitle());

        /*changeTitle(jungleDVD,cindeDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());*/
    }
}
