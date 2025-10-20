import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Jyanken extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("ジャンケン");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        // Sceneの作成
        Scene myScene = new Scene(rootNode, 200, 200);
        // stage 上に sceneを作成
        myStage.setScene(myScene);

        // labelを作成
        Label response = new Label("ジャンケンしよう！");
        // Buttonの作成
        Button btnG = new Button("グー");
        // scene にラベルを設置
        rootNode.getChildren().addAll(response, btnG);
        myStage.show();
    }

}