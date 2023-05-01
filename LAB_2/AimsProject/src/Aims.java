import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart anOrdered = new Cart(0);
        DigitalVideoDisk dvd1 = new DigitalVideoDisk("The Lion King","Animation","Roger Allers",
                87,19.95f);
        DigitalVideoDisk dvd2 = new DigitalVideoDisk("Star War","Science Friction","Lucas Quy",
                87,24.95f);
        DigitalVideoDisk dvd3 = new DigitalVideoDisk("Your life","Animation","Ngo Minh Quy",
                107,69.95f);
        anOrdered.addDigitVideoDisk(dvd1);anOrdered.addDigitVideoDisk(dvd2);anOrdered.addDigitVideoDisk(dvd3);
        anOrdered.showListDVD();
        anOrdered.removeDigitalVideoDisk(dvd2);
        anOrdered.showListDVD();



    }
}
