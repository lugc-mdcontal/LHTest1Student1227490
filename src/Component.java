public class Component {
    private String Name;
    private String Manufacturer;
    private double Price;

    @Override
    public String toString()
    {
        return "";
    }

    public Component(String Name, String Manufacturer, double Price)
    {
        this.Name = Name;
        this.Manufacturer = Manufacturer;
        this.Price = Price;
    }
}
