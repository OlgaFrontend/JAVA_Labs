import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PersonTest {


    @org.junit.Test
    public void toJSONTest() {
        Person person = new Person("Ivanov Ivan Ivanovich",15);
        String expectedJson="{\"pib\":\"Ivanov Ivan Ivanovich\",\"age\":15}";
        assertEquals(expectedJson,person.toJSON());
    }

    @org.junit.Test
    public void fromJSON() {
        String json="{\"pib\":\"Ivanov Ivan Ivanovich\",\"age\":15}";

        Person expectedPersonFromJson = new Person("Ivanov Ivan Ivanovich",15); ;
        assertEquals(expectedPersonFromJson,Person.fromJSON(json));

    }

    @org.junit.Test
    public void testEquals() {
        Person person1 = new Person("Ivanon Ivan Ivanovich",15);
        Person person2 = new Person("Petrov Ivan Ivanovich",20);
        Person person3 = new Person("Ivanon Ivan Ivanovich",15);

        assertEquals(false,person1.equals(person2));
        assertEquals(true,person1.equals(person3));

    }


    @org.junit.Test
    public void personBeforeSerializationEqualsPersonAfterDeserialization() {
        Person defaultPerson = new Person("Ivanon Ivan Ivanovich",15);

        String jsonFromPerson1 = defaultPerson.toJSON();

Person personAfterDeserialization = Person.fromJSON(jsonFromPerson1);

        assertEquals(true,defaultPerson.equals(personAfterDeserialization));


    }

}