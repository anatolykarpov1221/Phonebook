package com.phonebook.tests;

import com.phonebook.data.UserData;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkElementPresent()){
            app.getUser().clickOnSignOutButton();
        }

    }

    @Test(enabled = false)
    public void createNewAccountPositiveTest(){
        //Random random = new Random();
        //int i = random.nextInt(1000)+1000;



        //click on loginlink
        app.getUser().clickOnLoginLink();
        //Enter
        app.getUser().fillLoginRegisterForm(new User().setEmail(UserData.EMAIL)
                .setPassword( UserData.PASSWORD));

        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());


    }

    @Test
    public void createNewAccountWithExistingEmailNegativeTest(){
        //click on loginlink
        app.getUser().clickOnLoginLink();
        //Enter
        app.getUser().fillLoginRegisterForm(new User().setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
//assert Alert is present
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isAlertPresent());


    }

}
