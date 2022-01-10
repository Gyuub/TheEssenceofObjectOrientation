package object.account.rate;

import object.account.Interest;

/**
 * 이자율 도메인 모델
 */
public abstract class InterestRate {
    private float rate;

    InterestRate(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return (float) rate/100;
    }

    public abstract Interest calculateInterest(int expireDuration, Long amount);
}
