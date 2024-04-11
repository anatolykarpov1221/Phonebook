package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkElementPresent()){
            app.getUser().clickOnSignOutButton();
        }

        app.getUser().clickOnLoginLink();
        //Enter
        app.getUser().fillLoginRegisterForm(new User().setEmail("student17@web.com")
                .setPassword( "Super1557!"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest(){
        //click on Add link
        app.getContact().clickOnAddLink();
        //enter name
        app.getContact().fillAddContactForm(new Contact()
                .setName("Petr")
                .setLastName("Petrov")
                .setPhone("7845235699")
                .setEmail("Petr1999@web.com")
                .setAdress("Arctica")
                .setDescription("goalkeeper"));
        //click on Save button
        app.getContact().clickOnSaveButton();
        //assert Contact is added
        Assert.assertTrue(app.getContact().isContactCreated("Petr"));
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }

}

