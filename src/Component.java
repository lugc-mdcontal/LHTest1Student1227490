public class Component {
    private String Name;
    private String Manufacturer;
    private double Price;

    private void setName(String Name)
    {
        if (Name.length() < 3)
            throw new IllegalArgumentException("The name needs to be at least 3 chars long.");

        this.Name = Name;
    }

    private void setPrice(double Price)
    {
        if (Price < 0 || Price > 10000)
            throw new IllegalArgumentException("The price needs to be within 0-10000 (inclusive)");

        this.Price = Price;
    }

    public Component(String Name, String Manufacturer, double Price)
    {

    }
}
