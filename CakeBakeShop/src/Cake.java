public class Cake {

    private String flavor;
    private double price;

    public Cake() {
        setFlavorDefault();
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setFlavorDefault() {
        this.flavor = "Vanilla";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }
}
