package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkElementPresent()){
            app.getUser().clickOnSignOutButton();
        }

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegisterForm(new User().setEmail("student17@web.com")
                .setPassword("Super1557!"));
        app.getUser().clickOnLoginButton();

        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Petr")
                .setLastName("Petrov")
                .setPhone("7845235699")
                .setEmail("Petr1999@web.com")
                .setAddress("Arctica")
                .setDescription("goalkeeper"));
        app.getContact().clickOnSaveButton();

    }
    @Test
    public void deleteContactPositiveTest() {
        int sizeBefore = app.getContact().sizeOfContacts();
       app.getContact().removeContact();

        app.getContact().pause(1500);
        int sizeAfter = app.getContact().sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }


}




