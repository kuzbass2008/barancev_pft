package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.ContactData;

/**
 * Created by ikuznecov on 06.07.2017.
 */
public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().createContact(new ContactData("Ivan", "Kuznetcov", "Test"));
    }
}
