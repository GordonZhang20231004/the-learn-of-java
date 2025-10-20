import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class WeekDayApp extends Application {
    private int y;
    private int m;
    private int d;

    @Override
    public void start(Stage stage) throws Exception {
        // （年、月、日）textfield
        TextField yearField = new TextField();
        yearField.setPromptText("年(西暦)");
        yearField.setPrefWidth(80);

        TextField monthField = new TextField();
        monthField.setPromptText("月");
        monthField.setPrefWidth(50);

        TextField dayField = new TextField();
        dayField.setPromptText("日");
        dayField.setPrefWidth(50);

        // button
        Button button = new Button("表示");

        // lable
        Label weekDayLable = new Label("曜日: ");

        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                y = Integer.parseInt(yearField.getText());
                m = Integer.parseInt(monthField.getText());
                d = Integer.parseInt(dayField.getText());
                LocalDate localDate = LocalDate.of(y, m, d);
                DayOfWeek weekDay = localDate.getDayOfWeek();
                // String weekDay=dow.getDisplayName(TextStyle.FULL,Local.JAPAN);
                String weekDayStr = weekDay.getDisplayName(TextStyle.FULL, Locale.JAPAN);
                weekDayLable.setText(weekDayStr);

            }
        });

        // layout
        FlowPane fp = new FlowPane(10, 10);
        fp.getChildren().addAll(yearField, monthField, dayField, button, weekDayLable);

        Scene scene = new Scene(fp, 400, 200);
        stage.setTitle("曜日検索アプリ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
