package airlinereservationsystemarray;

import java.util.Scanner;

public class Customer {


    private String firstName;
    private String lastName;
    private int age;
    private int dateOfBirth;
    private int rewardsPoints;
     public Customer(String firstName, String lastName, int age, int dateOfBirth, int rewardsPoints){
         this.firstName=firstName;
         this.lastName=lastName;
         this.age =age;
         this.dateOfBirth=dateOfBirth;
         this.rewardsPoints=rewardsPoints;
     }
     public Customer(){

     }
     public String getFirstName(){
         return firstName;
     }
     public void setFirstName(String firstName){
         this.firstName=firstName;
     }
    public String getLastName(){
         return lastName;
    }
    public void setLastName(String lastName){
         this.lastName=lastName;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int age){
         this.age=age;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRewardsPoints() {
        return rewardsPoints;
    }

    public void setRewardsPoints(int rewardsPoints) {
        this.rewardsPoints = rewardsPoints;
    }
    public void takeInput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Name: ");
        this.firstName=sc.nextLine();
        System.out.println("Enter Last Name");
        this.lastName=sc.nextLine();
        System.out.println("Enter Age");
        this.age=sc.nextInt();
        System.out.println("Enter Date Of Birth");
        this.dateOfBirth=sc.nextInt();
        System.out.println("Enter RewardsPoint");
        this.rewardsPoints=sc.nextInt();
        sc.nextLine();
    }
}