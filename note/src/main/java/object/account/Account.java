package object.account;

import object.account.rate.InterestRate;


/**
 * 객체지향의 사실과 오해
 * 정기 예금의 도메인 모델
 */
public class Account {
    private Long accountNumber; // 계좌번호
    private Long amount; // 총액

    InterestRate interestRate; //이자율

    public Account(Long accountNumber, Long amount, InterestRate interestRate) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public Interest calculateInterest(int expireDuration){
        return interestRate.calculateInterest(expireDuration, amount);
    }
}
