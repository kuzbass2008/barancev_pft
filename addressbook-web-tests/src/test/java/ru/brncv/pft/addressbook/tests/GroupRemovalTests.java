package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.GroupData;

public class GroupRemovalTests extends TestBase {

    @Test
    public void groupRemovalTest() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}
