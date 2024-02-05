import java.util.Arrays;
import java.util.List;

public class Component {
    private String Name;
    private String Manufacturer;
    private double Price;

    // static because one instance, and final because we don't want to edit it later
    static final List<String> Valid = Arrays.asList("3Com","Acer","Arctic","AMD", "Asus","Apple Inc.","Bose","Cooler Master", "Hitachi", "Intel", "Logitech", "Marvell", "Nvidia", "Qualcomm", "Samsung","Tyan","Fujitsu","MSI","Seagate","Toshiba", "Western Digital", "XTREEM");

    private void setName(String Name)
    {
        if (Name.length() < 3)
            throw new IllegalArgumentException("The name needs to be at least 3 chars long.");

        this.Name = Name;
    }

    public String getName()
    {
        return Name;
    }

    private void setPrice(double Price)
    {
        if (Price < 0 || Price > 10000)
            throw new IllegalArgumentException("The price needs to be within 0-10000 (inclusive).");

        this.Price = Price;
    }

    public double getPrice()
    {
        return Price;
    }

    private void setManufacturer(String Manufacturer)
    {
        if (!Valid.contains(Manufacturer))
            throw new IllegalArgumentException(Manufacturer + " is not in the valid list.");

        this.Manufacturer = Manufacturer;
    }

    public String getManufacturer()
    {
        return Manufacturer;
    }

    @Override
    public String toString()
    {
        // Serialize the string
        return Name + "-" + Manufacturer + ", price: $" + String.format("%.2f", Price);
    }

    public Component(String Name, String Manufacturer, double Price)
    {
        setName(Name);
        setManufacturer(Manufacturer);
        setPrice(Price);
    }
}
