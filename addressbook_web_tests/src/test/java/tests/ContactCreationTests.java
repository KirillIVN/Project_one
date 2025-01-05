package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;


public class ContactCreationTests extends TestBase {

    public static List<ContactData> contactProvider() {
        var result = new ArrayList<ContactData>();
        for (var name1 : List.of("", "name1")) {
            for (var name2 : List.of("name2", "")) {
                result.add(new ContactData(name1, name2));
            }
        }
        for (int i = 0; i < 5; i++) {
            result.add(new ContactData(randomString(i * 10), randomString(i * 10)));
        }
        return result;
    }

    @ParameterizedTest
    @MethodSource("contactProvider")
    public void createMultipleGroupsTest(ContactData contact) {
        int contactCount = app.contacts().getCountContact();
        app.contacts().createContact(contact);
        int newContactCount = app.contacts().getCountContact();
        Assertions.assertEquals(contactCount + 1, newContactCount);
    }
}
