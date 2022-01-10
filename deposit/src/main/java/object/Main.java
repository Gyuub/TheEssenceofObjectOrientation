package object;

import object.account.Account;
import object.account.Deposit;
import object.account.Interest;
import object.account.rate.CompoundInterestRate;
import object.account.rate.InterestRate;
import object.account.rate.SimpleInterestRate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //단리 예제
        SimpleInterestRate simpleInterestRate = new SimpleInterestRate(3f);
        Deposit deposit = createDeposit(simpleInterestRate);
        Interest interest = deposit.calculateInterest(LocalDate.of(2021, 1, 1));

        CompoundInterestRate compoundInterestRate = new CompoundInterestRate(3f);
        Deposit deposit2 = createDeposit(compoundInterestRate);
        Interest interest2 = deposit2.calculateInterest(LocalDate.of(2021, 1, 1));

        System.out.println("interest.getDepositMonth() = " + interest.getDepositMonth());
        System.out.println("interest.getAmount() = " + interest.getAmount());

        System.out.println("interest2.getDepositMonth() = " + interest2.getDepositMonth());
        System.out.println("interest2.getAmount() = " + interest2.getAmount());
    }

    public static Deposit createDeposit(InterestRate interestRate){
        Deposit deposit = new Deposit(LocalDate.of(2022, 1, 1), 36);
        Account account = new Account(123456l, 1000000l, interestRate);
        deposit.createAccount(account);
        return deposit;
    }

}
