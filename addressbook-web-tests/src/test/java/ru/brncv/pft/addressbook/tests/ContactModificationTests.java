package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.ContactData;

/**
 * Created by ikuznecov on 06.07.2017.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void contactModificationTest() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact())
            app.getContactHelper().createContact(new ContactData("Ivan", "Kuznetcov", "Test"));
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Kuznetcov", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
