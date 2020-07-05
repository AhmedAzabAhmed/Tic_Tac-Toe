package design;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SelectLevel extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final VBox vBox0;
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Glow glow;
    protected final RadioButton easy_rb;
    protected final ToggleGroup g2;
    protected final RadioButton medium_rb;
    protected final RadioButton hard_rb;
    protected final Button play_btn;
    protected final AnchorPane anchorPane0;
    protected final Text text;
    protected final Bloom bloom;
    protected final Label label;
    static String level;

    public SelectLevel(Stage s) {

        vBox = new VBox();
        borderPane = new BorderPane();
        vBox0 = new VBox();
        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        glow = new Glow();
        easy_rb = new RadioButton();
        g2 = new ToggleGroup();
        medium_rb = new RadioButton();
        hard_rb = new RadioButton();
        play_btn = new Button();
        anchorPane0 = new AnchorPane();
        text = new Text();
        bloom = new Bloom();
        label = new Label();

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
        vBox0.setPrefHeight(212.0);
        vBox0.setPrefWidth(755.0);
        vBox0.setSpacing(20.0);
        vBox0.setPadding(new Insets(1.0, 10.0, 10.0, 10.0));
        vBox0.setCursor(Cursor.SE_RESIZE);
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

        rowConstraints.setMaxHeight(63.000006103515624);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(60.60001220703125);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(63.000006103515624);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(60.60001220703125);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(63.000006103515624);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(60.60001220703125);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(48.59998168945313);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(46.199987792968756);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane.setEffect(glow);

        GridPane.setRowIndex(easy_rb, 1);
        easy_rb.setMnemonicParsing(false);
        easy_rb.setPrefHeight(54.0);
        easy_rb.setPrefWidth(246.0);
        easy_rb.setText("Easy");
        easy_rb.setTextFill(javafx.scene.paint.Color.valueOf("#6b52bf"));
        easy_rb.setPadding(new Insets(0.0, 0.0, 0.0, 20.0));
        easy_rb.setFont(new Font("Berlin Sans FB Demi Bold", 25.0));

        easy_rb.setToggleGroup(g2);

        GridPane.setRowIndex(medium_rb, 2);
        medium_rb.setMnemonicParsing(false);
        medium_rb.setPrefHeight(54.0);
        medium_rb.setPrefWidth(223.0);
        medium_rb.setText("Medium");
        medium_rb.setTextFill(javafx.scene.paint.Color.valueOf("#6b52bf"));
        medium_rb.setToggleGroup(g2);
        medium_rb.setPadding(new Insets(0.0, 0.0, 0.0, 20.0));
        medium_rb.setFont(new Font("Berlin Sans FB Demi Bold", 25.0));

        GridPane.setRowIndex(hard_rb, 3);
        hard_rb.setMnemonicParsing(false);
        hard_rb.setPrefHeight(46.0);
        hard_rb.setPrefWidth(214.0);
        hard_rb.setText("Hard");
        hard_rb.setTextFill(javafx.scene.paint.Color.valueOf("#6b52bf"));
        hard_rb.setToggleGroup(g2);
        hard_rb.setPadding(new Insets(0.0, 0.0, 0.0, 20.0));
        hard_rb.setFont(new Font("Berlin Sans FB Demi Bold", 25.0));
        gridPane.setCursor(Cursor.HAND);

        play_btn.setLayoutX(219.0);
        play_btn.setLayoutY(149.0);
        play_btn.setMnemonicParsing(false);
        play_btn.setOpacity(0.69);
        play_btn.setPrefHeight(81.0);
        play_btn.setPrefWidth(378.0);
        play_btn.setStyle("-fx-background-color: deddfa;");
        play_btn.setText(" Play Now");
        play_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        play_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        play_btn.setFont(new Font("System Bold Italic", 20.0));
        VBox.setMargin(play_btn, new Insets(20.0, 0.0, 0.0, 0.0));
        play_btn.setCursor(Cursor.OPEN_HAND);
        borderPane.setCenter(vBox0);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(294.0);
        anchorPane0.setPrefWidth(754.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(173.0);
        text.setLayoutY(196.0);
      text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
         text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
          text.setWrappingWidth(408.97764587402344);
        text.setFont(new Font("Berlin Sans FB", 72.0));
                         text.setFill(javafx.scene.paint.Color.valueOf("#fffdf9"));

        bloom.setThreshold(0.52);
        text.setEffect(bloom);

        label.setLayoutX(135.0);
        label.setLayoutY(279.0);
        label.setPrefHeight(44.0);
        label.setPrefWidth(274.0);
        label.setText("Select Game Leve");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#704b94"));
        label.setFont(new Font("Agency FB Bold", 30.0));
        borderPane.setTop(anchorPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(easy_rb);
        gridPane.getChildren().add(medium_rb);
        gridPane.getChildren().add(hard_rb);
        anchorPane.getChildren().add(gridPane);
        vBox0.getChildren().add(anchorPane);
        vBox0.getChildren().add(play_btn);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(label);
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);
        g2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ob, Toggle o, Toggle n) -> {
            RadioButton rb = (RadioButton) g2.getSelectedToggle();

            if (rb != null) {
                level = rb.getText();
                System.out.println(level);

            }
            else
            {
                
            }
        });

        play_btn.setOnMouseClicked((event) -> {

            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            if (level.equals("")) {
                System.out.println("Select Level");
            } else {
                SinglePlayer root = new SinglePlayer(s, level);
                level = "";
                Scene scene = new Scene(root);

                s.setTitle("Playing");
                s.setScene(scene);
                s.show();
            }

        }
        );

    }
}
