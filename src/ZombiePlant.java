public class ZombiePlant {
    int maxPotency;
    int initialNumOfSuccessfulTreatments;

    public ZombiePlant(int maxPotency, int initialNumOfSuccessfulTreatments) {
        this.maxPotency = maxPotency;
        this.initialNumOfSuccessfulTreatments = initialNumOfSuccessfulTreatments;
    }

    public int getPotencyRequired()
    {
        return maxPotency;
    }

    public int treatmentsNeeded()
    {
        return initialNumOfSuccessfulTreatments;
    }

    public boolean isDangerous()
    {
        if(initialNumOfSuccessfulTreatments >= 1)
        {
            return true;
        }
        return false;
    }

    public void treat(int treatmentPotency)
    {
        if(treatmentPotency <= maxPotency && treatmentPotency > 0)
        {
            if(initialNumOfSuccessfulTreatments != 0)
            {
                initialNumOfSuccessfulTreatments--;
            }
        }
        else if(treatmentPotency > maxPotency)
        {
            initialNumOfSuccessfulTreatments++;
        }
    }
}
