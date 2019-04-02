
import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class TemperatureGraphClient extends Application
{

        private TemperatureGraph s1;

        @Override
        public void start(Stage stage )
        {
            GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
                    stage, "Temperature Graph", 1000, 1000 );
            double temperatures[];
            s1 = new TemperatureGraph( 100, 600, 5);
            s1.draw( gc );


        }

        public static void main( String [ ] args )
        {
            launch( args );
        }
}
