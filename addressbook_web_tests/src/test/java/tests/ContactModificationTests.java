package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactModificationTests extends TestBase {

    @Test
    void contactModificationTest() {
        if (app.contacts().getCountContact() == 0) {
            app.contacts().createContact(new ContactData("name1", "name2"));
        }
        app.contacts().modifyContact(new ContactData().withFirstName("modify first name"));
//        app.contacts().modifyContact(new ContactData().withSecondName("modify last name"));
    }
}