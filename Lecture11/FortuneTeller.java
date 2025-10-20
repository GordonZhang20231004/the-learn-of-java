import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;//画像を扱うクラス
import javafx.scene.image.ImageView;//
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FortuneTeller extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("占いアプリ");
        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.TOP_LEFT);
        // Sceneの作成
        Scene myScene = new Scene(rootNode, 400, 400);
        // stage 上に sceneを作成
        myStage.setScene(myScene);
        // TextFieldの作成

        ImageView imgv1 = new ImageView();

        TextField message = new TextField();
        // TextFieldのサイズの設定
        message.setPrefWidth(250);
        // テキストの設定
        message.setText("占いたい人の名前を入力してください");
        // labelを作成
        Label response = new Label();
        // Buttonの作成
        Button btnSend = new Button("占う");
        // Buttonが押されたときの処理
        btnSend.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                String[] fortunes = { "大吉", "中吉", "小吉", "凶" };
                Random rand = new Random();
                String result = fortunes[rand.nextInt(fortunes.length)];
                // このなかにイベントが起こったときの処理を書く
                // response.setText(message.getText() + "の今日の運勢は、" + "大吉" + "です。");
                response.setText(message.getText() + "今日の運勢は、" + result + "です。");
                Image img;
                switch (result) {
                    case "大吉":
                        img = new Image(
                                "https://media.nownews.com/nn_media/thumbnail/2016/12/1535142459-b08aec644de3e89b70d3ce9fef3ddfd2-404x404.jpg");
                        break;

                    case "中吉":
                        img = new Image(
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSz_LagRBY30juHz0NYTCpV7sLnBssxGJHeDA&s");
                        break;
                    case "小吉":
                        img = new Image(
                                "https://i.pinimg.com/564x/9d/12/25/9d12252b36d363a77400c1ad6e05b8c3.jpg");
                        break;
                    case "凶":
                        img = new Image(
                                "https://kyoainoie-movie.com/img/top_main_sp.jpg");
                        break;

                    default:
                        img = new Image(
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfJ82tKUFU_mqVxkMLc4tSdQNcXH1MlLsXTQ&s");
                        break;
                }
                imgv1.setImage(img);
                imgv1.setFitWidth(150);
                imgv1.setPreserveRatio(true);

            }
        });

        // scene にテキストフィールド、ボタン、ラベルを設置
        rootNode.getChildren().addAll(imgv1, message, btnSend, response);
        myStage.show();
    }
}
