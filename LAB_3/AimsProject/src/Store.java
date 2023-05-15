import java.util.List;

public class Store {

    private static final int MAX_DVD_STORE = 100;
    private DigitalVideoDisk[] itemsInStore = new DigitalVideoDisk[MAX_DVD_STORE];

    private int qtyDVD = 0;

    public void addDVD(DigitalVideoDisk dvd)
    {
        itemsInStore[qtyDVD] = dvd;
        qtyDVD++;
    }
    public void removeDVD(DigitalVideoDisk dvd)
    {
        for(int i=0;i<qtyDVD;i++)
        {
            if(itemsInStore[i].equals(dvd))
            {
                for(int j=i;j<qtyDVD;j++)
                {
                    itemsInStore[j] = itemsInStore[j+1];
                }
                qtyDVD--;
                return;
            }
        }

    }

}
