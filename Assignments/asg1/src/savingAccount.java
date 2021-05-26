public class savingAccount {
    final static float interest_rate = 1.2f;
    final int AccountNo;
    float balance;

    public savingAccount() {
        AccountNo = 111111111;
    }

    public void addInterest(int amount) {
        balance += (interest_rate / 100) * amount + amount;
    }

    public float getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        savingAccount owner1 = new savingAccount();
        owner1.addInterest(50000);
        System.out.println("Account Number: " + owner1.AccountNo + "\t" + "Interest Rate: " + interest_rate
                + "\tBalance: " + owner1.getBalance());

    }

}
