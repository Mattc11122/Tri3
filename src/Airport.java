public class Airport
{
    String airportCode;
    int gates;
    public Airport()
    {
        airportCode="unknown";
    }
    public Airport(String startAirportCode,int gateNum)
    {
        airportCode=startAirportCode;
//        (gateNum);
    }

    public String getAirportCode()
    {
        return airportCode;
    }

    public int getGates() {
        return gates;
    }

    public void setAirportCode(String newAirportCode) {
        airportCode = newAirportCode;
    }

    public void setGates(int newGates) {

        if (newGates>=0)
        {
            gates = newGates;
        }
    }
    public String toString()
    {
        return"the airport code is "+airportCode+". There are "+gates+" gates.";
    }
    public boolean equals(Object object1)
    {
        if (object1 instanceof Airport)
        {
            Airport airport2= (Airport) object1;
            return (toString()).equals(airport2.toString());
        }
        else
        {
            System.out.println("Objects must be an airport type.");
            return(false);
        }
    }
}
