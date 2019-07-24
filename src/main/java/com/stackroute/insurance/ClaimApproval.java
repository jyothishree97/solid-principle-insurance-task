package com.stackroute.insurance;

public class ClaimApproval extends HealthInsurance{


    //validate the claim file

   private boolean result;
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {

        this.result = result;
        if(isResult()==false)
        System.out.println("insurance rejected");
        else
            System.out.println("approved");
    }

}
