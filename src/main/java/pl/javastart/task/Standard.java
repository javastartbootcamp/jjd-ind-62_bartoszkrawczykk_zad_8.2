package pl.javastart.task;

class Standard extends Ticket {
    public Standard(String name, String address, String type, double price, int discount, int id) {
        super(name, address, type, price, discount, id);
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        standardPrice();
    }

    private void standardPrice() {
        setPrice(getPrice() + 5);
    }
}
