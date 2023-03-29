package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Online online = new Online("Koncert", "Warszawa", "Online", 100, 5, 1);
        online.finalPrice();

        Standard standard = new Standard("Mecz", "Kraków", "Standard", 100, 5, 2);
        Gift gift = new Gift("Kino", "Gdańsk", "Gift", 100, 5, 3);

        System.out.println("Bilet Online: cena podstawowa " + online.getPrice() + "zł, zniżka " +  online.getDiscount() +
                "%, cena finalna wyniesie " + online.getPrice() + "zł");
    }
}
