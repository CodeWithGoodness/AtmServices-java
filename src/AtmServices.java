import  java.util.Scanner;
public class AtmServices {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double withdrawal = 0; double deposit = 0;
        String [] id = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; //An array of users id
        Options id_options = new Options(id,withdrawal, deposit);
        boolean found = false;
        int j =0;
        while (true){
            System.out.print("Enter an id: ");
            String id_input = input.next();
            for (int i = 0; i < 10; i++) {         //checks for user's id in the stored array
                if(id[i].equals(id_input))
                    found = true;
            }
            if (found){
                System.out.println("Main menu ");           //prints menu if option is found
                System.out.println("1: check balance ");
                System.out.println("2: withdraw ");
                System.out.println("3: deposit ");
                System.out.println("4: exit ");
                System.out.print("Enter a choice: ");
                String choice = input.next();
                if (choice .equals( "1")){
                    System.out.println( "The balance is " + id_options.getFinal_balance());
                }
                else  if(choice.equals ("2")){
                    System.out.print("Enter the amount to withdraw: ");
                    id_options.setWithdrawal_amount(input.nextDouble());

                }
                else if(choice .equals("3")){
                    System.out.print("Enter an amount to deposit: ");
                    id_options.setDeposit(input.nextDouble());
                }
                j++;
            }
        }
    }
}

class Options{
    String [] id = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    final double initialBalance = 100;
    double withdrawal_amount = 0;
    double deposit = 0;
    Options (String [] id, double newWithdrawal_amount, double newDeposit){
        withdrawal_amount = newWithdrawal_amount;
        deposit = newDeposit;
    }
    String[] getId(){
        return  id;
    }
    public void setWithdrawal_amount(double withdrawal_amount) {
        this.withdrawal_amount += withdrawal_amount;

    }
    public void setDeposit(double deposit) {
        this.deposit += deposit;
    }
    double getFinal_balance(){
        return initialBalance + deposit - withdrawal_amount;
    }
}

