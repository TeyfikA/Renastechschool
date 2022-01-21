package KPractice;

public class Person {
    private String name;
    private String address;
    private long telephone;

    public Person(String name, String address, long telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return super.toString()+ "Person" +
                "\nname='" + name +
                "\naddress='" + address +
                "\ntelephone=" + telephone
                ;
    }
}
