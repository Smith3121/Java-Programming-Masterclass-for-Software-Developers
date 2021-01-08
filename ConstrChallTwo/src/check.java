public class check {
    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Angelica", 1000.00, "anie@mail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
    }
}