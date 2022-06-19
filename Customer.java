package lesson2;

import lesson2.basics.typicalprogram.Address;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum, Address billingAddress, Address shippingAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString(){
        return "[" +this.getFirstName() + "," + this.getLastName() + ", ssn: " + this.getSocSecurityNum() + "]";
    }
    public static void main(String [] args){
        Address billingAddressOne = new Address("1000 N 4th ST", "Fairfield", "IA" , "52556");
        Address shippingAddressOne = new Address("1000 N 4th ST", "Fairfield", "IA" , "52557");
        Address billingAddressTwo = new Address("Calva 200 ST", "Chicago", "Illinois" , "92556");
        Address shippingAddressTwo = new Address("Calva 200 ST", "Chicago", "Illinois" , "92557");

        Customer customerOne = new Customer("John", "Doe", "4883-4884-333", billingAddressOne, shippingAddressOne);
        Customer customerTwo = new Customer("Christina", "Murphy", "4883-4884-333", billingAddressTwo, shippingAddressTwo);

        Customer [] customers = {customerOne, customerTwo};

        for (Customer customer : customers){
            if (customer.getShippingAddress().getCity().equals("Chicago"))
                System.out.println(customer);
        }
    }
}
