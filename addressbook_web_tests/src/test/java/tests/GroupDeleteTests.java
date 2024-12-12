package tests;

import org.junit.jupiter.api.Test;


public class GroupDeleteTests extends TestBase {

    @Test
    public void deleteGroupTest() {
        if (app.groups().isGroupPresent()) {
            app.groups().removeGroup();
        } else {
            System.out.println("Delete is nothing");
        }
    }

}
