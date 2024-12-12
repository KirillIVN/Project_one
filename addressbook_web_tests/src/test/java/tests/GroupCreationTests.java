package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void createGroupTest() {
        app.groups().createGroup(new GroupData("name", "group header", "group footer"));
    }

    @Test
    public void createGroupEmptyNameTest() {
        app.groups().createGroup(new GroupData());
    }

    @Test
    public void createGroupWithNameTest() {
        app.groups().createGroup(new GroupData().withName("some name"));
    }
}

