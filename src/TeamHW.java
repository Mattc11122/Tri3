public class TeamHW
{
    private String name;
    public String getName()
    {
        return name;
    }
    public String setname(String newName)
    {
        name=newName;
        return name;
    }
    public String toString() {
        return "the name of your team is: "+name;
    }
    public boolean equals(Object o)
    {
        if (o instanceof TeamHW)
        {
           System.out.println("object is a team object type.");
           return true;
        }
        else return false;
    }
}
