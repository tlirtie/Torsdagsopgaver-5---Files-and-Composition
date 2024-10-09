package Task1;


import java.util.*;

public class Main{





    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer customer1 = new Customer("Henrik","Jensen","Henri1");
        Customer customer2 = new Customer("Henrik", "Jensen","Jensi87");
        Customer customer3 = new Customer("Flemming","Sørensen","Flem");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);




    }

    public static void printCustomers(ArrayList<Customer> customers){

        for (Customer c : customers){
            System.out.println(c);
        }
    }
}