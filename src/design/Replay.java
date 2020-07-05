package design;

import design.DB;
import design.Login;
import design.TwoPlayersOffline;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class Replay extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final VBox vBox0;
    protected final AnchorPane anchorPane0;
    protected final Button play_rec_btn;
    protected final ComboBox comboBox;
    protected final Text player2_name;
    protected final VBox vBox1;
    protected final VBox vBox2;
    protected final Button back_btn;
    protected final AnchorPane anchorPane1;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final InnerShadow innerShadow;
    protected final Button btn10;
    protected final Button btn20;
    protected final Button btn01;
    protected final Button btn11;
    protected final Button btn21;
    protected final Button btn02;
    protected final Button btn12;
    protected final Button btn22;
    protected final Button btn00;
  DB mydb;
    String[] db = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    ArrayList<String> myHistory;
    public Replay(Stage s) {
        this.mydb = new DB();

        vBox = new VBox();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        vBox0 = new VBox();
        anchorPane0 = new AnchorPane();
        play_rec_btn = new Button();
        comboBox = new ComboBox();
        player2_name = new Text();
        vBox1 = new VBox();
        vBox2 = new VBox();
        back_btn = new Button();
        anchorPane1 = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        innerShadow = new InnerShadow();
        btn10 = new Button();
        btn20 = new Button();
        btn01 = new Button();
        btn11 = new Button();
        btn21 = new Button();
        btn02 = new Button();
        btn12 = new Button();
        btn22 = new Button();
        btn00 = new Button();

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
        anchorPane.setPrefHeight(222.0);
        anchorPane.setPrefWidth(619.0);

        AnchorPane.setBottomAnchor(vBox0, -67.0);
        AnchorPane.setLeftAnchor(vBox0, 27.0);
        AnchorPane.setRightAnchor(vBox0, 29.0);
        AnchorPane.setTopAnchor(vBox0, 75.0);
        vBox0.setLayoutX(27.0);
        vBox0.setLayoutY(75.0);
        vBox0.setPrefHeight(192.0);
        vBox0.setPrefWidth(598.0);

        VBox.setVgrow(anchorPane0, javafx.scene.layout.Priority.NEVER);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(214.0);
        anchorPane0.setPrefWidth(570.0);

        play_rec_btn.setLayoutX(130.0);
        play_rec_btn.setLayoutY(151.0);
        play_rec_btn.setMnemonicParsing(false);
        play_rec_btn.setOpacity(0.69);
        play_rec_btn.setPrefHeight(39.0);
        play_rec_btn.setPrefWidth(269.0);
        play_rec_btn.setStyle("-fx-background-color: f5c3bc;");
        play_rec_btn.setText("Play Record");
        play_rec_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        play_rec_btn.setTextFill(javafx.scene.paint.Color.valueOf("#3251b7"));
        play_rec_btn.setFont(new Font("System Bold Italic", 18.0));

        comboBox.setLayoutX(89.0);
        comboBox.setLayoutY(80.0);
        comboBox.setPrefHeight(26.0);
        comboBox.setPrefWidth(352.0);
        comboBox.setPromptText("Select  Date");

        player2_name.setFill(javafx.scene.paint.Color.WHITE);
        player2_name.setLayoutX(184.0);
        player2_name.setLayoutY(32.0);
        player2_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2_name.setStrokeWidth(0.0);
        player2_name.setText("Player");
        player2_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player2_name.setTextOrigin(javafx.geometry.VPos.CENTER);
        player2_name.setWrappingWidth(183.3234100341797);
        player2_name.setFont(new Font("Berlin Sans FB Demi Bold", 32.0));

        AnchorPane.setBottomAnchor(vBox1, -30.0);
        AnchorPane.setRightAnchor(vBox1, 104.79999999999995);
        AnchorPane.setTopAnchor(vBox1, 110.0);
        vBox1.setLayoutX(428.0);
        vBox1.setLayoutY(110.0);
        vBox1.setPrefHeight(120.0);
        vBox1.setPrefWidth(120.0);

        AnchorPane.setRightAnchor(vBox2, 5.0);
        AnchorPane.setTopAnchor(vBox2, 15.0);
        vBox2.setLayoutX(548.0);
        vBox2.setLayoutY(14.0);
        vBox2.setPrefHeight(42.0);
        vBox2.setPrefWidth(80.0);

        back_btn.setLayoutX(4.0);
        back_btn.setLayoutY(23.0);
        back_btn.setMnemonicParsing(false);
        back_btn.setPrefHeight(38.0);
        back_btn.setPrefWidth(36.0);
       back_btn.getStyleClass().add("back");
        back_btn.getStylesheets().add("/design/bgStyle.css");
        anchorPane.setCursor(Cursor.HAND);
        borderPane.setTop(anchorPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setMaxHeight(USE_PREF_SIZE);
        anchorPane1.setMaxWidth(USE_PREF_SIZE);
        anchorPane1.setMinHeight(USE_PREF_SIZE);
        anchorPane1.setMinWidth(USE_PREF_SIZE);
        anchorPane1.setPrefHeight(319.0);
        anchorPane1.setPrefWidth(654.0);

        AnchorPane.setBottomAnchor(gridPane, -5.0);
        AnchorPane.setLeftAnchor(gridPane, 140.0);
        AnchorPane.setRightAnchor(gridPane, 140.0);
        AnchorPane.setTopAnchor(gridPane, 8.0);
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(110.0);
        gridPane.setLayoutY(8.0);
        gridPane.setOpacity(0.91);
        gridPane.setPrefHeight(309.0);
        gridPane.setPrefWidth(364.0);
        gridPane.setStyle("-fx-border-width: 0; -fx-border-style: none;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        innerShadow.setBlurType(javafx.scene.effect.BlurType.TWO_PASS_BOX);
        innerShadow.setChoke(0.28);
       // innerShadow.setColor(javafx.scene.paint.Color.#922aa2);
        innerShadow.setHeight(44.83);
        innerShadow.setRadius(34.985);
        innerShadow.setWidth(97.11);
        gridPane.setEffect(innerShadow);

        GridPane.setRowIndex(btn10, 1);
        btn10.setAccessibleText("btn10");
        btn10.setMnemonicParsing(false);
        btn10.setPrefHeight(104.0);
        btn10.setPrefWidth(127.0);
        btn10.setStyle("-fx-background-color: #b11998;");
        btn10.setText("");
        btn10.setWrapText(true);
        btn10.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setRowIndex(btn20, 2);
        btn20.setAccessibleText("btn20");
        btn20.setMnemonicParsing(false);
        btn20.setPrefHeight(104.0);
        btn20.setPrefWidth(129.0);
        btn20.setStyle("-fx-background-color: bbcfff;");
        btn20.setText("");
        btn20.setWrapText(true);
        btn20.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn01, 1);
        btn01.setAccessibleText("btn01");
        btn01.setMnemonicParsing(false);
        btn01.setPrefHeight(104.0);
        btn01.setPrefWidth(128.0);
        btn01.setStyle("-fx-background-color: b11998;");
        btn01.setText("");
        btn01.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn11, 1);
        GridPane.setRowIndex(btn11, 1);
        btn11.setAccessibleText("btn11");
        btn11.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn11.setEllipsisString("");
        btn11.setMnemonicParsing(false);
        btn11.setPrefHeight(104.0);
        btn11.setPrefWidth(128.0);
        btn11.setStyle("-fx-background-color: bbcfff;");
        btn11.setText("");
        btn11.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn21, 1);
        GridPane.setRowIndex(btn21, 2);
        btn21.setAccessibleText("btn21");
        btn21.setMaxHeight(USE_PREF_SIZE);
        btn21.setMaxWidth(USE_PREF_SIZE);
        btn21.setMinHeight(USE_PREF_SIZE);
        btn21.setMinWidth(USE_PREF_SIZE);
        btn21.setMnemonicParsing(false);
        btn21.setPrefHeight(102.0);
        btn21.setPrefWidth(124.0);
        btn21.setStyle("-fx-background-color: b11998;");
        btn21.setText("");
        btn21.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn02, 2);
        btn02.setAccessibleText("btn02");
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(104.0);
        btn02.setPrefWidth(128.0);
        btn02.setStyle("-fx-background-color: bbcfff;");
        btn02.setText("");
        btn02.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn12, 2);
        GridPane.setRowIndex(btn12, 1);
        btn12.setAccessibleText("btn12");
        btn12.setMnemonicParsing(false);
        btn12.setPrefHeight(104.0);
        btn12.setPrefWidth(129.0);
        btn12.setStyle("-fx-background-color: b11998;");
        btn12.setText("");
        btn12.setWrapText(true);
        btn12.setFont(new Font("Berlin Sans FB", 58.0));

        GridPane.setColumnIndex(btn22, 2);
        GridPane.setRowIndex(btn22, 2);
        btn22.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn22.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn22.setGraphicTextGap(5.0);
        btn22.setMnemonicParsing(false);
        btn22.setPrefHeight(104.0);
        btn22.setPrefWidth(129.0);
        btn22.setStyle("-fx-background-color: bbcfff;");
        btn22.setText("");
        btn22.setWrapText(true);
        btn22.setFont(new Font("Berlin Sans FB", 58.0));

        btn00.setAccessibleText("btn00");
        btn00.setAlignment(javafx.geometry.Pos.CENTER);
        btn00.setMnemonicParsing(false);
        btn00.setPrefHeight(104.0);
        btn00.setPrefWidth(127.0);
        btn00.setStyle("-fx-background-color: bbcfff;");
        btn00.setText("");
        btn00.setWrapText(true);
        btn00.setFont(new Font("Berlin Sans FB", 58.0));
        borderPane.setCenter(anchorPane1);

        getChildren().add(vBox);
        anchorPane0.getChildren().add(play_rec_btn);
        anchorPane0.getChildren().add(comboBox);
        anchorPane0.getChildren().add(player2_name);
        vBox0.getChildren().add(anchorPane0);
        anchorPane.getChildren().add(vBox0);
        anchorPane.getChildren().add(vBox1);
        anchorPane.getChildren().add(vBox2);
        anchorPane.getChildren().add(back_btn);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(btn10);
        gridPane.getChildren().add(btn20);
        gridPane.getChildren().add(btn01);
        gridPane.getChildren().add(btn11);
        gridPane.getChildren().add(btn21);
        gridPane.getChildren().add(btn02);
        gridPane.getChildren().add(btn12);
        gridPane.getChildren().add(btn22);
        gridPane.getChildren().add(btn00);
        anchorPane1.getChildren().add(gridPane);
        getChildren().add(borderPane);
         mydb.OpenConnection();
        myHistory = mydb.retrieveDates(Login.myPlayer);
        comboBox.getItems().addAll(myHistory);
        play_rec_btn.setOnMouseClicked((event) -> {
               replay();
        }
        );
        back_btn.setOnMouseClicked((event) -> {
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

    }

    void replay() {
        restart();
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                db = mydb.Retrieve(Login.myPlayer, comboBox.getValue().toString());
                for (int i = 0; i < 9; i++) {
                    if (!(db[i].equals(" "))) {
                        switch (db[i].charAt(1)) {
                            case '1':
                                System.out.println(db[i].charAt(1));
                                String s1 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn00.setText(s1);
                                    }
                                });
                                break;
                            case '2':
                                System.out.println(db[i].charAt(1));
                                String s2 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn10.setText(s2);
                                    }
                                });
                                break;
                            case '3':
                                System.out.println(db[i].charAt(1));
                                String s3 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn20.setText(s3);
                                    }
                                });
                                break;
                            case '4':
                                System.out.println(db[i].charAt(1));
                                String s4 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn01.setText(s4);
                                    }
                                });
                                break;
                            case '5':
                                System.out.println(db[i].charAt(1));
                                String s5 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn11.setText(s5);
                                    }
                                });
                                break;
                            case '6':
                                System.out.println(db[i].charAt(1));
                                String s6 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn21.setText(s6);
                                    }
                                });
                                break;
                            case '7':
                                System.out.println(db[i].charAt(1));
                                String s7 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn02.setText(s7);
                                    }
                                });
                                break;
                            case '8':
                                System.out.println(db[i].charAt(1));
                                String s8 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn12.setText(s8);
                                    }
                                });
                                break;
                            case '9':
                                System.out.println(db[i].charAt(1));
                                String s9 = String.valueOf(db[i].charAt(0));
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        btn22.setText(s9);
                                    }
                                });
                                break;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TwoPlayersOffline.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
        myThread.start();
    }
    
    void restart() {
        btn00.setText(" ");
        btn01.setText(" ");
        btn02.setText(" ");
        btn10.setText(" ");
        btn11.setText(" ");
        btn12.setText(" ");
        btn20.setText(" ");
        btn21.setText(" ");
        btn22.setText(" ");
    }
}
