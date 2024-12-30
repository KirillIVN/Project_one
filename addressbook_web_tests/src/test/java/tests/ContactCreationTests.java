package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;


public class ContactCreationTests extends TestBase {


    @Test
    public void createContactTest() {
        app.contacts().createContact(new ContactData("name1", "name2"));
    }

    @Test
    public void createContactWithEmptyDateTest() {
        app.contacts().createContact(new ContactData());
    }

    @Test
    public void createContactWithNameDateTest() {
        app.contacts().createContact(new ContactData().withFirstName("some name"));
    }
}
