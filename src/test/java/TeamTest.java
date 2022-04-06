import domain.Team;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.Constants;

import static junit.framework.Assert.assertEquals;

public class TeamTest {

    private static Team teamA;
    private static Team teamB;


    @BeforeAll
    public static void setup() {
        teamA = new Team("cb smv", "benjamin", "german", 12, Constants.QUOTA);
        teamB = new Team("cb smv", "benjamin", "german", 12, Constants.QUOTA);
    }

    @Test
    public void getName() {
        String name = teamA.getName();
        assertEquals(teamB.getName(), name);
    }

    @Test
    public void getCategory() {
        String category = teamA.getCategory();
        assertEquals(teamB.getCategory(), category);
    }

    @Test
    public void getCoach() {
        String coach = teamA.getCoach();
        assertEquals(teamB.getCoach(), coach);
    }

    @Test
    public void getMaxPlayer() {
        int maxPlayer = teamA.getMaxPlayer();
        assertEquals(teamB.getMaxPlayer(), maxPlayer);
    }

    @Test
    public void getQuota() {
        float  quota = teamA.getQuota();
        assertEquals(225.50f, quota);
    }
}
