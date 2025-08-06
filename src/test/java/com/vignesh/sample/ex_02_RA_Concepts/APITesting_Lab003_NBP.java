package com.vignesh.sample.ex_02_RA_Concepts;

public class APITesting_Lab003_NBP {

    public void step1()
    {
        System.out.println("Step 1");
    }
    public void step2()
    {
        System.out.println("Step 2");
    }
    public void step3(String name)
    {
        System.out.println("Step 3 " + name + " - BP");
    }

    public static void main(String[] args) {
        APITesting_Lab003_NBP nbp = new APITesting_Lab003_NBP();
        nbp.step1();
        nbp.step2();
        nbp.step3("Vignesh");
    }
}

