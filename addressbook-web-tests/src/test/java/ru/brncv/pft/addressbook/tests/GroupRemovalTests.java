package ru.brncv.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

    @Test
    public void groupRemovalTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}
