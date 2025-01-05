package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GroupDeleteTests extends TestBase {

    @Test
    public void deleteGroupTest() {
        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("group name", "group header", "group footer"));
        }
        int groupCount = app.groups().getCount();
        app.groups().deleteGroup();
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount - 1, newGroupCount);
    }

    @Test
    public void deleteAllGroups() {
        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("group name", "group header", "group footer"));
        }
        app.groups().deleteGroups();
        Assertions.assertEquals(0, app.groups().getCount());
    }
}
