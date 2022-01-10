package object.account.rate;

import object.account.Interest;

/**
 * 복리 이자율
 */
public class CompoundInterestRate extends InterestRate{

    public CompoundInterestRate(float rate) {
        super(rate);
    }

    /**
     * 원금(P) * ( 1+ 이율(i))^기간(n) )
     * @param expireDuration
     * @param amount
     * @return
     */
    @Override
    public Interest calculateInterest(int expireDuration, Long amount) {
        return new Interest(expireDuration, (long) (amount * Math.pow(1 + this.getRate(),expireDuration/12)));
    }
}
