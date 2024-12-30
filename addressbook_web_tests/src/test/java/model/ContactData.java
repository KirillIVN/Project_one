package model;

public record ContactData(String name1, String name2) {

    public ContactData() {
        this("", "");
    }

    public ContactData withFirstName(String name) {
        return new ContactData(name, this.name2);
    }

    public ContactData withSecondName(String name) {
        return new ContactData(this.name1, name);
    }
}