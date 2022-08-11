import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item); // Adds the item to the arrayList!
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " in your list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // Replaces element with newItem @ index = position.
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

//    public String findItem(String searchItem) {
////        boolean isContain = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) return groceryList.get(position);
//        return null;
//    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) return true;
        return false;
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
