public class Component {
    private String Name;
    private String Manufacturer;
    private double Price;

    private void setName(String Name)
    {
        if (Name.length() < 3)
            throw new IllegalArgumentException("The name needs to be at least 3 chars long.");
    }
    
    public Component(String Name, String Manufacturer, double Price)
    {

    }
}
