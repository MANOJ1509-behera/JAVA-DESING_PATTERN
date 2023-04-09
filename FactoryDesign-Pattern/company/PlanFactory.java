package com.company;

public class PlanFactory {
    public plan getPlan(String planName){
        if(planName == null) {
            return null;
        }
        if(planName.equalsIgnoreCase("domestic")){
            return new DomesticPlan();
        }
        else if(planName.equalsIgnoreCase("commercial")){
            return new commercialPlan();
        }
       else if(planName.equalsIgnoreCase("industrial")){
            return new IndustrialPlan();
        }

       return null;

    }
}
