import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import java.util.*;
public class TemperatureGraph
{
    private int sX;
    private int sY;
    private double scale;
    public TemperatureGraph()
    {
        scale=1;
    }
    public TemperatureGraph (int sX, int sY, double scale)
    {
        setCoordinates (sX,sY);
        setScale(scale);
    }
    public TemperatureGraph setCoordinates(int sX, int sY)
    {
        this.sX=sX;
        this.sY=sY;
        return this;
    }
    public TemperatureGraph setScale(double scale)
    {
        this.scale=(scale>0? scale:this.scale);
        return this;
    }
    public void draw(GraphicsContext gc)
    {
        Scanner scan=new Scanner(System.in);
        double dateArray[];
        dateArray=new double[12];
        int i;
        double total=0;
        double minimum=1000;
        for (i = 0; i<12; i++)
        {
            String month="";
            switch (i) {
                case 0: {
                    month = "January";
                }
                case 1:
                {
                    month = "february";
                }
                case 2:
                {
                    month="March";
                }
                case 3:
                {
                    month="April";
                }
                case 4:
                {
                    month="May";
                }
                case 5:
                {
                    month="June";
                }
                case 6:
                {
                    month="July";
                }
            }
            System.out.println("Please give an integer for a temperature in the month of"+month);
            dateArray[i]=scan.nextDouble();
            total=total+dateArray[i];
            if (i>=1)
            {
             if (dateArray[i]<minimum)
                {
                    minimum=dateArray[i];
                }
            }
        }
        System.out.println("the minimum temperature is: "+minimum);
        double average=total/12;
        System.out.println("The average temperature is: "+average);
        System.out.println("Please give an int");
        gc.setStroke(Color.BLACK);
        gc.strokeText("January\n   "+dateArray[0],sX+0*scale,sY+-dateArray[0]+3*scale);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX*scale,sY+-dateArray[0]*scale,5*scale, dateArray[0]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("February\n   "+dateArray[1],sX+7*scale,100);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+7*scale,sY+-+dateArray[1]*scale,5*scale, dateArray[1]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("March\n    "+dateArray[2],sX+14*scale,100);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+14*scale,sY+-+dateArray[2]*scale,5*scale, +dateArray[2]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("April\n    "+dateArray[3],sX+21*scale,100);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+21*scale,sY+-dateArray[3]*scale,5*scale, dateArray[3]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("May\n    "+dateArray[4],sX+28*scale,100);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+28*scale,sY+-dateArray[4]*scale,5*scale, dateArray[4]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("June\n    "+dateArray[5],sX+35*scale,100);
        gc.setFill(Color.RED);
        gc.fillRect(sX+35*scale,sY+-dateArray[5]*scale,5*scale, dateArray[5]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("July\n    "+dateArray[6],sX+42*scale,100);
        gc.setFill(Color.RED);
        gc.fillRect(sX+42*scale,sY+-dateArray[6]*scale,5*scale, dateArray[6]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("August\n    "+dateArray[7],sX+49*scale,100);
        gc.setFill(Color.RED);
        gc.fillRect(sX+49*scale,sY+-dateArray[7]*scale,5*scale, dateArray[7]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("September\n    "+dateArray[8],sX+56*scale,100);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+56*scale,sY+-dateArray[8]*scale,5*scale, dateArray[8]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("October\n    "+dateArray[9],sX+63*scale,100);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+63*scale,sY+-dateArray[9]*scale,5*scale, dateArray[9]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("November\n    "+dateArray[10],sX+70*scale,100);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+70*scale,sY+-dateArray[10]*scale,5*scale, dateArray[10]*scale);
        gc.setStroke(Color.BLACK);
        gc.strokeText("december\n    "+dateArray[11],sX+77*scale,100);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+77*scale,sY+-dateArray[11]*scale,5*scale, +dateArray[11]*scale);
    }

}
