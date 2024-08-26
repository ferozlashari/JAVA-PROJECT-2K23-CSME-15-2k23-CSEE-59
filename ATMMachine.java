import java.util.Scanner;

class ATM{

    float balance;
    int  pin = 5674;

    public void checkpin(){
        System.out.println("enter your pin: ");
        Scanner sc =new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if (enteredpin==pin){
            menu();
        }
        else {
            System.out.println("enter a valid pin ");
            menu();
        }

    }
    public void menu(){
        System.out.println("enter your choise:");
        System.out.println("1.check a/c balance");
        System.out.println("2.withdraw money");
        System.out.println("3.deposit money");
        System.out.println("4.exit");

        Scanner sc =new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt==1){
            checkbalance();


        } else if (opt==2) {
            withdrawmoney();

        } else if (opt==3) {
            depositmoney();


        }
        else if (opt==4) {
            return;


        }
        else
            System.out.println("enter invalid choise");
    }
    public void checkbalance(){
        System.out.println("balance:"+balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("enter amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if (amount>balance){
            System.out.println("insufficient  balance");
        }
        else {
            balance=balance-amount;
            System.out.println("money withrdraw succefull");

        }
        menu();
    }
    public void depositmoney(){
        System.out.println("enter the amount: ");
        Scanner sc =new Scanner(System.in);
        float amount= sc.nextFloat();
        balance=balance+amount;
        System.out.println("money deposit successfull");
        menu();

    }
}



public class ATMMachine {
    public static void main(String[] args) {
      ATM obj=new ATM();
      obj.checkpin();
    }

}
