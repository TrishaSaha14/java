package foodDeliveryTask;

public class Customer {
    String name;
    int password;
    Restaurant res;
    public Customer(Restaurant res,String name,int password){
        this.res=res;
        this.name=name;
        this.password=password;
    }
    boolean flag=false;
    public boolean loggin(String name,int password){
        if(this.name.equals(name) && this.password==password){
            System.out.println("Successfully logged-in");
            flag = true;
            return true;
        }
        else{
            System.out.println("Invalid name or password");
            flag=false;
            return false;
        }
    }
    int order=0;
    public void placeOrder(String item) {

        if(flag){
            if(order<5){

                if(res.hasItem(item)){
                    System.out.println("Order placed");
                    order++;
                }
                else{
                    throw new MenuItemNotFoundException("Menu item is not present");

                }

            }
            else{
                throw new OrderLimitExceedException("Cannot order more than 5 items");
            }
        }
        else{
            System.out.println("Invalid user");
        }

    }


}
