import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class A0001F extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("占いアプリ");
        FlowPane fp = new FlowPane(10, 10);
        fp.setAlignment(Pos.CENTER);
        Scene sce = new Scene(fp, 400, 200);
        primaryStage.setScene(sce);
        primaryStage.show();

        TextField tf = new TextField();
        tf.setPrefWidth(250);
        tf.setText("input your information");

        Button button = new Button();
        button.setText("click");

        Label lb = new Label();
        lb.setText("sdfsdfjsdlkfjkls");

        ImageView imv = new ImageView();
        Image im = new Image(
                "https://media.nownews.com/nn_media/thumbnail/2016/12/1535142459-b08aec644de3e89b70d3ce9fef3ddfd2-404x404.jpg");
        imv.setImage(im);
        imv.setFitWidth(150);
        imv.setFitHeight(150);
        fp.getChildren().addAll(tf, button, lb, imv);
        primaryStage.show();
    }
}
