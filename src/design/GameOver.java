package design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameOver extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Text text;
    protected final AnchorPane anchorPane0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final Button back_btn11;
    protected final ImageView imageView0;
    protected final Button back_btn111;
    protected final ImageView imageView1;
    protected final VBox vBox0;
    int flag;

    public GameOver(Stage s, int flag) {
        this.flag = flag;
        vBox = new VBox();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        text = new Text();
        anchorPane0 = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        back_btn11 = new Button();
        imageView0 = new ImageView();
        back_btn111 = new Button();
        imageView1 = new ImageView();
        vBox0 = new VBox();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(710.0);
        setPrefWidth(653.0);

        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setRightAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        vBox.setPrefHeight(600.0);
        vBox.setPrefWidth(600.0);
        vBox.getStyleClass().add("im");
        vBox.getStylesheets().add("/design/bgStyle.css");

        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane, 0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setPrefHeight(600.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(551.0);
        anchorPane.setPrefWidth(654.0);

        imageView.setFitHeight(286.0);
        imageView.setFitWidth(267.0);
        imageView.setLayoutX(203.0);
        imageView.setLayoutY(263.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("Images/cry.gif").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#fdfdfd"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(135.0);
        text.setLayoutY(187.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Game Over");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("Berlin Sans FB Demi Bold", 79.0));
        borderPane.setCenter(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(324.0);
        anchorPane0.setPrefWidth(654.0);

        AnchorPane.setLeftAnchor(gridPane, 111.0);
        AnchorPane.setRightAnchor(gridPane, 89.0);
        gridPane.setLayoutX(111.0);
        gridPane.setLayoutY(24.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(62.0);
        gridPane.setPrefWidth(343.0);

        columnConstraints.setFillWidth(false);
        columnConstraints.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setFillWidth(false);
        columnConstraints0.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setFillWidth(false);
        columnConstraints1.setHalignment(javafx.geometry.HPos.CENTER);
        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        back_btn11.setAlignment(javafx.geometry.Pos.CENTER);
        back_btn11.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        back_btn11.setMaxHeight(USE_PREF_SIZE);
        back_btn11.setMaxWidth(USE_PREF_SIZE);
        back_btn11.setMnemonicParsing(false);
        back_btn11.setOpacity(0.63);
        back_btn11.setPrefHeight(38.0);
        back_btn11.setPrefWidth(160.0);
        back_btn11.setStyle("-fx-background-color: ea9abb;");
        back_btn11.setText("Back to Menu");
        back_btn11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        back_btn11.setTextFill(javafx.scene.paint.Color.valueOf("#346fe4"));
        back_btn11.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS);
        back_btn11.setFont(new Font("Berlin Sans FB Demi Bold", 18.0));

        imageView0.setFitHeight(38.0);
        imageView0.setFitWidth(44.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Images/Home.png").toExternalForm()));
        back_btn11.setGraphic(imageView0);

        GridPane.setColumnIndex(back_btn111, 2);
        back_btn111.setAlignment(javafx.geometry.Pos.CENTER);
        back_btn111.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);
        back_btn111.setMaxHeight(USE_PREF_SIZE);
        back_btn111.setMaxWidth(USE_PREF_SIZE);
        back_btn111.setMnemonicParsing(false);
        back_btn111.setOpacity(0.61);
        back_btn111.setPrefHeight(38.0);
        back_btn111.setPrefWidth(160.0);
        back_btn111.setStyle("-fx-background-color: ea9abb;");
        back_btn111.setText("Play Again");
        back_btn111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        back_btn111.setTextFill(javafx.scene.paint.Color.valueOf("#346fe4"));
        back_btn111.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_WORD_ELLIPSIS);
        back_btn111.setFont(new Font("Berlin Sans FB Demi Bold", 18.0));

        imageView1.setFitHeight(38.0);
        imageView1.setFitWidth(44.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("Images/replay.png").toExternalForm()));
        back_btn111.setGraphic(imageView1);
        borderPane.setBottom(anchorPane0);

        vBox0.setLayoutX(10.0);
        vBox0.setLayoutY(10.0);

        getChildren().add(vBox);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(text);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(back_btn11);
        gridPane.getChildren().add(back_btn111);
        anchorPane0.getChildren().add(gridPane);
        getChildren().add(borderPane);
        getChildren().add(vBox0);
        back_btn11.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            MainDesign root = new MainDesign(s);
            Scene scene = new Scene(root);

            s.setTitle("Main");
            s.setScene(scene);
            s.show();
        }
        );
        back_btn111.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
                final Media media = new Media(resource.toString());
                final MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            if (flag == 1) {
                //single Player
                SelectLevel root = new SelectLevel(s);
                Scene scene = new Scene(root);
                s.setTitle("Single");
                s.setScene(scene);
                s.show();

            }
            else if(flag==2){
         // Two player Online
                TwoPlayersOnline root = new TwoPlayersOnline(s);
                Scene scene = new Scene(root);
                s.setTitle("Two Players Online");
                s.setScene(scene);
                s.show();
            }
            else if (flag ==3|| flag==4){

                TwoPlayersOffline root = new TwoPlayersOffline(s);
                Scene scene = new Scene(root);

                s.setTitle("Two Players OffLine");
                s.setScene(scene);
                s.show();
            }
        }
        );

    }
}
