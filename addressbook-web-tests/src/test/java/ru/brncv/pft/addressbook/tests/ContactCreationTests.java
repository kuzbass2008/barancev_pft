package ru.brncv.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by ikuznecov on 06.07.2017.
 */
public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact = new ContactData("Ivan", "Kuznetcov", "Test");
        app.getContactHelper().createContact(contact);
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(contact);
        Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }
}
