import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class A0715 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("zhangbaoshuai");
        FlowPane fp = new FlowPane(10, 10);
        fp.setAlignment(Pos.CENTER);

        Scene sc = new Scene(fp, 200, 200);
        primaryStage.setScene(sc);

        Label label = new Label("Gordon name");
        Button button = new Button("button");
        fp.getChildren().addAll(label, button);
        primaryStage.show();
    }
}
