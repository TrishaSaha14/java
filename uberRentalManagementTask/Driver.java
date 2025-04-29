package uberRentalManagementTask;

public class Driver extends User{
    private boolean available = true;
    public Driver(String id, String name) {
        super(id, name);
        this.available=true;
    }

    public boolean isAvailable(){
        if(this.available){
            return true;
        }
        else {
            return false;
        }
    }

    public void setAvailable(boolean available){
        this.available=available;
    }
    @Override
    void showProfile() {
        System.out.println("The name of the driver is: "+getName()+" The driver is available: "+isAvailable());
    }
}
