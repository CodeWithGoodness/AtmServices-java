public class Options {
    private final double initialBalance = 100;
   public double withdrawal_amount;
   private double deposit;
    Options ( double newWithdrawal_amount, double newDeposit){
        withdrawal_amount = newWithdrawal_amount;
        deposit = newDeposit;
    }
    public void setWithdrawal_amount(double withdrawal_amount) {
        this.withdrawal_amount += withdrawal_amount;
    }
    public void setDeposit(double deposit) {
        this.deposit += deposit;
    }
   public double getFinal_balance(){
        return initialBalance + deposit - withdrawal_amount;
    }
    public void myOptions(){
        System.out.println("Main menu \n 1: check balance \n 2: withdraw \n 3: deposit \n 4: exit ");
    }
}
//prints menu if option is found