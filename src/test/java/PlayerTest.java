import domain.Player;
import domain.Team;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.Constants;

import static junit.framework.Assert.assertEquals;

public class PlayerTest {

    private static Player playerA;
    private static Player playerB;


    @BeforeAll
    public static void setup() {
        playerA = new Player ("german", "rodriguez", 13, 19011981, "50979686 W");
        playerB = new Player ("german", "rodriguez", 13, 19011981, "50979686 W");
    }

    @Test
    public void getFirstName() {
        String firstName = playerA.getFirstName();
        assertEquals(playerB.getFirstName(), firstName);
    }

    @Test
    public void getLastName() {
        String lastName = playerA.getLastName();
        assertEquals(playerB.getLastName(), lastName);
    }

    @Test
    public void getNumber() {
        int number = playerA.getNumber();
        assertEquals(playerB.getNumber(), number);
    }

    @Test
    public void getyearOfBirth() {
        int yearOfBirth = playerA.getYearOfBirth();
        assertEquals(playerB.getYearOfBirth(), yearOfBirth);
    }

    @Test
    public void getDni() {
        String dni = playerA.getDni();
        assertEquals(playerB.getDni(), dni);
    }
}

