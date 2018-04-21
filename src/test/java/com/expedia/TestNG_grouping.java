package com.expedia;

import org.testng.annotations.*;

public class TestNG_grouping {

    @BeforeClass(alwaysRun = true)
    public void setUp()
    {
        System.out.println("*********************Grouping Methods class Start************************");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp(){
        System.out.println("*********************Grouping  Methods class  End************************");

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("Grouping  Methods  -> Runs before Every Method");

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("Grouping  Methods  -> Runs After Every Method");

    }

    @Test(groups = {"cars"})
    public void testBmw(){
        System.out.println("This test is for BMW X6");

    }

    @Test(groups = {"cars"})
    public void testAudii(){
        System.out.println("This test case is for Audii A-8");

    }

    @Test(groups = {"cars"})
    public void testMercedes(){
        System.out.println("This test case is for S-class");

    }

    @Test(groups = {"bikes"})
    public void testNinja(){
        System.out.println("This test case is for Kawasaki Ninja H2r");

    }


    @Test(groups = {"bikes"})
    public void testDucati(){
        System.out.println("This test case is for Ducati 999");

    }

    @Test(groups = {"bikes"})
    public void testSuzuki(){
        System.out.println("This test case is for Hayabusa");

    }
}
