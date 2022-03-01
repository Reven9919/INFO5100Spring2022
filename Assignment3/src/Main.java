public class Main<SPD> {
    public static void main(String[] args){
        Person p1 = new Person("p1",24);
        Person p2 = new Person("p2",15);
        Person p3 = new Person("p3",68);
        Person p4 = new Person("p4",34);

        SeattlePoliceDepartment SPD = new SeattlePoliceDepartment();

        p1.subscribe(SPD);
        p3.subscribe(SPD);
        p2.unsubscribe(SPD);
        p4.unsubscribe(SPD);

        SPD.publish("message");
        SPD.publish("message");

    }

}
