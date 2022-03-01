import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> persons;
    String notification;

    public SeattlePoliceDepartment() {
        this.persons = new ArrayList<>();
    }


    public void publish(String notification){
        this.notification = notification;
        for(Person person : persons){
            person.getNotification();
        }
    }


}
