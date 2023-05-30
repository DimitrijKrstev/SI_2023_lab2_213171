import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testEveryBranch(){
        RuntimeException e;
        //A-B-U
        e = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertEquals("Mandatory information missing!", e.getMessage());

        List<User> users = new LinkedList<>();
        users.add(new User(null, "!asdasd", "dimi@example.com"));

        //A-C-D-E-F-G-H-I-J-K-G-L-M-N-U
        //password length < 8
        assertFalse(SILab2.function(new User(null, "!asdasd", "dimi@example.com"), users));
        //A-C-E-M-O-T-U
        assertFalse(SILab2.function(new User("backo", "!asdasdas dasdw2dw", "dimi2examplecom"), users));
        //A-C-E-F-G-H-J-G-L-M-O-P-Q-P-S-T-U
        assertFalse(SILab2.function(new User("backo", "asdasdasdasdw2dw", "dimi2@example.com"), users));
        //A-C-D-E-F-G-H-J-G-L-M-O-P-Q-R-U
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
