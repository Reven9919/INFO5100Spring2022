public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void getNotification(SeattlePoliceDepartment seattlePoliceDepartment){
        System.out.println("*****************");
        System.out.println("Person Name" + this.getName());
        System.out.println("notification" + seattlePoliceDepartment.notification);
        System.out.println("*****************");
    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment){

        if(!SeattlePoliceDepartment.persons.contains(this))
            seattlePoliceDepartment.persons.add(this);
    }
    public void unsubscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        seattlePoliceDepartment.persons.remove(this);
    }

    public void getNotification() {
        return;
    }
}
