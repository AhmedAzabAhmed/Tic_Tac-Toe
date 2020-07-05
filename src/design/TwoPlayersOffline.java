package design;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
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
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoPlayersOffline extends AnchorPane {

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
    protected final Button button;
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

    public enum GameState {

        PLAYING, WINNING, X_WON, O_WON, GAMEOVER
    }
    private GameState currentState;  // the current game state

    public enum Cell {

        EMPTY, X, O
    }
    private Cell currPlayer;  // the current player
    String currentPlayer;

    TicTacToe checkForWin = new TicTacToe(3);
    DB dataBase = new DB();
    String[][] btnName = new String[3][3];

    String[] db = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    int i = 0;
    String s;
    int score1, score2;

    Stage stage;
    AudioClip audioClip;

    public TwoPlayersOffline(Stage s) {
        this.stage = s;
        audioClip = new AudioClip(this.getClass().getResource("Audio/open.mp3").toString());
        audioClip.play();
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
        button = new Button();
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

        currentState = GameState.PLAYING; // ready to play
        currentPlayer = "x";
        currPlayer = Cell.X;              // X plays first

        btnName[0] = new String[]{btn00.getText(), btn01.getText(), btn02.getText()};
        btnName[1] = new String[]{btn10.getText(), btn11.getText(), btn12.getText()};
        btnName[2] = new String[]{btn20.getText(), btn21.getText(), btn22.getText()};

        dataBase.OpenConnection();

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

        button.setMnemonicParsing(false);
        button.setPrefHeight(30.0);
        button.setPrefWidth(42.0);
        button.getStyleClass().add("music");
        button.getStylesheets().add("/design/bgStyle.css");

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
        btn10.setText(" ");
        btn10.setWrapText(true);
        btn10.setFont(new Font("Berlin Sans FB", 58.0));
        btn10.getStyleClass().add("btn");
        btn10.getStylesheets().add("/design/bgStyle.css");
        btn10.setOnAction((ActionEvent event) -> {
            System.out.println(" forth button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X2";
                        i++;
                        btn10.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O2";
                        i++;
                        btn10.setMouseTransparent(true);
                        break;
                }
                btnName[1][0] = currentPlayer;
                btn10.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 1, 0); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player
            }
        });

        GridPane.setRowIndex(btn20, 2);
        btn20.setAccessibleText("btn20");
        btn20.setMnemonicParsing(false);
        btn20.setPrefHeight(104.0);
        btn20.setPrefWidth(127.0);
        btn20.setStyle("-fx-background-color: bbcfff;");
        btn20.setText(" ");
        btn20.setWrapText(true);
        btn20.setFont(new Font("Berlin Sans FB", 58.0));
        btn20.getStyleClass().add("btn");
        btn20.getStylesheets().add("/design/bgStyle.css");
        btn20.setOnAction((ActionEvent event) -> {
            System.out.println(" 7th button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X3";
                        i++;
                        btn20.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O3";
                        i++;
                        btn20.setMouseTransparent(true);
                        break;
                }
                btnName[2][0] = currentPlayer;
                btn20.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 2, 0); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player

            }
        });

        GridPane.setColumnIndex(btn01, 1);
        btn01.setAccessibleText("btn01");
        btn01.setMnemonicParsing(false);
        btn01.setPrefHeight(104.0);
        btn01.setPrefWidth(128.0);
        btn01.setStyle("-fx-background-color: b11998;");
        btn01.setText(" ");
        btn01.setFont(new Font("Berlin Sans FB", 58.0));
        btn01.getStyleClass().add("btn");
        btn01.getStylesheets().add("/design/bgStyle.css");
        btn01.setOnAction((ActionEvent event) -> {
            System.out.println(" second button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X4";
                        i++;
                        btn01.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O4";
                        i++;
                        btn01.setMouseTransparent(true);
                        break;
                }
                btnName[0][1] = currentPlayer;
                btn01.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 0, 1); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player

            }
        });

        GridPane.setColumnIndex(btn11, 1);
        GridPane.setRowIndex(btn11, 1);
        btn11.setAccessibleText("btn11");
        btn11.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn11.setEllipsisString("");
        btn11.setMnemonicParsing(false);
        btn11.setPrefHeight(104.0);
        btn11.setPrefWidth(128.0);
        btn11.setStyle("-fx-background-color: bbcfff;");
        btn11.setText(" ");
        btn11.setFont(new Font("Berlin Sans FB", 58.0));
        btn11.getStyleClass().add("btn");
        btn11.getStylesheets().add("/design/bgStyle.css");
        btn11.setOnAction((ActionEvent event) -> {
            System.out.println(" fifth button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X5";
                        i++;
                        btn11.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O5";
                        i++;
                        btn11.setMouseTransparent(true);
                        break;

                }
                btnName[1][1] = currentPlayer;
                btn11.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 1, 1); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player

            }
        });

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
        btn21.setText(" ");
        btn21.setFont(new Font("Berlin Sans FB", 58.0));
        btn21.getStyleClass().add("btn");
        btn21.getStylesheets().add("/design/bgStyle.css");
        btn21.setOnAction((ActionEvent event) -> {
            System.out.println(" 8th button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X6";
                        i++;
                        btn21.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O6";
                        i++;
                        btn21.setMouseTransparent(true);
                        break;
                }
                btnName[2][1] = currentPlayer;
                btn21.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 2, 1); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player
            }
        });

        GridPane.setColumnIndex(btn02, 2);
        btn02.setAccessibleText("btn02");
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(104.0);
        btn02.setPrefWidth(128.0);
        btn02.setStyle("-fx-background-color: bbcfff;");
        btn02.setText(" ");
        btn02.setFont(new Font("Berlin Sans FB", 58.0));
        btn02.getStyleClass().add("btn");
        btn02.getStylesheets().add("/design/bgStyle.css");
        btn02.setOnAction((ActionEvent event) -> {
            System.out.println(" third button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X7";
                        i++;
                        btn02.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O7";
                        i++;
                        btn02.setMouseTransparent(true);
                        break;
                }
                btnName[0][2] = currentPlayer;
                btn02.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 0, 2); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player
            }
        });

        GridPane.setColumnIndex(btn12, 2);
        GridPane.setRowIndex(btn12, 1);
        btn12.setAccessibleText("btn12");
        btn12.setMnemonicParsing(false);
        btn12.setPrefHeight(104.0);
        btn12.setPrefWidth(129.0);
        btn12.setStyle("-fx-background-color: b11998;");
        btn12.setText(" ");
        btn12.setWrapText(true);
        btn12.setFont(new Font("Berlin Sans FB", 58.0));
        btn12.getStyleClass().add("btn");
        btn12.getStylesheets().add("/design/bgStyle.css");
        btn12.setOnAction((ActionEvent event) -> {
            System.out.println(" sixth button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "x8";
                        i++;
                        btn12.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O8";
                        i++;
                        btn12.setMouseTransparent(true);
                        break;
                }
                btnName[1][2] = currentPlayer;
                btn12.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 1, 2); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player

            }
        });

        GridPane.setColumnIndex(btn22, 2);
        GridPane.setRowIndex(btn22, 2);
        btn22.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        btn22.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btn22.setGraphicTextGap(5.0);
        btn22.setMnemonicParsing(false);
        btn22.setPrefHeight(104.0);
        btn22.setPrefWidth(129.0);
        btn22.setStyle("-fx-background-color: bbcfff;");
        btn22.setText(" ");
        btn22.setWrapText(true);
        btn22.setFont(new Font("Berlin Sans FB", 58.0));
        btn22.getStyleClass().add("btn");
        btn22.getStylesheets().add("/design/bgStyle.css");
        btn22.setOnAction((ActionEvent event) -> {
            System.out.println(" 9th button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X9";
                        i++;
                        btn22.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O9";
                        i++;
                        btn22.setMouseTransparent(true);
                        break;
                }
                btnName[2][2] = currentPlayer;
                btn22.setText(currentPlayer);
                currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                updateGame(currPlayer, 2, 2); // update state
                currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;// Switch player
            }
        });

        btn00.setAccessibleText("btn00");
        btn00.setAlignment(javafx.geometry.Pos.CENTER);
        btn00.setMnemonicParsing(false);
        btn00.setPrefHeight(104.0);
        btn00.setPrefWidth(127.0);
        btn00.setStyle("-fx-background-color: bbcfff;");
        btn00.setText(" ");
        btn00.setWrapText(true);
        btn00.setFont(new Font("Berlin Sans FB", 58.0));
        btn00.getStyleClass().add("btn");
        btn00.getStylesheets().add("/design/bgStyle.css");
        btn00.setOnAction((ActionEvent event) -> {
            System.out.println(" first button ");
            if (currentState == GameState.PLAYING) {
                switch (currPlayer) {
                    case X:
                        currentPlayer = Cell.X.toString();
                        db[i] = "X1";
                        i++;
                        btn00.setMouseTransparent(true);
                        break;
                    case O:
                        currentPlayer = Cell.O.toString();
                        db[i] = "O1";
                        i++;
                        btn00.setMouseTransparent(true);
                        break;
                }
                btnName[0][0] = currentPlayer;
                btn00.setText(currentPlayer);
                if (currentState == GameState.PLAYING) {
                    currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
                    updateGame(currPlayer, 0, 0); // update state
                    // Switch player
                    currPlayer = (currPlayer == Cell.X) ? Cell.O : Cell.X;
                }

            }
        });

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
        vBox3.getChildren().add(button);
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

        button0.setOnMouseClicked((event) -> {
            audioClip.stop();

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
        button.setOnMouseClicked((MouseEvent event) -> {
            if (audioClip.isPlaying()) {
                            audioClip.stop();

            }
            else{
                audioClip.stop();
            }

        });
    }

    public void updateGame(Cell currPlayer, int rowSelected, int colSelected) {
        String str;
        System.out.println("from update currPlayer " + currPlayer);
        switch (currPlayer) {
            case X:
                currentPlayer = Cell.X.toString();  //convert enum to string
                btnName[rowSelected][colSelected] = currentPlayer;
                break;
            case O:
                currentPlayer = Cell.O.toString();  //convert enum to string
                btnName[rowSelected][colSelected] = currentPlayer;
                break;
        }
        //*******************check for win*********************
        str = checkForWin.check(currentPlayer, rowSelected, colSelected);
        System.out.println("currPlayer" + currPlayer);
        if (str.equals(currentPlayer)) {
            currentState = (currPlayer == Cell.X) ? GameState.X_WON : GameState.O_WON;
            if (currentState.equals(GameState.X_WON)) {
                score1++;
                audioClip.stop();

                player1_score.setText("" + score1);
                button.setText("X-WIn press to play again ");
                dataBase.OpenConnection();
                s = Login.myPlayer;
                dataBase.FillStmt(db, s);
//                dataBase.storeScore(s, score1);
                System.out.println("x winnnnnn");
                Winner root = new Winner(stage, 4);
                Scene scene = new Scene(root);
                stage.setTitle("Winner");
                stage.setScene(scene);
                stage.show();

            } ////////////o Winner
            else if (currentState.equals(GameState.O_WON)) {
                audioClip.stop();

                score2++;
                player2_score.setText("" + score2);
                button.setText("O-WIn press to play again ");
                System.out.println("o winnnnnn");

                Winner root = new Winner(stage, 3);
                Scene scene = new Scene(root);
                stage.setTitle("Winner");
                stage.setScene(scene);
                stage.show();
            }
            System.out.println("from updateGame currentState " + currentState);
            if ((currentState == GameState.X_WON) || (currentState == GameState.O_WON)) {
                
                currentState = GameState.WINNING;
                button.setMnemonicParsing(false);
                button.setPrefHeight(99.0);
                button.setPrefWidth(122.0);
                button.setStyle("-fx-background-color: #b11998;");
                button.setWrapText(true);
                button.setOnAction((ActionEvent event) -> {
                    System.out.println(" button to play again ");
                    restart(); // restart the game
                });

            }
        } else if (!(btn00.getText().equals(" ")) & !(btn01.getText().equals(" ")) & !(btn02.getText().equals(" "))
                & !(btn10.getText().equals(" ")) & !(btn11.getText().equals(" ")) & !(btn12.getText().equals(" "))
                & !(btn20.getText().equals(" ")) & !(btn21.getText().equals(" ")) & !(btn22.getText().equals(" "))) {
            audioClip.stop();

            currentState = GameState.GAMEOVER;
            System.out.println("Game Over..............");
            MatchResultBase root = new MatchResultBase(stage, 3);
            Scene scene = new Scene(root);
            stage.setTitle("Match");
            stage.setScene(scene);
            stage.show();
        }
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
        btn00.setMouseTransparent(false);
        btn01.setMouseTransparent(false);
        btn02.setMouseTransparent(false);
        btn10.setMouseTransparent(false);
        btn11.setMouseTransparent(false);
        btn12.setMouseTransparent(false);
        btn20.setMouseTransparent(false);
        btn21.setMouseTransparent(false);
        btn22.setMouseTransparent(false);

        i = 0;
        dataBase.OpenConnection();
        currentPlayer = Cell.EMPTY.toString();
        currPlayer = Cell.valueOf(currentPlayer.toUpperCase());
        for (int l = 0; l < 3; l++) {
            for (int j = 0; j < 3; j++) {
                btnName[l][j] = "";
                checkForWin.matrix[l][j] = "";
            }
        }
        currentState = GameState.PLAYING; // ready to play
        currentPlayer = "x";
        currPlayer = Cell.X;              // X plays first
    }

//    void replay() {
//        Thread myThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                db = dataBase.Retrieve();
//                for (int i = 0; i < 9; i++) {
//                    if (!(db[i].equals(" "))) {
//                        switch (db[i].charAt(1)) {
//                            case '1':
//                                System.out.println(db[i].charAt(1));
//                                String s1 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn00.setText(s1);
//                                    }
//                                });
//                                break;
//                            case '2':
//                                System.out.println(db[i].charAt(1));
//                                String s2 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn10.setText(s2);
//                                    }
//                                });
//                                break;
//                            case '3':
//                                System.out.println(db[i].charAt(1));
//                                String s3 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn20.setText(s3);
//                                    }
//                                });
//                                break;
//                            case '4':
//                                System.out.println(db[i].charAt(1));
//                                String s4 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn01.setText(s4);
//                                    }
//                                });
//                                break;
//                            case '5':
//                                System.out.println(db[i].charAt(1));
//                                String s5 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn11.setText(s5);
//                                    }
//                                });
//                                break;
//                            case '6':
//                                System.out.println(db[i].charAt(1));
//                                String s6 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn21.setText(s6);
//                                    }
//                                });
//                                break;
//                            case '7':
//                                System.out.println(db[i].charAt(1));
//                                String s7 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn02.setText(s7);
//                                    }
//                                });
//                                break;
//                            case '8':
//                                System.out.println(db[i].charAt(1));
//                                String s8 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn12.setText(s8);
//                                    }
//                                });
//                                break;
//                            case '9':
//                                System.out.println(db[i].charAt(1));
//                                String s9 = String.valueOf(db[i].charAt(0));
//                                Platform.runLater(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        btn22.setText(s9);
//                                    }
//                                });
//                                break;
//                        }
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(TwoPlayersOffline.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }
//            }
//        });
//        myThread.start();
//    }
}

/*

Search for this stmt "2 statments" and replace it to name1 and name2
 s=Login.myPlayer;
/////////////////////////////////////////////////////////////

Search for button in update and check winner

/////////////////////////////////////////////////////////////////
///////////////This button for replay////////////////////////////
 button10.setOnAction((ActionEvent event) -> {
            System.out.println("button 10 for repaly");
            btn00.setText(" ");
            btn01.setText(" ");
            btn02.setText(" ");
            btn10.setText(" ");
            btn11.setText(" ");
            btn12.setText(" ");
            btn20.setText(" ");
            btn21.setText(" ");
            btn22.setText(" ");
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    btnName[k][j] = " ";
                    checkForWin.matrix[k][j] = " ";
                }
            }
            for (int k = 0; k < 9; k++) {
                db[k] = " ";
            }
            replay();
        });
 
 */
