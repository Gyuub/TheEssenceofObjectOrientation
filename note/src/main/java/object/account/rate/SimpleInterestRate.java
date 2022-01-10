package object.account.rate;

import object.account.Interest;

/**
 * 단리 이자율
 */
public class SimpleInterestRate extends InterestRate{
    public SimpleInterestRate(float rate){
        super(rate);
    }

    /**
     * 원금 * 이율 * 기간[연12] + 원금
     * @param expireDuration
     * @param amount
     * @return
     */
    @Override
    public Interest calculateInterest(int expireDuration, Long amount) {
        return new Interest(expireDuration, (long) (amount * (expireDuration/12) * this.getRate()));
    }
}
