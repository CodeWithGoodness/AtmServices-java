import  java.util.Scanner;
public class AtmServices {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String [] id = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; //An array of users id
        Options id_options = new Options(0, 0);
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
                id_options.myOptions();
                System.out.print("Enter a choice: ");
                String choice = input.next();
                if (choice .equals( "1")){
                    System.out.println( "The balance is $ " + id_options.getFinal_balance());
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




