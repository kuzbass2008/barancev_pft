package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
}
