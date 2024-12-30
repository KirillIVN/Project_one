package manager;


import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openContactPage() {
        if (!manager.isElementPresent(By.name("submit"))) {
            click(By.linkText("home"));
        }
    }

    public boolean isContactPresent() {
        openContactPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contact) {
        openContactPage();
        initContactCreation();
        fillContact(contact);
        submitContactCreation();
        returnToHomePage();
    }
    public void removeContact() {
        openContactPage();
        returnToHomePage();
        selectContact();
        removeSelectedContact();
    }

    public void modifyContact(ContactData modifiedName) {
        openContactPage();
        selectContact();
        contactModification();
        fillContact(modifiedName);
        submitContact();
        returnToHomePage();
    }

    private void submitContactCreation() {
        click(By.xpath("(//input[@name=\'submit\'])[2]"));
    }

    private void initContactCreation() {
        click(By.linkText("add new"));
    }

    private void removeSelectedContact() {
        click(By.xpath("//input[@value=\'Delete\']"));
    }

    private void returnToHomePage() {
        click(By.linkText("home"));
    }

    private void submitContact() {
        click(By.name("update"));
    }

    private void fillContact(ContactData contact) {
        type(By.name("firstname"), contact.name1());
        type(By.name("lastname"), contact.name2());
    }

    private void contactModification() {
        click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a"));
    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

}