import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 横方向と縦方向の間隔をそれぞれ１０ピクセルに設定したFlowPaneレイアウトを作成してる
        FlowPane rootNode = new FlowPane(10, 10);
        // レイアウトにボタンを追加してる。
        // ボタンは自動的に左から右へ配置され、スペースが足りなくなると自動的に改行（かいぎょう）される

        for (int i = 1; i <= 8; i++) {
            rootNode.getChildren().add(new Button("Button" + i));

        }

        // 幅３００、高さ２００ピクセルのシーンを作成し、その中にrootNodeを設定している。
        Scene scene = new Scene(rootNode, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
