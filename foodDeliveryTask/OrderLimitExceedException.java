package foodDeliveryTask;

public class OrderLimitExceedException extends RuntimeException{
    private String message;

    public OrderLimitExceedException(String message){
        super(message);

    }

    public String getMessage(String message){
        return message;
    }

}
