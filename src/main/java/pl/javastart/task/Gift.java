package pl.javastart.task;

class Gift extends Ticket {
    public Gift(String name, String address, String type, double price, int discount, int id) {
        super(name, address, type, price, discount, id);
    }

    public void finalPrice() {
        super.finalPrice();
        giftPrice();
    }

    private void giftPrice() {
        setPrice(getPrice() + 5);
    }
}
