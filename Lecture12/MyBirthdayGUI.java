import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MyBirthdayGUI extends Application {
    private int y;
    private int m;
    private int d;
    String[] weeks = { "土", "日", "月", "火", "水", "木", "金" };

    public String toWareki() {

        if (y >= 2019 && m >= 5) {// 令和：2019年5月1日〜
            return "令和" + (y - 2018);
        } else if ((y == 1989 && m >= 1 && d >= 8) || (y > 1989)) {// 平成：1989年1月8日〜2019年4月30日
            return "平成" + (y - 1988);
        } else if ((y == 1926 && m >= 12 && d >= 25) || (y > 1926)) {// 昭和：1926年12月25日〜1989年1月7日
            return "昭和" + (y - 1925);
        } else if ((y == 1912 && m >= 7 && d >= 30) || (y > 1912)) {// 大正：1912年7月30〜1926年12月24日
            return "大正" + (y - 1911);
        } else if ((y == 1868 && m >= 9 && d >= 8) || (y > 1868)) {// 明治：1868年9月8日〜1912年7月29日
            return "明治" + (y - 1867);
        }
        return "input error";

    }

    public String getDayOfWeek() {
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int h = (d + 26 * (m + 1) / 10 + y % 100 + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;
        return weeks[h];
    }

    @Override
    public void start(Stage stage) {
        // 入力用テキストフィールド
        TextField yearField = new TextField();
        // yearField.setPromptText("年(西暦)");
        yearField.setText("年(西暦)");
        yearField.setPrefWidth(70);

        TextField monthField = new TextField();
        monthField.setPromptText("月");
        monthField.setPrefWidth(40);

        TextField dayField = new TextField();
        dayField.setPromptText("日");
        dayField.setPrefWidth(40);

        // ボタン
        Button showBtn = new Button("表示");

        // 結果表示用ラベル
        Label eraLabel = new Label("和暦: ");
        Label dayLabel = new Label("曜日: ");

        showBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                y = Integer.parseInt(yearField.getText());
                m = Integer.parseInt(monthField.getText());
                d = Integer.parseInt(dayField.getText());

                eraLabel.setText(toWareki());
                dayLabel.setText(getDayOfWeek());
            }
        });

        // レイアウト
        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(yearField, monthField, dayField, showBtn, eraLabel, dayLabel);

        Scene scene = new Scene(root, 400, 120);

        stage.setTitle("誕生日アプリ");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}