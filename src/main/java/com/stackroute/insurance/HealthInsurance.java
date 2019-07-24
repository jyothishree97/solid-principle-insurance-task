package com.stackroute.insurance;

public class HealthInsurance extends InsuranceSurvey{


    //creating a method in health insurance class which checks the validity of a claim and return the value
    //the approved or rejected message.

    public void validClaim(){

        ClaimApproval claimApproval=new ClaimApproval();

        int hospitalbills = 10000;
        if (hospitalbills>50000){
            claimApproval.setResult(true);
            System.out.println("true");
            claimApproval.isResult();
        }
        else
            claimApproval.setResult(false);



    }

}
