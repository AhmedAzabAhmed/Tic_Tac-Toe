package design;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Bloom;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainDesign extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final VBox vBox0;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final AnchorPane anchorPane;
    protected final Text text;
    protected final Bloom bloom;
    protected final Button history;

    public MainDesign(Stage s) {

        vBox = new VBox();
        borderPane = new BorderPane();
        vBox0 = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        history = new Button();

        anchorPane = new AnchorPane();
        text = new Text();
        bloom = new Bloom();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(753.0);

        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setRightAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        vBox.setPrefHeight(600.0);
        vBox.setPrefWidth(600.0);
        vBox.getStyleClass().add("im");
        vBox.getStylesheets().add("/design/bgStyle.css");

        borderPane.setBlendMode(javafx.scene.effect.BlendMode.SRC_ATOP);
        borderPane.setCache(true);
        borderPane.setDepthTest(javafx.scene.DepthTest.ENABLE);
        borderPane.setPrefHeight(454.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setAlignment(javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(249.0);
        vBox0.setPrefWidth(754.0);
        vBox0.setSpacing(20.0);
        vBox0.setPadding(new Insets(1.0, 10.0, 10.0, 10.0));
        vBox0.setCursor(Cursor.HAND);
        BorderPane.setMargin(vBox0, new Insets(70.0, 0.0, 0.0, 0.0));

        button.setMnemonicParsing(false);
        button.setOpacity(0.7);
        button.setPrefHeight(0.0);
        button.setPrefWidth(376.0);
        button.setStyle("-fx-background-color: #96d1c7;");
        button.setText("Single Player");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        button.setFont(new Font("System Bold Italic", 18.0));

        button0.setLayoutX(219.0);
        button0.setLayoutY(149.0);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.7);
        button0.setPrefHeight(40.0);
        button0.setPrefWidth(377.0);
        button0.setStyle("-fx-background-color: f5c3bc;");
        button0.setText("Two Player offline");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        button0.setFont(new Font("System Bold Italic", 18.0));

        button1.setLayoutX(219.0);
        button1.setLayoutY(118.0);
        button1.setMnemonicParsing(false);
        button1.setOpacity(0.7);
        button1.setPrefHeight(40.0);
        button1.setPrefWidth(383.0);
        button1.setStyle("-fx-background-color: d15a7c;");
        button1.setText("Two Player Online");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#1b327e"));
        button1.setFont(new Font("System Bold Italic", 18.0));
               history.setLayoutX(219.0);
        history.setLayoutY(88.0);
        history.setMnemonicParsing(false);
        history.setOpacity(0.7);
        history.setPrefHeight(40.0);
        history.setPrefWidth(383.0);
        history.setStyle("-fx-background-color: c295d8;");
        history.setText("Show History");
        history.setTextFill(javafx.scene.paint.Color.valueOf("#1b327e"));
        history.setFont(new Font("System Bold Italic", 18.0));
        
        borderPane.setCenter(vBox0);

 

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(346.0);
        anchorPane.setPrefWidth(770.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(173.0);
        text.setLayoutY(282.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setFill(Color.WHITE);
        text.setEffect(bloom);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(408.97764587402344);
        text.setFont(new Font("Berlin Sans FB", 65.0));

        bloom.setThreshold(0.52);
        text.setEffect(bloom);
        borderPane.setTop(anchorPane);

        vBox0.getChildren().add(button);
        vBox0.getChildren().add(button0);
        vBox0.getChildren().add(button1);
                vBox0.getChildren().add(history);

        anchorPane.getChildren().add(text);
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);
        //Single Palyer
        button.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();

            SelectLevel root = new SelectLevel(s);
            Scene scene = button.getScene();

            AnchorPane a = (AnchorPane) scene.getRoot();

            a.getChildren().add(root.vBox);

            root.vBox.translateYProperty().set(scene.getHeight());

            //root.translateYProperty().set(scene.getHeight());
            //borderPane.getChildren().add(root);
            Timeline t = new Timeline();
            KeyValue kv = new KeyValue(root.vBox.translateYProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
            t.getKeyFrames().add(kf);
            t.setOnFinished(ev -> {
                a.getChildren().remove(vBox);

            });
            t.play();

            s.setTitle("Single Player");
            s.setScene(scene);
            s.show();
        });

        //two OFFLine
        button0.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            
            SecondPlayerLogin root = new SecondPlayerLogin(s);
            Scene scene = button0.getScene();
            AnchorPane a = (AnchorPane) scene.getRoot(); 
            a.getChildren().add(root.vBox);
            root.vBox.translateYProperty().set(scene.getHeight());
            Timeline t = new Timeline();
            KeyValue kv = new KeyValue(root.vBox.translateYProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
            t.getKeyFrames().add(kf);
            t.setOnFinished(ev -> {
                a.getChildren().remove(vBox);

            });
            t.play();

            s.setTitle("Two Players Offlone");
            s.setScene(scene);
            s.show();
        }

        );

//history
        history.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            Replay root = new Replay(s);
            Scene scene = new Scene(root);

            s.setTitle("History");
            s.setScene(scene);
            s.show();
        }

        );
        //two online
        button1.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
           
             TwoPlayersOnline root = new TwoPlayersOnline(s);
            Scene scene = new Scene(root);

            

            s.setTitle("Two Player Online");
            s.setScene(scene);
            s.show();
        }
        );

    }
}
