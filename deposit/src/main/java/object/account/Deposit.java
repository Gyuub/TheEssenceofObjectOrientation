package object.account;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 정기예금 도메인 모델
 */
public class Deposit {
    private LocalDate duration; // 정기예금 해지일자
    private int expireDuration; // 정기예금 약정 기간 (월)
    private Account account;

    public Deposit(LocalDate duration, int expireDuration) {
        this.duration = duration;
        this.expireDuration = expireDuration;
    }

    public Interest calculateInterest(){
        return account.calculateInterest(expireDuration);
    }

    public Interest calculateInterest(LocalDate duration){
        return account.calculateInterest(calculateDuration(duration));
    }

    /**
     * 해지일자 기준,계산
     * @param expireDate
     * @return
     */
    private int calculateDuration(LocalDate expireDate){
        return expireDuration - (int) ChronoUnit.MONTHS.between(expireDate, duration);
    }

    /**
     * 계좌연결
     * @param account
     */
    public void createAccount(Account account){
        this.account = account;
    }

}
