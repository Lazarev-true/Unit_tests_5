package main.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class NoteTests {
    private Contact contact;
    private Contact contact1;
    private List<Contact> listContacts;

    @BeforeEach
    void setUp() {
        Contact contact = new Contact(1, "Oleg", "557799");
        Contact contact1 = new Contact(2, "Kolya", "123456");
    }

    @Test
    void checkedId() {
        int id = 1;
        assertThat(id).isEqualTo(1);
    }

    @Test
    void checkedName() {
        String name1 = "Oleg";
        assertThat(name1).isEqualTo("Oleg");
    }

    @Test
    void checkedNumberOfTelephone() {
        String numberTelephone = "557799";
        assertThat(numberTelephone).isEqualTo("557799");
    }

    @Test
    void testAddContactToNote() {
        List<Contact> note = new ArrayList<>();
        note.add(contact);
        note.add(contact1);

        assertTrue(note.add(contact));
        assertTrue(note.add(contact1));
    }

    @Test
    void testDeleteContact() {
        Note note = mock(Note.class);
        note.deleteContact(contact, listContacts);
        assertFalse(note == null);
    }
}
