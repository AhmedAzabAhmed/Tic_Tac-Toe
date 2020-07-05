package design;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
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
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoPlayersOnline extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final VBox vBox0;
    protected final VBox vBox1;
    protected final Text player1_name;
    protected final Label label;
    protected final Text player1_score;
    protected final VBox vBox2;
    protected final Text player2_name;
    protected final Label label0;
    protected final Text player2_score;
    protected final VBox vBox3;
    protected final InnerShadow innerShadow;
    protected final Button button0;
    protected final InnerShadow innerShadow0;
    protected final AnchorPane anchorPane0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final InnerShadow innerShadow1;
    protected final Button btn10;
    protected final Button btn20;
    protected final Button btn01;
    protected final Button btn11;
    protected final Button btn21;
    protected final Button btn02;
    protected final Button btn12;
    protected final Button btn22;
    protected final Button btn00;

    Socket mySocket;
    DataInputStream dis;
    PrintStream ps;
    Thread th;
    static String str = "";
    boolean isX = true;
    boolean isO = true;
    //**************************
    DB dataBase = new DB();
    String[] db = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    int i = 0;
    Stage stage;

    public TwoPlayersOnline(Stage s) {
        this.stage = s;
        vBox = new VBox();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        vBox0 = new VBox();
        vBox1 = new VBox();
        player1_name = new Text();
        label = new Label();
        player1_score = new Text();
        vBox2 = new VBox();
        player2_name = new Text();
        label0 = new Label();
        player2_score = new Text();
        vBox3 = new VBox();
        innerShadow = new InnerShadow();
        button0 = new Button();
        innerShadow0 = new InnerShadow();
        anchorPane0 = new AnchorPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        innerShadow1 = new InnerShadow();
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
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setLeftAnchor(vBox0, 275.0);
        AnchorPane.setRightAnchor(vBox0, 275.0);
        vBox0.setAlignment(javafx.geometry.Pos.CENTER);
        vBox0.setLayoutX(275.0);
        vBox0.setLayoutY(76.0);
        vBox0.setPrefHeight(107.0);
        vBox0.setPrefWidth(104.0);

        AnchorPane.setBottomAnchor(vBox1, -30.0);
        AnchorPane.setLeftAnchor(vBox1, 98.0);
        AnchorPane.setTopAnchor(vBox1, 110.0);
        vBox1.setLayoutX(98.0);
        vBox1.setLayoutY(110.0);
        vBox1.setPrefHeight(120.0);
        vBox1.setPrefWidth(120.0);

        player1_name.setFill(javafx.scene.paint.Color.WHITE);
        player1_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1_name.setStrokeWidth(0.0);
        player1_name.setText("Player1");
        player1_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player1_name.setTextOrigin(javafx.geometry.VPos.CENTER);
        player1_name.setWrappingWidth(120.92340087890625);
        player1_name.setFont(new Font("Berlin Sans FB Demi Bold", 32.0));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setPrefHeight(26.0);
        label.setPrefWidth(89.0);
        label.setText("Score");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        VBox.setMargin(label, new Insets(5.0, 5.0, 5.0, 10.0));
        label.setFont(new Font("System Bold Italic", 14.0));

        player1_score.setFill(javafx.scene.paint.Color.WHITE);
        player1_score.setLineSpacing(2.0);
        player1_score.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1_score.setStrokeWidth(0.0);
        player1_score.setText("0");
        player1_score.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player1_score.setWrappingWidth(121.18308448791504);
        player1_score.setFont(new Font("System Bold", 24.0));

        AnchorPane.setBottomAnchor(vBox2, -30.0);
        AnchorPane.setRightAnchor(vBox2, 104.79999999999995);
        AnchorPane.setTopAnchor(vBox2, 110.0);
        vBox2.setLayoutX(428.0);
        vBox2.setLayoutY(110.0);
        vBox2.setPrefHeight(120.0);
        vBox2.setPrefWidth(120.0);

        player2_name.setFill(javafx.scene.paint.Color.WHITE);
        player2_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2_name.setStrokeWidth(0.0);
        player2_name.setText("Player2");
        player2_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player2_name.setTextOrigin(javafx.geometry.VPos.CENTER);
        player2_name.setWrappingWidth(120.1234130859375);
        player2_name.setFont(new Font("Berlin Sans FB Demi Bold", 32.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label0.setPrefHeight(26.0);
        label0.setPrefWidth(129.0);
        label0.setText("Score");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("System Bold Italic", 14.0));
        VBox.setMargin(label0, new Insets(5.0, 0.0, 0.0, 0.0));

        player2_score.setFill(javafx.scene.paint.Color.WHITE);
        player2_score.setLineSpacing(2.0);
        player2_score.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2_score.setStrokeWidth(0.0);
        player2_score.setText("0");
        player2_score.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player2_score.setWrappingWidth(121.18308448791504);
        player2_score.setFont(new Font("System Bold", 24.0));

        AnchorPane.setRightAnchor(vBox3, 5.0);
        AnchorPane.setTopAnchor(vBox3, 15.0);
        vBox3.setLayoutX(548.0);
        vBox3.setLayoutY(14.0);
        vBox3.setPrefHeight(42.0);
        vBox3.setPrefWidth(80.0);

     

        button0.setBlendMode(javafx.scene.effect.BlendMode.SRC_ATOP);
        button0.setLayoutX(25.0);
        button0.setLayoutY(15.0);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.97);
        button0.setPrefHeight(30.0);
        button0.setPrefWidth(42.0);
        button0.getStyleClass().add("back");
        button0.getStylesheets().add("/design/bgStyle.css");

        borderPane.setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMaxHeight(USE_PREF_SIZE);
        anchorPane0.setMaxWidth(USE_PREF_SIZE);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setMinWidth(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(319.0);
        anchorPane0.setPrefWidth(654.0);

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

        innerShadow1.setBlurType(javafx.scene.effect.BlurType.TWO_PASS_BOX);
        innerShadow1.setChoke(0.28);
        // innerShadow1.setColor(javafx.scene.paint.Color.#922aa2);
        innerShadow1.setHeight(44.83);
        innerShadow1.setRadius(34.985);
        innerShadow1.setWidth(97.11);
        gridPane.setEffect(innerShadow1);

        GridPane.setRowIndex(btn10, 1);
        btn10.setAccessibleText("btn10");
        btn10.setMnemonicParsing(false);
        btn10.setPrefHeight(104.0);
        btn10.setPrefWidth(127.0);
        btn10.setStyle("-fx-background-color: #b11998;");
        btn10.setWrapText(true);
        btn10.setFont(new Font("Berlin Sans FB", 58.0));
        btn10.getStyleClass().add("btn");
        btn10.getStylesheets().add("/design/bgStyle.css");

        GridPane.setRowIndex(btn20, 2);
        btn20.setAccessibleText("btn20");
        btn20.setMnemonicParsing(false);
        btn20.setPrefHeight(104.0);
        btn20.setPrefWidth(127.0);
        btn20.setStyle("-fx-background-color: bbcfff;");
        btn20.setWrapText(true);
        btn20.setFont(new Font("Berlin Sans FB", 58.0));
        btn20.getStyleClass().add("btn");
        btn20.getStylesheets().add("/design/bgStyle.css");

        GridPane.setColumnIndex(btn01, 1);
        btn01.setAccessibleText("btn01");
        btn01.setMnemonicParsing(false);
        btn01.setPrefHeight(104.0);
        btn01.setPrefWidth(128.0);
        btn01.setStyle("-fx-background-color: b11998;");
        btn01.setFont(new Font("Berlin Sans FB", 58.0));
        btn01.getStyleClass().add("btn");
        btn01.getStylesheets().add("/design/bgStyle.css");

        GridPane.setColumnIndex(btn11, 1);
        GridPane.setRowIndex(btn11, 1);
        btn11.setAccessibleText("btn11");
        btn11.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn11.setEllipsisString("");
        btn11.setMnemonicParsing(false);
        btn11.setPrefHeight(104.0);
        btn11.setPrefWidth(128.0);
        btn11.setStyle("-fx-background-color: bbcfff;");
        btn11.setFont(new Font("Berlin Sans FB", 58.0));
        btn11.getStyleClass().add("btn");
        btn11.getStylesheets().add("/design/bgStyle.css");
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
        btn21.setFont(new Font("Berlin Sans FB", 58.0));
        btn21.getStyleClass().add("btn");
        btn21.getStylesheets().add("/design/bgStyle.css");
        GridPane.setColumnIndex(btn02, 2);
        btn02.setAccessibleText("btn02");
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(104.0);
        btn02.setPrefWidth(128.0);
        btn02.setStyle("-fx-background-color: bbcfff;");
        btn02.setFont(new Font("Berlin Sans FB", 58.0));
        btn02.getStyleClass().add("btn");
        btn02.getStylesheets().add("/design/bgStyle.css");
        GridPane.setColumnIndex(btn12, 2);
        GridPane.setRowIndex(btn12, 1);
        btn12.setAccessibleText("btn12");
        btn12.setMnemonicParsing(false);
        btn12.setPrefHeight(104.0);
        btn12.setPrefWidth(129.0);
        btn12.setStyle("-fx-background-color: b11998;");
        btn12.setWrapText(true);
        btn12.setFont(new Font("Berlin Sans FB", 58.0));
        btn12.getStyleClass().add("btn");
        btn12.getStylesheets().add("/design/bgStyle.css");
        GridPane.setColumnIndex(btn22, 2);
        GridPane.setRowIndex(btn22, 2);
        btn22.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn22.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn22.setGraphicTextGap(5.0);
        btn22.setMnemonicParsing(false);
        btn22.setPrefHeight(104.0);
        btn22.setPrefWidth(129.0);
        btn22.setStyle("-fx-background-color: bbcfff;");
        btn22.setWrapText(true);
        btn22.setFont(new Font("Berlin Sans FB", 58.0));
        btn22.getStyleClass().add("btn");
        btn22.getStylesheets().add("/design/bgStyle.css");
        btn00.setAccessibleText("btn00");
        btn00.setAlignment(javafx.geometry.Pos.CENTER);
        btn00.setMnemonicParsing(false);
        btn00.setPrefHeight(104.0);
        btn00.setPrefWidth(127.0);
        btn00.setStyle("-fx-background-color: bbcfff;");
        btn00.setWrapText(true);
        btn00.setFont(new Font("Berlin Sans FB", 58.0));
        btn00.getStyleClass().add("btn");
        btn00.getStylesheets().add("/design/bgStyle.css");

        borderPane.setCenter(anchorPane0);

        getChildren().add(vBox);
        anchorPane.getChildren().add(vBox0);
        vBox1.getChildren().add(player1_name);
        vBox1.getChildren().add(label);
        vBox1.getChildren().add(player1_score);
        anchorPane.getChildren().add(vBox1);
        vBox2.getChildren().add(player2_name);
        vBox2.getChildren().add(label0);
        vBox2.getChildren().add(player2_score);
        anchorPane.getChildren().add(vBox2);
        anchorPane.getChildren().add(vBox3);
        anchorPane.getChildren().add(button0);
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
        anchorPane0.getChildren().add(gridPane);
        getChildren().add(borderPane);

        //***********************************************************************************
        try {//"172.16.2.236"
            mySocket = new Socket("192.168.1.5", 5005);
            dis = new DataInputStream(mySocket.getInputStream());
            ps = new PrintStream(mySocket.getOutputStream());
        } catch (UnknownHostException ex) {
            Logger.getLogger(TwoPlayersOnline.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TwoPlayersOnline.class.getName()).log(Level.SEVERE, null, ex);
        }

        th = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        String s = dis.readLine();
                        str = s;
                        System.out.println("here " + str);
                        switch (str) {
                            case "1":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn00.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {

                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn00.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn00.setMouseTransparent(true);
                                break;
                            case "2":
                                if (isX) {
                                    Platform.runLater(new Runnable() {

                                        @Override
                                        public void run() {
                                            btn10.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn10.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn10.setMouseTransparent(true);
                                break;
                            case "3":
                                if (isX) {
                                    Platform.runLater(new Runnable() {

                                        @Override
                                        public void run() {
                                            btn20.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn20.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn20.setMouseTransparent(true);
                                break;
                            case "4":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn01.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn01.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn01.setMouseTransparent(true);
                                break;
                            case "5":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn11.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn11.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn11.setMouseTransparent(true);
                                break;
                            case "6":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn21.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn21.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn21.setMouseTransparent(true);
                                break;
                            case "7":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn02.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn02.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn02.setMouseTransparent(true);
                                break;
                            case "8":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn12.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn12.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn12.setMouseTransparent(true);
                                break;
                            case "9":
                                if (isX) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn22.setText("X");
                                        }
                                    });
                                    isX = false;
                                    isO = true;
                                } else {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            btn22.setText("O");
                                        }
                                    });
                                    isX = true;
                                    isO = false;
                                }
                                btn22.setMouseTransparent(true);
                                break;
                            case "W":
                                System.out.println("YOU ARE WINNER !!");
                                Winner root = new Winner(stage, 2);
                                Scene scene = new Scene(root);
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        stage.setTitle("Winner");
                                        stage.setScene(scene);
                                        stage.show();
                                    }
                                });

                                dataBase.OpenConnection();

                                dataBase.FillStmt(db, Login.myPlayer);

                                break;
                            case "L":
                                System.out.println(
                                        "YOU ARE LOSER !!");

                                GameOver root2 = new GameOver(stage, 2);
                                Scene scene2 = new Scene(root2);
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        stage.setTitle("Playing");
                                        stage.setScene(scene2);
                                        stage.show();
                                    }
                                });

                                dataBase.OpenConnection();

                                dataBase.FillStmt(db, Login.myPlayer);
                                break;
                            default:
                                break;
                        }

                        System.out.println(s);
                    } catch (IOException ex) {
                        Logger.getLogger(Design.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        }
        );
        th.start();

        //***********************************************************************************
        button0.setOnMouseClicked((event) -> {
            final java.net.URL resource = getClass().getResource("button-30.mp3");
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


        btn00.setOnMouseClicked((event) -> {
            ps.println(1);
        });
        btn10.setOnMouseClicked((event) -> {
            ps.println(2);
        });
        btn20.setOnMouseClicked((event) -> {
            ps.println(3);
        });

        btn01.setOnMouseClicked((event) -> {
            ps.println(4);
        });
        btn11.setOnMouseClicked((event) -> {
            ps.println(5);
        });
        btn21.setOnMouseClicked((event) -> {
            ps.println(6);
        });
        btn02.setOnMouseClicked((event) -> {
            ps.println(7);
        });
        btn12.setOnMouseClicked((event) -> {
            ps.println(8);
        });
        btn22.setOnMouseClicked((event) -> {
            ps.println(9);
        });
    }
}
