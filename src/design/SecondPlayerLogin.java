package design;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondPlayerLogin extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final VBox vBox0;
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final Glow glow;
    protected final Label label;
    protected final TextField user_txt;
    protected final Button login_btn;
    protected final AnchorPane anchorPane0;
    protected final Text text;
    protected final Bloom bloom;

    public SecondPlayerLogin(Stage s) {

        vBox = new VBox();
        borderPane = new BorderPane();
        vBox0 = new VBox();
        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        glow = new Glow();
        label = new Label();
        user_txt = new TextField();
        login_btn = new Button();
        anchorPane0 = new AnchorPane();
        text = new Text();
        bloom = new Bloom();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(636.0);
        setPrefWidth(753.0);

        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setRightAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        vBox.setPrefHeight(636.0);
        vBox.setPrefWidth(743.0);
        vBox.getStyleClass().add("im");
        vBox.getStylesheets().add("/design/bgStyle.css");

        borderPane.setBlendMode(javafx.scene.effect.BlendMode.SRC_ATOP);
        borderPane.setCache(true);
        borderPane.setDepthTest(javafx.scene.DepthTest.ENABLE);
        borderPane.setPrefHeight(454.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setAlignment(javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(162.0);
        vBox0.setPrefWidth(754.0);
        vBox0.setSpacing(20.0);
        vBox0.setPadding(new Insets(1.0, 10.0, 10.0, 10.0));
        vBox0.setCursor(Cursor.HAND);
        BorderPane.setMargin(vBox0, new Insets(70.0, 0.0, 0.0, 0.0));

        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(103.0);
        anchorPane.setPrefWidth(734.0);

        AnchorPane.setBottomAnchor(gridPane, -10.0);
        AnchorPane.setLeftAnchor(gridPane, 110.0);
        AnchorPane.setRightAnchor(gridPane, 110.0);
        AnchorPane.setTopAnchor(gridPane, -95.0);
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.setLayoutX(85.0);
        gridPane.setLayoutY(-95.0);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(106.0);
        gridPane.setPrefWidth(530.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMaxHeight(63.000006103515624);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(60.60001220703125);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane.setEffect(glow);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        label.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        label.setPrefHeight(46.0);
        label.setPrefWidth(282.0);
        label.setText("Player Name");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
        label.setPadding(new Insets(10.0, 10.0, 1.0, 20.0));
        label.getStyleClass().add("mylabel");
        label.getStylesheets().add("/design/bgStyle.css");
        GridPane.setColumnIndex(user_txt, 1);
        user_txt.setPromptText("Enert Second  Player");

        login_btn.setLayoutX(219.0);
        login_btn.setLayoutY(149.0);
        login_btn.setMnemonicParsing(false);
        login_btn.setOpacity(0.69);
        login_btn.setPrefHeight(81.0);
        login_btn.setPrefWidth(378.0);
        login_btn.setStyle("-fx-background-color: f5c3bc;");
        login_btn.setText("Done");
        login_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        login_btn.setFont(new Font("System Bold Italic", 18.0));
        borderPane.setCenter(vBox0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(294.0);
        anchorPane0.setPrefWidth(754.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#dfcbdd"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(158.0);
        text.setLayoutY(222.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(452.9777069091797);
        text.setFont(new Font("Berlin Sans FB", 72.0));

        bloom.setThreshold(0.52);
        text.setEffect(bloom);
        borderPane.setTop(anchorPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(user_txt);
        anchorPane.getChildren().add(gridPane);
        vBox0.getChildren().add(anchorPane);
        vBox0.getChildren().add(login_btn);
        anchorPane0.getChildren().add(text);
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);

        login_btn.setOnMouseClicked((event) -> {
            if (!(user_txt.getText().equals(""))) {
                final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
                final Media media = new Media(resource.toString());
                final MediaPlayer mediaPlayer = new MediaPlayer(media);
                TwoPlayersOffline root = new TwoPlayersOffline(s);
                Scene scene = new Scene(root);

                s.setTitle("History");
                s.setScene(scene);
                s.show();
            }
        }
        );
    }
}
