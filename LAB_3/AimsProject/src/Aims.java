import java.util.List;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart anOrdered = new Cart(0);
        DigitalVideoDisk dvd1 = new DigitalVideoDisk(1234,"The Lion King","Animation","Roger Allers",
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
        anOrdered.showListDVD();
        // lab 3
        /*Scanner input = new Scanner(System.in);
        Integer length=0;
        System.out.print("Enter the number of element of your DVD list: ");
        length = input.nextInt();
        DigitalVideoDisk list[] = DigitalVideoDisk.creatListDVD(length); // Di ::
        anOrdered.addDigitVideoDisk(list,length);
        anOrdered.showListDVD();
        anOrdered.addDigitVideoDisk(dvd4,dvd5);
        anOrdered.showListDVD();*/
        System.out.println(anOrdered.toString());






    }
}
