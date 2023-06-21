package javafx;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PainterController {

    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Slider slider;

    @FXML
    private Button penButton;

    @FXML
    private Button eraserButton;

    @FXML
    private Button clearButton;

    private GraphicsContext gc;
    private double prevX, prevY;

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
            prevX = e.getX();
            prevY = e.getY();
        });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
            if (penButton.isPressed()) {
                gc.setStroke(colorPicker.getValue());
                gc.setLineWidth(slider.getValue());
            } else if (eraserButton.isPressed()) {
                gc.setStroke(Color.WHITE);
                gc.setLineWidth(slider.getValue());
            }
            gc.strokeLine(prevX, prevY, e.getX(), e.getY());
            prevX = e.getX();
            prevY = e.getY();
        });

        clearButton.setOnAction(e -> gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()));
    }
}

