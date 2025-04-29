package uberRentalManagementTask;
import java.util.Iterator;
import java.util.List;

@SecurityCheck(role="Admin")
public class Admin extends User{

    public Admin(String id, String name) {
        super(id, name);
    }

    Class<SecurityCheck> cls = SecurityCheck.class;
    SecurityCheck info = cls.getDeclaredAnnotation(SecurityCheck.class);

    @Override
    void showProfile() {
        System.out.println("Name: "+name+" Role: "+info.role());

    }

    public void removeDriver(List<Driver> drivers,String id) {
        if(cls.isAnnotationPresent(SecurityCheck.class)) {
            Iterator<Driver> itr = drivers.iterator();
            while(itr.hasNext()) {
                Driver x = itr.next();
                if(x.getId().equals(id)){
                    itr.remove();
                    System.out.println("The driver has been removed successfully");
                    return;
                }
            }
            System.out.println("No such driver found");
        }

    }
}