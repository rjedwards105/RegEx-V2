public class Athlete
{

    private String firstName;
    private String lastName;
    private String jerseyNumber;
    private String careerLength;
    private String teamCount;
    private String agentEmail;

    public Athlete(String firstName, String lastName, String jerseyNumber, String careerLength, String teamCount, String agentEmail)
    {
        this.firstName = checkFirstName(firstName);
        this.lastName = checkLastName(lastName);
        this.jerseyNumber = checkJerseyNumber(jerseyNumber);
        this.careerLength = checkCareerLength(careerLength);
        this.teamCount = checkTeamCount(teamCount);
        this.agentEmail = checkAgentEmail(agentEmail);
    }

    public Athlete()
    {
        this.firstName = "";
        this.lastName = "";
        this.jerseyNumber = "";
        this.careerLength = "";
        this.teamCount = "";
        this.agentEmail = "";
    }


    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getJerseyNumber()
    {
        return jerseyNumber;
    }

    public String getCareerLength()
    {
        return careerLength;
    }

    public String getTeamCount()
    {
        return  teamCount;
    }

    public String getAgentEmail()
    {
        return agentEmail;
    }



    public void setFirstName(String firstName)
    {
        this.firstName = checkFirstName(firstName);
    }

    public void setLastName(String lastName)
    {
        this.lastName = checkLastName(lastName);
    }

    public void setJerseyNumber(String jerseyNumber)
    {
        this.jerseyNumber = checkJerseyNumber(jerseyNumber);
    }

    public void setCareerLength(String careerLength)
    {
        this.careerLength = checkCareerLength(careerLength);
    }

    public void setTeamCount(String teamCount)
    {
        this.teamCount = checkTeamCount(teamCount);
    }

    public void setAgentEmail(String agentEmail)
    {
        this.agentEmail = checkAgentEmail(agentEmail);
    }



    private String checkFirstName(String firstName)
    {
        if(!firstName.matches("[A-Z][A-Za-z]+"))
        {
            firstName = "First Name: Invalid input, try again";
        }
        return firstName;
    }

    private String checkLastName(String lastName)
    {
        if(!lastName.matches("[A-Z]([A-Za-z]|-)+"))
        {
            lastName = "Last Name: Invalid input, try again";
        }
        return lastName;
    }


    private String checkJerseyNumber(String jerseyNumber)
    {
        if(!jerseyNumber.matches("[0-9]{1,2}"))
        {
            jerseyNumber = "Jersey Number: Invalid input, try again";
        }
        return jerseyNumber;
    }

    private String checkCareerLength(String careerLength)
    {
        if(!careerLength.matches("[0-9]{1,2}"))
        {
            careerLength = "Career Length: Invalid input, try again";
        }
        return careerLength;
    }

    private String checkTeamCount(String teamCount)
    {
        if(!teamCount.matches("[0-9]{1,2}"))
        {
            teamCount = "Number of Teams Played For: Invalid input, try again";
        }
        return teamCount;
    }

    private String checkAgentEmail(String agentEmail)
    {
        if(!agentEmail.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
            agentEmail = "Agent Email: Invalid input, try again";
        }
        return agentEmail;
    }


    public String toString()
    {
        String output;
        output  = "Full Name: " + firstName + " " + lastName;
        output += "\nJersey Number: " + jerseyNumber;
        output += "\nCareer Length: " + careerLength;
        output += "\nNumber of Teams Played For: " + teamCount;
        output += "\nAgent Email: " + agentEmail;
        output += "\n";
        return output;
    }
}