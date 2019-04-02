public class Auto {
    private String model;
    private int milesDriven;
    private double gallonsOfGas;

    public Auto() {
        model = "unknown";
    }

    public Auto(String name, double gallons) {
        model = name;
        SetGallons(gallons);
    }

    public Auto(String name, int miles, double gallons) {
        model = name;
        SetMiles(miles);
        SetGallons(gallons);
    }

    public Auto SetGallons(double gallons) {
        if (gallons < 0) {
           this. gallonsOfGas = 0;
            System.err.println("Sorry, we do not accept negative values. Gallons will be set to '0'.");
        } else {
           this. gallonsOfGas = gallons;

        }
        return this;
    }
    public Auto SetMiles(int miles) {
        if (miles < 0) {
            this.milesDriven = 0;
            System.out.println("Ur an Idiot");
        } else {
            this.milesDriven = miles;
        }
        return this;
    }

    public String GetModel() {
        return model;
    }

    public int GetMiles() {
        return milesDriven;
    }

    public double GetGallons() {
        return gallonsOfGas;
    }

    @Override
    public String toString() {
        return "cars.";
    }

    public boolean equals(Object object1) {
        if (object1 instanceof Auto) {
            Auto car2 = (Auto) object1;
            System.out.println("Yea");
            if (model.equals(car2.model) && milesDriven == car2.milesDriven && Math.abs(gallonsOfGas - car2.gallonsOfGas) < 0.00001)
                System.out.println("hi");
                return (toString()).equals(car2.toString());
        } else {
            System.out.println("Objects must be an Auto type.");
            return (false);
        }
    }

}
