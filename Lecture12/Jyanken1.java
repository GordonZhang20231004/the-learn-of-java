import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Jyanken1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws Exception {
        myStage.setTitle("ジャンケン");
        FlowPane rootNode = new FlowPane(10, 100);
        rootNode.setAlignment(Pos.CENTER);

        // Sceneの作成
        Scene myScene = new Scene(rootNode, 400, 400);
        // stage 上に sceneを作成
        myStage.setScene(myScene);
        // labelを作成
        Label response = new Label("ジャンケンしよう！");
        // Buttonの作成
        // String[] strings = { "グー", "チョキ", "パー" };

        Button btnG = new Button("グー");
        rootNode.getChildren().add(btnG);
        Button btnG1 = new Button("チョキ");
        rootNode.getChildren().add(btnG1);
        Button btnG2 = new Button("パー");
        rootNode.getChildren().add(btnG2);
        // rootNode.getChildren().addAll(btnG1, response);
        // rootNode.getChildren().addAll(btnG2, response);

        /*
         * for (int i = 0; i < 3; i++) {
         * rootNode.getChildren().add(new Button(strings[i]));
         * 
         * }
         */
        // scene にラベルを設置

        Image[] img = new Image[3];
        img[0] = new Image(
                "https://learn-ap-southeast-1-prod-fleet02-xythos.content.blackboardcdn.com/5ea1017cb0a8d/117325?X-Blackboard-S3-Bucket=learn-ap-southeast-1-prod-fleet02-xythos&X-Blackboard-Expiration=1751976000000&X-Blackboard-Signature=1AVTV0yoNTKq%2Bl7M7Xqx78CbsBraJO8pUrP4HLT9VrQ%3D&X-Blackboard-Client-Id=309630&X-Blackboard-S3-Region=ap-southeast-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27paper.gif&response-content-type=image%2Fgif&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEID%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgNTHjgd0SDT3RO1ezVPFgUMOSfJegiquW8w07UpFBWiwCIEVGMg37ewHwZENm09LQlbkqlL3cKQZaTZ28FmaBu%2BSWKssFCIn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQBBoMNjM1NTY3OTI0MTgzIgyG%2B3KN3tuuQDmGvRsqnwV2NdKDpqTiLjKvRMoyuLibZHf2XfgTHngmGuz%2B55A14huo6cEFzNeaE%2FaFcrsG0Vo8G1%2Fd1yK6VcdSfD%2FiHeE7%2FNo6EG2ECWCib6H%2Flu%2FIhx0teYijQPcHYt2mxvFDZe%2BUqXV7PryRgcD39ZFoE8L6if86jhYZwVwINd%2BK8jgA0uOARv%2B9IEg5JMURf6pSYzh2uRmUi4QXbd3fFM99NGjJa33ZVEFUMjkfMIutPCED0NT1UFkTayW%2Fk3DJDpUBYzANafTHFxES8IaOGIvJMlFk%2BTpQhGM4ZJ35Nx1yTnVdIoU%2FNGFbk%2BBgYaC1WIDnubHEyNCfuFeZX2tuuIJEFoBe700dFJUCcKYJEFppevpQqf4At3A9fb6SRGdjml6MhjGW7YX0vB1HpIw5qb5CitXvT9bY%2Fa5tHvsclsjQCrzXPzFxWaGqihwYomV4SxZ%2FQZmKrbajmE5eguPy3CjLGgEKz2RmTvqmTuTiZalmSWJWOLxYgZKZHxwWCFjM1i0Y%2FiSFOdPHIy8dtYeHLBzs1pSY0QTR6ymFiGG4xpTO8LDba7Vd8RHVCiAdmsYpgY54sPfCFioUIBlNBzfznX6r2OIxuLWySl%2FTx2TDlouhhu6ZHTgLpqspqXzJ5QuvrFtMr1cGLzJcaBLKhSbOjqrlZWyFIYfQweUwl4TBYETPhzoPW6wavh6S9hXdMn8It8HgCrTGVL11YKC1SP2ifXz8w593BOtkVcnUSWvWhQka44s6lFaen0TxDNGbTUuveQA47UcHfi0XfJ6ZDoN9ROB7Dxfts5bGxBUjFKsR75rHnMvr%2FpqNxsZz9Gr%2FT7Dhm%2F2A%2Fd1Bqbi%2BLZijaoSU9NwZWBkAbDkCXxZrENJVbNrUTFhjHUByb28lYYD%2Bzq5%2FFsZ8%2FTChm7PDBjqyAXb4%2BJqJWXF3impsvoPsPkZW8rnb7KkwGZjs4UCJqDh7tj8FrGLecnSYVHnv36F7SYTn63FtBJJQ2OMpibml%2FXEFuXM0dYv%2FZeDTKUtYliEvfgpIWWxd16eyNABR3AjYfKRL2KenE0YVnLxgkjc02wfqD%2BTjwF0BTXLBEF7m%2FVSHdYABRQKyH5rE0YT3aQLPcYiga8gjNDRwE%2BsD%2F5H8Q6m7kzJPjqZh%2FJoWjGciuSyDQQ4%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20250708T060000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLVCISJFYO%2F20250708%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=83b5f1202bafb48548eb0bfc33a277cde285e78dd8c6a6e75f3a67244438f65e");
        img[1] = new Image(
                "https://learn-ap-southeast-1-prod-fleet02-xythos.content.blackboardcdn.com/5ea1017cb0a8d/117327?X-Blackboard-S3-Bucket=learn-ap-southeast-1-prod-fleet02-xythos&X-Blackboard-Expiration=1751976000000&X-Blackboard-Signature=ba%2F%2FbmM8ljLsulazeTVtSJTSI13U3agjFHqutfQz1H0%3D&X-Blackboard-Client-Id=309630&X-Blackboard-S3-Region=ap-southeast-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27rock.gif&response-content-type=image%2Fgif&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEID%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgNTHjgd0SDT3RO1ezVPFgUMOSfJegiquW8w07UpFBWiwCIEVGMg37ewHwZENm09LQlbkqlL3cKQZaTZ28FmaBu%2BSWKssFCIn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQBBoMNjM1NTY3OTI0MTgzIgyG%2B3KN3tuuQDmGvRsqnwV2NdKDpqTiLjKvRMoyuLibZHf2XfgTHngmGuz%2B55A14huo6cEFzNeaE%2FaFcrsG0Vo8G1%2Fd1yK6VcdSfD%2FiHeE7%2FNo6EG2ECWCib6H%2Flu%2FIhx0teYijQPcHYt2mxvFDZe%2BUqXV7PryRgcD39ZFoE8L6if86jhYZwVwINd%2BK8jgA0uOARv%2B9IEg5JMURf6pSYzh2uRmUi4QXbd3fFM99NGjJa33ZVEFUMjkfMIutPCED0NT1UFkTayW%2Fk3DJDpUBYzANafTHFxES8IaOGIvJMlFk%2BTpQhGM4ZJ35Nx1yTnVdIoU%2FNGFbk%2BBgYaC1WIDnubHEyNCfuFeZX2tuuIJEFoBe700dFJUCcKYJEFppevpQqf4At3A9fb6SRGdjml6MhjGW7YX0vB1HpIw5qb5CitXvT9bY%2Fa5tHvsclsjQCrzXPzFxWaGqihwYomV4SxZ%2FQZmKrbajmE5eguPy3CjLGgEKz2RmTvqmTuTiZalmSWJWOLxYgZKZHxwWCFjM1i0Y%2FiSFOdPHIy8dtYeHLBzs1pSY0QTR6ymFiGG4xpTO8LDba7Vd8RHVCiAdmsYpgY54sPfCFioUIBlNBzfznX6r2OIxuLWySl%2FTx2TDlouhhu6ZHTgLpqspqXzJ5QuvrFtMr1cGLzJcaBLKhSbOjqrlZWyFIYfQweUwl4TBYETPhzoPW6wavh6S9hXdMn8It8HgCrTGVL11YKC1SP2ifXz8w593BOtkVcnUSWvWhQka44s6lFaen0TxDNGbTUuveQA47UcHfi0XfJ6ZDoN9ROB7Dxfts5bGxBUjFKsR75rHnMvr%2FpqNxsZz9Gr%2FT7Dhm%2F2A%2Fd1Bqbi%2BLZijaoSU9NwZWBkAbDkCXxZrENJVbNrUTFhjHUByb28lYYD%2Bzq5%2FFsZ8%2FTChm7PDBjqyAXb4%2BJqJWXF3impsvoPsPkZW8rnb7KkwGZjs4UCJqDh7tj8FrGLecnSYVHnv36F7SYTn63FtBJJQ2OMpibml%2FXEFuXM0dYv%2FZeDTKUtYliEvfgpIWWxd16eyNABR3AjYfKRL2KenE0YVnLxgkjc02wfqD%2BTjwF0BTXLBEF7m%2FVSHdYABRQKyH5rE0YT3aQLPcYiga8gjNDRwE%2BsD%2F5H8Q6m7kzJPjqZh%2FJoWjGciuSyDQQ4%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20250708T060000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLVCISJFYO%2F20250708%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=d7e55982688900696fc1551560de8f5549a9a4bad49add6d956d1249facfc1e4");
        img[2] = new Image(
                "https://learn-ap-southeast-1-prod-fleet02-xythos.content.blackboardcdn.com/5ea1017cb0a8d/117316?X-Blackboard-S3-Bucket=learn-ap-southeast-1-prod-fleet02-xythos&X-Blackboard-Expiration=1751976000000&X-Blackboard-Signature=DnA5eUhpkrTcL1FQV%2Ffut1nhYT4mRMA4nmrQ6Y%2Baf3w%3D&X-Blackboard-Client-Id=309630&X-Blackboard-S3-Region=ap-southeast-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27scissors.gif&response-content-type=image%2Fgif&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEID%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLXNvdXRoZWFzdC0xIkYwRAIgNTHjgd0SDT3RO1ezVPFgUMOSfJegiquW8w07UpFBWiwCIEVGMg37ewHwZENm09LQlbkqlL3cKQZaTZ28FmaBu%2BSWKssFCIn%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQBBoMNjM1NTY3OTI0MTgzIgyG%2B3KN3tuuQDmGvRsqnwV2NdKDpqTiLjKvRMoyuLibZHf2XfgTHngmGuz%2B55A14huo6cEFzNeaE%2FaFcrsG0Vo8G1%2Fd1yK6VcdSfD%2FiHeE7%2FNo6EG2ECWCib6H%2Flu%2FIhx0teYijQPcHYt2mxvFDZe%2BUqXV7PryRgcD39ZFoE8L6if86jhYZwVwINd%2BK8jgA0uOARv%2B9IEg5JMURf6pSYzh2uRmUi4QXbd3fFM99NGjJa33ZVEFUMjkfMIutPCED0NT1UFkTayW%2Fk3DJDpUBYzANafTHFxES8IaOGIvJMlFk%2BTpQhGM4ZJ35Nx1yTnVdIoU%2FNGFbk%2BBgYaC1WIDnubHEyNCfuFeZX2tuuIJEFoBe700dFJUCcKYJEFppevpQqf4At3A9fb6SRGdjml6MhjGW7YX0vB1HpIw5qb5CitXvT9bY%2Fa5tHvsclsjQCrzXPzFxWaGqihwYomV4SxZ%2FQZmKrbajmE5eguPy3CjLGgEKz2RmTvqmTuTiZalmSWJWOLxYgZKZHxwWCFjM1i0Y%2FiSFOdPHIy8dtYeHLBzs1pSY0QTR6ymFiGG4xpTO8LDba7Vd8RHVCiAdmsYpgY54sPfCFioUIBlNBzfznX6r2OIxuLWySl%2FTx2TDlouhhu6ZHTgLpqspqXzJ5QuvrFtMr1cGLzJcaBLKhSbOjqrlZWyFIYfQweUwl4TBYETPhzoPW6wavh6S9hXdMn8It8HgCrTGVL11YKC1SP2ifXz8w593BOtkVcnUSWvWhQka44s6lFaen0TxDNGbTUuveQA47UcHfi0XfJ6ZDoN9ROB7Dxfts5bGxBUjFKsR75rHnMvr%2FpqNxsZz9Gr%2FT7Dhm%2F2A%2Fd1Bqbi%2BLZijaoSU9NwZWBkAbDkCXxZrENJVbNrUTFhjHUByb28lYYD%2Bzq5%2FFsZ8%2FTChm7PDBjqyAXb4%2BJqJWXF3impsvoPsPkZW8rnb7KkwGZjs4UCJqDh7tj8FrGLecnSYVHnv36F7SYTn63FtBJJQ2OMpibml%2FXEFuXM0dYv%2FZeDTKUtYliEvfgpIWWxd16eyNABR3AjYfKRL2KenE0YVnLxgkjc02wfqD%2BTjwF0BTXLBEF7m%2FVSHdYABRQKyH5rE0YT3aQLPcYiga8gjNDRwE%2BsD%2F5H8Q6m7kzJPjqZh%2FJoWjGciuSyDQQ4%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20250708T060000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLVCISJFYO%2F20250708%2Fap-southeast-1%2Fs3%2Faws4_request&X-Amz-Signature=cc3d1f5c1fd00eca31bc4d9f1750e5928f7768431d44b3366691113cc3432364");

        ImageView myHand = new ImageView();
        btnG.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myHand.setImage(img[0]);
                myHand.setFitWidth(100);
                myHand.setPreserveRatio(true);
            }
        });
        btnG1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myHand.setImage(img[1]);
                myHand.setFitWidth(100);
                myHand.setPreserveRatio(true);
            }
        });
        btnG2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myHand.setImage(img[2]);
                myHand.setFitWidth(100);
                myHand.setPreserveRatio(true);
            }
        });
        rootNode.getChildren().addAll(response, myHand);

        myStage.show();
    }

}
