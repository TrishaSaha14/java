package foodDeliveryTask;

public class MenuItemNotFoundException extends RuntimeException{
    private String message;

    public MenuItemNotFoundException(String message){
        super(message);

    }

    public String getMessage(String message){
        return message;
    }
}
