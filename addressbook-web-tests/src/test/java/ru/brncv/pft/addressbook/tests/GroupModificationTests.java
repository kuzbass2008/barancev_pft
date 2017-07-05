package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.brncv.pft.addressbook.model.GroupData;

/**
 * Created by ikuznecov on 05.07.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
