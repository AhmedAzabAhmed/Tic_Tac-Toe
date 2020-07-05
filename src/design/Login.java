package design;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
import javafx.util.Duration;

public class Login extends AnchorPane {

    protected final VBox vBox;
    protected final Hyperlink hyperlink;

    protected final BorderPane borderPane;
    protected final VBox vBox0;
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final Glow glow;
    protected final Label label;
    protected final Label label0;
    protected final TextField user_txt;
    protected final PasswordField pass_txt;
    protected final Button login_btn;
    protected final Label error_txt;
    protected final AnchorPane anchorPane0;
    protected final Text text;
    protected final Bloom bloom;

    //////////////////DataBase//////////////
    Connection con;
    String checkName;
    PreparedStatement checkStmt;
    ResultSet rs;
    boolean enter = true;

    String str;
    String pass;
    int i = 0;

    //get player name
    static String myPlayer;

    public Login(Stage s) {

        vBox = new VBox();
        borderPane = new BorderPane();
        vBox0 = new VBox();
        hyperlink = new Hyperlink();

        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        glow = new Glow();
        label = new Label();
        label0 = new Label();
        user_txt = new TextField();
        pass_txt = new PasswordField();
        login_btn = new Button();
        error_txt = new Label();
        anchorPane0 = new AnchorPane();
        text = new Text();
        bloom = new Bloom();

        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "root");
            checkName = "SELECT username , password from player;";
            checkStmt = con.prepareStatement(checkName);
            rs = checkStmt.executeQuery(checkName);
        } catch (SQLException ex) {
            Logger.getLogger(Regist.class.getName()).log(Level.SEVERE, null, ex);
        }

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(710.0);
        setPrefWidth(753.0);

        AnchorPane.setBottomAnchor(vBox, 0.0);
        AnchorPane.setLeftAnchor(vBox, 0.0);
        AnchorPane.setRightAnchor(vBox, 0.0);
        AnchorPane.setTopAnchor(vBox, 0.0);
        vBox.setPrefHeight(700.0);
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

        rowConstraints0.setMaxHeight(48.59998168945313);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(46.199987792968756);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane.setEffect(glow);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        label.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        label.setPrefHeight(35.0);
        label.setPrefWidth(266.0);
        label.setText("User Name");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("Berlin Sans FB Demi Bold", 30.0));
        label.setPadding(new Insets(10.0, 10.0, 1.0, 20.0));
        label.getStyleClass().add("mylabel");
        label.getStylesheets().add("/design/bgStyle.css");
        // label.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));

        GridPane.setRowIndex(label0, 1);
        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
        label0.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        label0.setPrefHeight(35.0);
        label0.setPrefWidth(263.0);
        label0.setText("Passward");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setFont(new Font("Berlin Sans FB Demi Bold", 30.0));
        label0.setPadding(new Insets(10.0, 10.0, 10.0, 20.0));
        // label0.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        label0.getStyleClass().add("mylabel");
        label0.getStylesheets().add("/design/bgStyle.css");
        //   label.colo(

        GridPane.setColumnIndex(user_txt, 1);
        user_txt.setPromptText("Enert UserName");

        GridPane.setColumnIndex(pass_txt, 1);
        GridPane.setRowIndex(pass_txt, 1);
        pass_txt.setPromptText("Enter Password");

        login_btn.setLayoutX(219.0);
        login_btn.setLayoutY(149.0);
        login_btn.setMnemonicParsing(false);
        login_btn.setOpacity(0.69);
        login_btn.setPrefHeight(81.0);
        login_btn.setPrefWidth(378.0);
        login_btn.setStyle("-fx-background-color: f5c3bc;");
        login_btn.setText("Login");
        login_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        login_btn.setFont(new Font("System Bold Italic", 18.0));

        hyperlink.setPrefHeight(23.0);
        hyperlink.setPrefWidth(334.0);
        hyperlink.setText("Regist Now ");
        hyperlink.setTextFill(javafx.scene.paint.Color.valueOf("#a31796"));
        hyperlink.setFont(new Font("Berlin Sans FB Demi Bold", 18.0));

        error_txt.setPrefHeight(18.0);
        error_txt.setPrefWidth(334.0);

        error_txt.setTextFill(javafx.scene.paint.Color.valueOf("#da0606"));
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
        text.setLayoutY(223.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(408.97764587402344);
        text.setFont(new Font("Berlin Sans FB", 72.0));
        text.setFill(javafx.scene.paint.Color.valueOf("#fffdf9"));

        vBox.setPrefWidth(743.0);

        bloom.setThreshold(0.52);
        text.setEffect(bloom);
        borderPane.setTop(anchorPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getChildren().add(label);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(user_txt);
        gridPane.getChildren().add(pass_txt);
        anchorPane.getChildren().add(gridPane);
        vBox0.getChildren().add(anchorPane);
        vBox0.getChildren().add(login_btn);
        vBox0.getChildren().add(hyperlink);

        vBox0.getChildren().add(error_txt);
        anchorPane0.getChildren().add(text);
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);
        login_btn.setOnAction((ActionEvent event) -> {
            try {
                System.out.println("button");
                while (rs.next()) {

                    str = rs.getString("username");
                    System.out.println("str0 " + str);
                    pass = rs.getString("password");
                    System.out.println("pass0 " + pass);

                    if ((str.equals(user_txt.getText())) & (pass.equals(pass_txt.getText()))) {

                        myPlayer = str;

                        //check to login error
                        enter = false;

                        final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
                        final Media media = new Media(resource.toString());
                        final MediaPlayer mediaPlayer = new MediaPlayer(media);
                        mediaPlayer.play();

                        MainDesign root = new MainDesign(s);
                        Scene scene = login_btn.getScene();
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

                        s.setTitle("Main");
                        s.setScene(scene);
                        s.show();

                        break;
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(Regist.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (enter) {
                        rs.first();
                        rs.previous();
                        error_txt.setText("Error Name or Password");
                    } else {
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        hyperlink.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();

            Regist root = new Regist(s);
            Scene scene = hyperlink.getScene();
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
    }
}
