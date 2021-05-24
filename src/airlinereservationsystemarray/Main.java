package airlinereservationsystemarray;

import java.util.Scanner;

public class Main {
    static final int CUSTOMER_TOTAL =1;
    static int anInt=10;
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        Customer [] customers= new Customer[CUSTOMER_TOTAL];
        for(int i=0;i<CUSTOMER_TOTAL;i++){
            //customers[i]=new Customer();
            //customers[i].takeInput();
            //customers[i]=inputCustomer();
            customers[i]=inputUsingConstructor();
        }

    }
    public static Customer inputCustomer()
    {
        Customer customer= new Customer();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstMame= sc.nextLine();
        customer.setFirstName(firstMame);
        System.out.println("Enter Last Name");
        customer.setLastName(sc.nextLine());
        System.out.println("Enter Age");
        customer.setAge(sc.nextInt());
        System.out.println("Enter Date Of Birth");
        customer.setDateOfBirth(sc.nextInt());
        System.out.println("Enter RewardsPoint");
        customer.setRewardsPoints(sc.nextInt());
        sc.nextLine();
        return customer;
    }
    public static Customer inputUsingConstructor()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstMame= sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName= sc.nextLine();
        System.out.println("Enter Age");
        int age= sc.nextInt();
        System.out.println("Enter Date Of Birth");
        int dob=sc.nextInt();
        System.out.println("Enter RewardsPoint");
        int rewards=sc.nextInt();
        sc.nextLine();
        Customer dim= new Customer(firstMame,lastName,age,dob,rewards);
        return dim;
    }

}
