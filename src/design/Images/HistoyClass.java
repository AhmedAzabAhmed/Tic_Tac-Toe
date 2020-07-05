package design;

import java.util.ArrayList;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public  class HistoyClass extends AnchorPane {

    
    
    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final Text text;
    protected final Bloom bloom;
    protected final VBox vBox0;
    protected final AnchorPane anchorPane0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final Glow glow;
    protected final Label label;
    protected final ComboBox Date_ComboBox;
    protected final Button play_rec_btn;
    
        DB mydb;
        ArrayList<String> myHistory; 


    public HistoyClass(Stage s) {
        this.mydb = new DB();

        vBox = new VBox();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        text = new Text();
        bloom = new Bloom();
        vBox0 = new VBox();
        anchorPane0 = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        glow = new Glow();
        label = new Label();
        Date_ComboBox = new ComboBox();
        play_rec_btn = new Button();

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
        vBox.setPrefHeight(669.0);
        vBox.setPrefWidth(770.0);
        vBox.getStyleClass().add("im");
        vBox.getStylesheets().add("/design/bgStyle.css");

        borderPane.setBlendMode(javafx.scene.effect.BlendMode.SRC_ATOP);
        borderPane.setCache(true);
        borderPane.setDepthTest(javafx.scene.DepthTest.ENABLE);
        borderPane.setPrefHeight(454.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(294.0);
        anchorPane.setPrefWidth(754.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#fff4fe"));
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(173.0);
        text.setLayoutY(223.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(408.97764587402344);
        text.setFont(new Font("Berlin Sans FB", 72.0));

        bloom.setThreshold(0.52);
        text.setEffect(bloom);
        anchorPane.setCursor(Cursor.HAND);
        borderPane.setTop(anchorPane);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setAlignment(javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(162.0);
        vBox0.setPrefWidth(754.0);
        vBox0.setSpacing(20.0);
        vBox0.setPadding(new Insets(1.0, 10.0, 10.0, 10.0));
        vBox0.setCursor(Cursor.HAND);
        BorderPane.setMargin(vBox0, new Insets(70.0, 0.0, 0.0, 0.0));

        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(103.0);
        anchorPane0.setPrefWidth(734.0);

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
        label.setPrefHeight(55.0);
        label.setPrefWidth(258.0);
        label.setText("Select Date");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffedfd"));
        label.setFont(new Font("Berlin Sans FB Demi Bold", 30.0));
        label.setPadding(new Insets(10.0, 10.0, 1.0, 20.0));

        GridPane.setColumnIndex(Date_ComboBox, 1);
        Date_ComboBox.setEditable(true);
        Date_ComboBox.setPrefHeight(26.0);
        Date_ComboBox.setPrefWidth(273.0);
        Date_ComboBox.setPromptText("Choose Date");
        Date_ComboBox.setCursor(Cursor.HAND);
        gridPane.setCursor(Cursor.HAND);

        play_rec_btn.setLayoutX(219.0);
        play_rec_btn.setLayoutY(149.0);
        play_rec_btn.setMnemonicParsing(false);
        play_rec_btn.setOpacity(0.69);
        play_rec_btn.setPrefHeight(81.0);
        play_rec_btn.setPrefWidth(378.0);
        play_rec_btn.setStyle("-fx-background-color: f5c3bc;");
        play_rec_btn.setText("Play Record");
        play_rec_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        play_rec_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        play_rec_btn.setFont(new Font("System Bold Italic", 18.0));
        borderPane.setBottom(vBox0);

        anchorPane.getChildren().add(text);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(Date_ComboBox);
        anchorPane0.getChildren().add(gridPane);
        vBox0.getChildren().add(anchorPane0);
        vBox0.getChildren().add(play_rec_btn);
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);
        mydb.OpenConnection();
          myHistory= mydb.retrieveDates(Login.myPlayer);
          Date_ComboBox.getItems().addAll(myHistory);
          play_rec_btn.setOnMouseClicked((event) -> {
      final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
           
              TwoPlayersOffline root = new TwoPlayersOffline(s);
            Scene scene = new Scene(root);
            s.setTitle("Two Players offLine");
            s.setScene(scene);
            s.show();
            
           }
           );
        
        
    }
}
