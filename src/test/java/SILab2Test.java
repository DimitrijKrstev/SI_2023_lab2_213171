import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testEveryBranch(){
        RuntimeException e;
        //A-B-U
        //Sluchaj kade se ispolnuva B (user == null)
        e = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        List<User> users = new LinkedList<>();
        users.add(new User("dimi", "!asdasd", "dimi@example.com"));

        //A-C-D-E-F-G-H-I-J-K-G-L-M-N-U
        //Se ispolnuva I,K(users contains user), N(password length < 8)
        assertFalse(SILab2.function(new User("dimi", "!asdasd", "dimi@example.com"), users));
        //A-C-D-E-M-O-T-U
        //Se ispolnuva D(username == null), E-M(email nema @), O-T-U(password ima " ")
        assertFalse(SILab2.function(new User(null, "!asdasdas dasdw2dw", "dimi2examplecom"), users));
        //A-C-E-F-G-H-J-G-L-M-O-P-Q-P-S-T-U
        //Se ispolnuva P-S-T-U(password nema special character)
        assertFalse(SILab2.function(new User("backo", "asdasdasdasdw2dw", "dimi2@example.com"), users));
        //A-C-D-E-F-G-H-J-G-L-M-O-P-Q-R-U
        //Se ispolnuva R-U(password ima special character)
        assertTrue(SILab2.function(new User("backo", "!asdasdasdasdw2dw", "dimi3@example.com"), users));
    }

    @Test
    void multipleCondition(){
        RuntimeException e;
        e = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("dimi", null, null), null));
        assertEquals("Mandatory information missing!", e.getMessage());

        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("dimi", "asdasdadw!sdo", null), null));
        assertEquals("Mandatory information missing!", e.getMessage());

        e = assertThrows(RuntimeException.class, () -> SILab2.function(new User("dimi", "asdasdasds!dwa", "dimi@example.com"), null));
        assertNotEquals("Mandatory information missing!", e.getMessage());
    }
}
