package com.phonebook.tests;

import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkElementPresent()){
            app.getUser().clickOnSignOutButton();
        }

    }

    @Test
    public void loginPositiveTest(){

    //click on loginlink
        app.getUser().clickOnLoginLink();
        //Enter
        app.getUser().fillLoginRegisterForm(new User().setEmail("student17@web.com")
                .setPassword( "Super1557!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());



    }
    @Test
    public void loginNegativeTestWithoutEmail(){

        //click on loginlink
        app.getUser().clickOnLoginLink();
        //Enter
        app.getUser().fillLoginRegisterForm(new User().setPassword("Super1557!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());



    }
}