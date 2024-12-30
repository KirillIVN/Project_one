package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactDeleteTests extends TestBase {

    @Test
    public void deleteContactTest() {
        if (!app.contacts().isContactPresent()) {
            app.contacts().createContact(new ContactData("name1", "name2"));
        }
        app.contacts().removeContact();
    }
}
