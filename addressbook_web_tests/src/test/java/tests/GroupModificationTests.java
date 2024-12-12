package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    void GroupModifyTest() {
        if (app.groups().isGroupPresent()) {
            app.groups().removeGroup();
        } else {
            System.out.println("Modify is nothing");
        }
        app.groups().modifyGroup(new GroupData().withName("modified name"));
    }
}
