package object.account;

/**
 * 이자 도메인 모델
 */
public class Interest {
    private int depositMonth;
    private Long amount;


    public Interest(int depositMonth, Long amount) {
        this.amount = amount;
        this.depositMonth = depositMonth;
    }

    public int getDepositMonth() {
        return depositMonth;
    }

    public Long getAmount() {
        return amount;
    }
}
