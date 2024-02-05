import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Component> Items;

    public void addItem(Component Item)
    {
        Items.add(Item);
    }

    public double getTotalPrice()
    {
        double totalPrice = 0.0;

        for (Component item : Items)
            totalPrice += item.getPrice();

        return totalPrice;
    }

    public String getComponentNames()
    {
        // StringBuilder is better here, as it's designef for such task.
        StringBuilder allNames = new StringBuilder();

        for (Component item : Items)
            allNames.append(item.getName()).append(",");

        // Remove the last comma from string
        allNames.deleteCharAt(allNames.length() - 1);

        return allNames.toString();
    }

    @Override
    public String toString()
    {
        return "The cart has " + Items.size() + " components with a total price of $" + String.format("%.2f", getTotalPrice());
    }

    public String getTableSummary()
    {
        // if there is no data to print, then no point logging a table
        if (Items.isEmpty())
            return "The shopping cart is empty so there is nothing to display.";

        // Like before because it's easier, we can format it using the builtin spacing.
        // I know you didn't teach it yet in class, but this works best
        // also, I don't know how much spacing you prefer. I think 20 looks nice.
        StringBuilder resultTable = new StringBuilder();
        resultTable.append(String.format("%-20s %-20s %-20s%n", "Name", "Manufacturer", "Price ($)"));

        for (Component item : Items)
            resultTable.append(String.format("%-20s %-20s %-20s%n", item.getName(), item.getManufacturer(), item.getPrice()));

        return resultTable.toString();
    }

    public ShoppingCart()
    {
        Items = new ArrayList<Component>();
    }
}
