package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.ContactData;

/**
 * Created by ikuznecov on 06.07.2017.
 */
public class ContactRemovalTest extends TestBase {

    @Test
    public void contactRemovalTest() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact())
            app.getContactHelper().createContact(new ContactData("Ivan", "Kuznetcov", "Test"));
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().submitContactDeletion();
    }
}
