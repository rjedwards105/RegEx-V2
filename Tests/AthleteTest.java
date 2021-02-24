import org.junit.jupiter.api.Test;
import org.junit.platform.commons.JUnitException;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest
{
    @Test
    void getFirstName()
    {
        Athlete tests = new Athlete();
        tests.setFirstName("Lebron");
        String expected = "Lebron";
        assertEquals(expected, tests.getFirstName());
    }

    @Test
    void getLastName()
    {
        Athlete tests = new Athlete();
        tests.setLastName("James");
        String expected = "James";
        assertEquals(expected, tests.getLastName());
    }

    @Test
    void getJerseyNumber()
    {
        Athlete tests = new Athlete();
        tests.setJerseyNumber("23");
        String expected = "23";
        assertEquals(expected, tests.getJerseyNumber());
    }

    @Test
    void getCareerLength()
    {
        Athlete tests = new Athlete();
        tests.setCareerLength("10");
        String expected = "10";
        assertEquals(expected, tests.getCareerLength());
    }

    @Test
    void getTeamCount()
    {
        Athlete tests = new Athlete();
        tests.setTeamCount("10");
        String expected = "10";
        assertEquals(expected, tests.getTeamCount());
    }

    @Test
    void getAgentEmail()
    {
        Athlete tests = new Athlete();
        tests.setAgentEmail("jledore@agents.com");
        String expected = "jledore@agents.com";
        assertEquals(expected, tests.getAgentEmail());
    }

    @Test
    void InvalidFirstName()
    {
        Athlete tests = new Athlete();
        tests.setFirstName("Barry Bonds");
        String expected = "First Name: Invalid input, try again";
        assertEquals(expected, tests.getFirstName());
    }

    @Test
    void InvalidLastName()
    {
        Athlete tests = new Athlete();
        tests.setLastName("Barry Bonds");
        String expected = "Last Name: Invalid input, try again";
        assertEquals(expected, tests.getLastName());
    }

    @Test
    void InvalidJerseyNumber()
    {
        Athlete tests = new Athlete();
        tests.setJerseyNumber("122");
        String expected = "Jersey Number: Invalid input, try again";
        assertEquals(expected, tests.getJerseyNumber());
    }

    @Test
    void InvalidCareerLength()
    {
        Athlete tests = new Athlete();
        tests.setCareerLength("400");
        String expected = "Career Length: Invalid input, try again";
        assertEquals(expected, tests.getCareerLength());
    }

    @Test
    void InvalidTeamCount()
    {
        Athlete tests = new Athlete();
        tests.setTeamCount("1000");
        String expected = "Number of Teams Played For: Invalid input, try again";
        assertEquals(expected, tests.getTeamCount());
    }

    @Test
    void InvalidAgentEmail()
    {
        Athlete tests = new Athlete();
        tests.setAgentEmail("500@a");
        String expected = "Agent Email: Invalid input, try again";
        assertEquals(expected, tests.getAgentEmail());
    }

    @Test
    void InvalidFirstName2()
    {
        Athlete tests = new Athlete();
        tests.setFirstName("Barry123");
        String expected = "First Name: Invalid input, try again";
        assertEquals(expected, tests.getFirstName());
    }

    @Test
    void InvalidLastName2()
    {
        Athlete tests = new Athlete();
        tests.setLastName("Bonds123_Jeff@");
        String expected = "Last Name: Invalid input, try again";
        assertEquals(expected, tests.getLastName());
    }

    @Test
    void InvalidJerseyNumber2()
    {
        Athlete tests = new Athlete();
        tests.setJerseyNumber("-13");
        String expected = "Jersey Number: Invalid input, try again";
        assertEquals(expected, tests.getJerseyNumber());
    }

    @Test
    void InvalidCareerLength2()
    {
        Athlete tests = new Athlete();
        tests.setCareerLength("acded");
        String expected = "Career Length: Invalid input, try again";
        assertEquals(expected, tests.getCareerLength());
    }

    @Test
    void InvalidTeamCount2()
    {
        Athlete tests = new Athlete();
        tests.setTeamCount("-23");
        String expected = "Number of Teams Played For: Invalid input, try again";
        assertEquals(expected, tests.getTeamCount());
    }

    @Test
    void InvalidAgentEmail2()
    {
        Athlete tests = new Athlete();
        tests.setAgentEmail("2kgolden@");
        String expected = "Agent Email: Invalid input, try again";
        assertEquals(expected, tests.getAgentEmail());
    }




    @Test
    void InvalidFirstName3()
    {
        Athlete tests = new Athlete();
        tests.setFirstName("##!@**");
        String expected = "First Name: Invalid input, try again";
        assertEquals(expected, tests.getFirstName());
    }

    @Test
    void InvalidLastName3()
    {
        Athlete tests = new Athlete();
        tests.setLastName("##!@**");
        String expected = "Last Name: Invalid input, try again";
        assertEquals(expected, tests.getLastName());
    }

    @Test
    void InvalidJerseyNumber3()
    {
        Athlete tests = new Athlete();
        tests.setJerseyNumber("##!@**");
        String expected = "Jersey Number: Invalid input, try again";
        assertEquals(expected, tests.getJerseyNumber());
    }

    @Test
    void InvalidCareerLength3()
    {
        Athlete tests = new Athlete();
        tests.setCareerLength("##!@**");
        String expected = "Career Length: Invalid input, try again";
        assertEquals(expected, tests.getCareerLength());
    }

    @Test
    void InvalidTeamCount3()
    {
        Athlete tests = new Athlete();
        tests.setTeamCount("##!@**");
        String expected = "Number of Teams Played For: Invalid input, try again";
        assertEquals(expected, tests.getTeamCount());
    }

    @Test
    void InvalidAgentEmail3()
    {
        Athlete tests = new Athlete();
        tests.setAgentEmail("##!@**");
        String expected = "Agent Email: Invalid input, try again";
        assertEquals(expected, tests.getAgentEmail());
    }

    @Test
    void testToString()
    {
        Athlete tests = new Athlete("Kobe", "Bryant", "24", "20", "1", "rpelinka@agents.com");
        String expected = "Full Name: Kobe Bryant" + "\nJersey Number: 24" + "\nCareer Length: 20" + "\nNumber of Teams Played For: 1" + "\nAgent Email: rpelinka@agents.com" + "\n";
        assertEquals(expected, tests.toString());
    }
}