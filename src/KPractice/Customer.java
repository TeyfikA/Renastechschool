package KPractice;

public class Customer extends Person{


    private long CustomerNumber;
    boolean MailingList=true;

    public Customer(String name, String address, long telephone, long customerNumber, boolean mailingList) {
        super(name, address, telephone);
        CustomerNumber = customerNumber;
        MailingList = mailingList;
    }

    public long getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return MailingList;
    }

    @Override
    public String toString() {
        return super.toString()+ "Customer"+
                "\nCustomerNumber=" + CustomerNumber +
                "\nMailingList=" + MailingList
                ;
    }

    public void setMailingList(boolean mailingList) {
        MailingList = mailingList;

    }
}
