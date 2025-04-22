package foodDeliveryTask;

import java.util.ArrayList;

public class Restaurant {

    String resName;
   // String[] menu;
    ArrayList<String> menu = new ArrayList<>();
    static int count=0;
    String name;
    int password;
    public Restaurant(String resName){
        this.resName=resName;

    }
    public void addMenu(String item){
        menu.add(item);
        count++;
    }

    public void displayMenu(){
        System.out.println(menu);
    }
    public boolean hasItem(String item){
        return menu.contains(item);
    }

}
