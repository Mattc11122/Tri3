/*
Matthew Cole
class for encapsulating statistics (# of visitors and website type) with mutators, accessors, constructors, and methods toString and equals
 */
public class WebsiteStatHW
{
    private int visitorNum;
    private String websiteType;
    public int getVisitorNum()
    {
        return visitorNum;
    }
    public int setvisitorNum(int newVisitorNum)
    {
        visitorNum=newVisitorNum;
        return visitorNum;
    }
    public String setwebsiteType(String newWebsiteType)
    {
        websiteType=newWebsiteType;
        return websiteType;
    }
    public String toString(){
        return "Your website has had "+visitorNum+" visitors and is a "+websiteType+" website.";
    }
    public boolean equals(Object o)
    {
        if (o instanceof WebsiteStatHW)
        {
            System.out.println("object is a Website object type.");
            return true;
        }
        else return false;
    }
}
