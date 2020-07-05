package design;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class Regist extends AnchorPane {
    protected final VBox vBox;
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
    protected final PasswordField  pass_txt;
    protected final Button regist_btn;
    protected final Label error_txt;
    protected final AnchorPane anchorPane0;
    protected final Text text;
    protected final Bloom bloom;
    
    //////////////////DataBase//////////////
    Connection con;
    PreparedStatement stmt;
    String queryString;
    String checkName;
    PreparedStatement checkStmt;
    ResultSet rs;
   
    public Regist(Stage s) {

            vBox = new VBox();
            borderPane = new BorderPane();
            vBox0 = new VBox();
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
            pass_txt = new PasswordField ();
            regist_btn = new Button();
            error_txt = new Label();
            anchorPane0 = new AnchorPane();
            text = new Text();
            bloom = new Bloom();
        try {            
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "123456");
            queryString = "INSERT INTO player (username ,password ) " + "VALUES (? ,?);";
            stmt = con.prepareStatement(queryString);
            checkName = "SELECT username from player;";
            checkStmt = con.prepareStatement(checkName);
            rs = checkStmt.executeQuery(checkName);
            } catch (SQLException ex) {
            Logger.getLogger(Regist.class.getName()).log(Level.SEVERE, null, ex);
        }
            
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
            borderPane.setPrefHeight(600.0);
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
            label0.getStyleClass().add("mylabel");
            label0.getStylesheets().add("/design/bgStyle.css");
            GridPane.setColumnIndex(user_txt, 1);
            user_txt.setPromptText("Enter unique name");
            
            GridPane.setColumnIndex(pass_txt, 1);
            GridPane.setRowIndex(pass_txt, 1);
            pass_txt.setPromptText("Enter Password");
            
            regist_btn.setLayoutX(219.0);
            regist_btn.setLayoutY(149.0);
            regist_btn.setMnemonicParsing(false);
            regist_btn.setOpacity(0.69);
            regist_btn.setPrefHeight(81.0);
            regist_btn.setPrefWidth(378.0);
            regist_btn.setStyle("-fx-background-color: f5c3bc;");
            regist_btn.setText("Regist");
            regist_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
            regist_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
            regist_btn.setFont(new Font("System Bold Italic", 18.0));
            regist_btn.setOnAction((ActionEvent event) -> {
            try {
                    stmt.setString(1, user_txt.getText());
                    stmt.setString(2, pass_txt.getText());
                    stmt.execute();
                    con.close();
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            MainDesign root = new MainDesign(s);
            Scene scene = new Scene(root);

            s.setTitle("Main");
            s.setScene(scene);
            s.show();
                } catch (SQLException ex) {
                    Logger.getLogger(Regist.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        });

            
            error_txt.setPrefHeight(18.0);
            error_txt.setPrefWidth(334.0);
            error_txt.setText("ErrorMssage");
            error_txt.setTextFill(javafx.scene.paint.Color.valueOf("#c70606"));
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
            text.setText("Tic Tac Toe");//fffdf9
            text.setFill(javafx.scene.paint.Color.valueOf("#fffdf9"));

            text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
            text.setWrappingWidth(408.97764587402344);
            text.setFont(new Font("Berlin Sans FB", 72.0));

            
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
            vBox0.getChildren().add(regist_btn);
            vBox0.getChildren().add(error_txt);
            anchorPane0.getChildren().add(text);
            vBox.getChildren().add(borderPane);
            getChildren().add(vBox);


    }
}
