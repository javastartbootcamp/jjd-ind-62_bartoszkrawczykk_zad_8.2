package pl.javastart.task;

class Ticket {
    private String name;
    private String address;
    private String type;
    private double price;
    private int discount;
    private int id;

    public Ticket(String name, String address, String type, double price, int discount, int id) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    double finalPrice;

    public void finalPrice() {
        finalPrice = price * (discount / 100);
    }
}
