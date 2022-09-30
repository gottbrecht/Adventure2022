import java.util.ArrayList;

public class Item {

    private String item;
    private String itemList;
    private String itemName;

    public String getItem() {
        return item;
    }
    public String getItemList() {
        return itemList;
    }
    private Item (String item, String itemList, String itemName) {
        this.item = item;
        this.itemList = itemList;
        this.itemName = itemName;
    }

    private final ArrayList<Item> itemList = new ArrayList<>();
}
