package exercicios_aula.moodle;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;



    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        this.savingsBalance = this.savingsBalance + (this.savingsBalance * annualInterestRate / 12);
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount ac1 = new SavingsAccount(2000);
        SavingsAccount ac2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.09);
        ac1.calculateMonthlyInterest();
        ac2.calculateMonthlyInterest();
        System.out.println("Novos saldos:" + ac1.getSavingsBalance());
        System.out.println("Novos saldos:" + ac2.getSavingsBalance());
    }
}
