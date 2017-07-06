package ru.brncv.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by ikuznecov on 06.07.2017.
 */
public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Ivan", "Kuznetcov", "Test"));
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }
}
