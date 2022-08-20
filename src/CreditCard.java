public class CreditCard {
    int accountNumber;
    int currentAccountBalance;
    int chargeCard (int chargeCard){
        this.currentAccountBalance += chargeCard;
        return currentAccountBalance;
    }
    int drawalСard(int drawalСard){
        this.currentAccountBalance -= drawalСard;
        return currentAccountBalance;
    }
    void info(){
        System.out.println("Account number: " + accountNumber + " current Account Balance: " + currentAccountBalance);
    }
}
