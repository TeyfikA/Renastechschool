package KPractice;

public class PreferredCustomer extends Customer {
    private double purcase;
    private double DiscountLevel;

    public PreferredCustomer(String name, String address, long telephone, long customerNumber, boolean mailingList, double purcase, double discountLevel) {
        super(name, address, telephone, customerNumber, mailingList);
        this.purcase = purcase;
        DiscountLevel = discountLevel;
    }

    public double getPurcase() {
        return purcase;
    }

    public void setPurcase(double purcase) {
        this.purcase = purcase;
    }

    public double getDiscountLevel() {
        return DiscountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        DiscountLevel = discountLevel;
    }




    @Override
    public String toString() {
        return "PreferredCustomer" +
                "\npurcase=" + purcase +
                "\nDiscountLevel=" + DiscountLevel
                ;
    }
}
