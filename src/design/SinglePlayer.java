package design;

import SingleLevels.BasicForGame;
import SingleLevels.EasyLevel;
import SingleLevels.HardLevel;
import SingleLevels.MediumLevel;
import java.nio.file.Paths;
import java.util.Random;
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

public class SinglePlayer extends AnchorPane {

    protected final VBox vBox;
    protected final BorderPane borderPane;
    protected final AnchorPane anchorPane;
    protected final VBox vBox0;
    protected final VBox vBox1;
    protected final Text player_name;
    protected final Label label;
    protected final Text score_player;
    protected final VBox vBox2;
    protected final Text pc_name;
    protected final Label label0;
    protected final Text score_pc;
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
    int moveNum;
    BasicForGame.Move nextMove;
    Random ran;
    int flag = 0;
    Stage stage;
    AudioClip audioClip;

    void scoreScreen(Button[][] board) {
        audioClip.stop();
        int result = BasicForGame.evaluate(board);
        if (result == 10) {
            System.out.println("You lost :(");
            score_pc.setText("1");
            System.out.println("You lost :(");

            GameOver root = new GameOver(stage, 1);
            Scene scene = new Scene(root);
            stage.setTitle("Lose");
            stage.setScene(scene);
            stage.show();

        } else if (result == -10) {
            System.out.println("You won ^^");
            Winner root = new Winner(stage, 1);
            Scene scene = new Scene(root);
            stage.setTitle("Winner");
            stage.setScene(scene);
            stage.show();
            score_player.setText("1");
        } else if (BasicForGame.isMoveLeft(board) == false) {
            System.out.println("No One!");
            MatchResultBase root = new MatchResultBase(stage, 1);
            Scene scene = new Scene(root);
            stage.setTitle("Tie");
            stage.setScene(scene);
            stage.show();
        }
    }

    void changeFlag(int num) {
        flag = num;
    }

    public SinglePlayer(Stage s, String level) {
        stage = s;
        audioClip = new AudioClip(this.getClass().getResource("Audio/open.mp3").toString());
        audioClip.play();
        audioClip.setCycleCount(200);
        vBox = new VBox();
        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        vBox0 = new VBox();
        vBox1 = new VBox();
        player_name = new Text();
        label = new Label();
        score_player = new Text();
        vBox2 = new VBox();
        pc_name = new Text();
        label0 = new Label();
        score_pc = new Text();
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
        Button board[][] = {{btn00, btn01, btn02}, {btn10, btn11, btn12}, {btn20, btn21, btn22}};
        ran = new Random();
        moveNum = flag = 0;
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

        AnchorPane.setBottomAnchor(vBox1, 30.0);
        AnchorPane.setLeftAnchor(vBox1, 100.0);
        AnchorPane.setTopAnchor(vBox1, 50.0);
        vBox1.setLayoutX(52.0);
        vBox1.setLayoutY(14.0);
        vBox1.setPrefHeight(120.0);
        vBox1.setPrefWidth(120.0);

        player_name.setFill(javafx.scene.paint.Color.WHITE);
        player_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player_name.setStrokeWidth(0.0);
        player_name.setText("Player");
        player_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        player_name.setTextOrigin(javafx.geometry.VPos.CENTER);
        player_name.setWrappingWidth(120.92340087890625);
        player_name.setFont(new Font("Berlin Sans FB Demi Bold", 32.0));

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setPrefHeight(26.0);
        label.setPrefWidth(89.0);
        label.setText("Score");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        VBox.setMargin(label, new Insets(5.0, 5.0, 5.0, 10.0));
        label.setFont(new Font("System Bold Italic", 14.0));

        score_player.setFill(javafx.scene.paint.Color.WHITE);
        score_player.setLineSpacing(2.0);
        score_player.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        score_player.setStrokeWidth(0.0);
        score_player.setText("0");
        score_player.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        score_player.setWrappingWidth(121.18308448791504);
        score_player.setFont(new Font("System Bold", 24.0));

        AnchorPane.setBottomAnchor(vBox2, 30.0);
        AnchorPane.setRightAnchor(vBox2, 100.0);
        AnchorPane.setTopAnchor(vBox2, 50.0);
        vBox2.setLayoutX(465.0);
        vBox2.setLayoutY(57.0);
        vBox2.setPrefHeight(120.0);
        vBox2.setPrefWidth(120.0);

        pc_name.setFill(javafx.scene.paint.Color.WHITE);
        pc_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        pc_name.setStrokeWidth(0.0);
        pc_name.setText("PC");
        pc_name.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        pc_name.setTextOrigin(javafx.geometry.VPos.CENTER);
        pc_name.setWrappingWidth(143.32342529296875);
        pc_name.setFont(new Font("Berlin Sans FB Demi Bold", 32.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label0.setPrefHeight(26.0);
        label0.setPrefWidth(129.0);
        label0.setText("Score");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("System Bold Italic", 14.0));
        VBox.setMargin(label0, new Insets(5.0, 0.0, 0.0, 0.0));

        score_pc.setFill(javafx.scene.paint.Color.WHITE);
        score_pc.setLineSpacing(2.0);
        score_pc.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        score_pc.setStrokeWidth(0.0);
        score_pc.setText("0");
        score_pc.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        score_pc.setWrappingWidth(121.18308448791504);
        score_pc.setFont(new Font("System Bold", 24.0));

        AnchorPane.setRightAnchor(vBox3, 5.0);
        AnchorPane.setTopAnchor(vBox3, 15.0);
        vBox3.setLayoutX(548.0);
        vBox3.setLayoutY(14.0);
        vBox3.setPrefHeight(42.0);
        vBox3.setPrefWidth(80.0);

        button.setMnemonicParsing(false);
        button.setPrefHeight(30.0);
        button.setPrefWidth(42.0);
        // button.setStyle("-fx-background-color: bbcfff;");
        button.getStyleClass().add("music");
        button.getStylesheets().add("/design/bgStyle.css");
        // button.setFont(new Font("System Bold", 20.0));

        // innerShadow.setColor(javafx.scene.paint.Color.#ba1dbd);
        // innerShadow.setRadius(14.135);
        //innerShadow.setWidth(37.54);
        //button.setEffect(innerShadow);
        button0.setBlendMode(javafx.scene.effect.BlendMode.SRC_ATOP);
        button0.setLayoutX(25.0);
        button0.setLayoutY(15.0);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.97);
        button0.setPrefHeight(30.0);
        button0.setPrefWidth(42.0);
        //button0.setStyle("-fx-background-color: bbcfff;");
        button0.getStyleClass().add("back");
        button0.getStylesheets().add("/design/bgStyle.css");
        //button0.setFont(new Font("System Bold", 20.0));

        //  innerShadow0.setColor(javafx.scene.paint.Color.#a125b2);
        innerShadow0.setRadius(16.5175);
        innerShadow0.setWidth(47.07);
        // button0.setEffect(innerShadow0);
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
        btn10.setText("");
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
        btn20.setText("");
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
        btn01.setText("");
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
        btn11.setText("");
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
        btn21.setText("");
        btn21.setFont(new Font("Berlin Sans FB", 58.0));
        btn21.getStyleClass().add("btn");
        btn21.getStylesheets().add("/design/bgStyle.css");
        GridPane.setColumnIndex(btn02, 2);
        btn02.setAccessibleText("btn02");
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(104.0);
        btn02.setPrefWidth(128.0);
        btn02.setStyle("-fx-background-color: bbcfff;");
        btn02.setText("");
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
        btn12.setText("");
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
        btn22.setText("");
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
        btn00.setText("");
        btn00.setWrapText(true);
        btn00.setFont(new Font("Berlin Sans FB", 58.0));
        btn00.getStyleClass().add("btn");
        btn00.getStylesheets().add("/design/bgStyle.css");
        borderPane.setCenter(anchorPane0);

        anchorPane.getChildren().add(vBox0);
        vBox1.getChildren().add(player_name);
        vBox1.getChildren().add(label);
        vBox1.getChildren().add(score_player);
        anchorPane.getChildren().add(vBox1);
        vBox2.getChildren().add(pc_name);
        vBox2.getChildren().add(label0);
        vBox2.getChildren().add(score_pc);
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
        vBox.getChildren().add(borderPane);
        getChildren().add(vBox);

        button0.setOnMouseClicked((MouseEvent event) -> {
            audioClip.stop();
            final java.net.URL resource = getClass().getResource("Audio/button-30.mp3");
            final Media media = new Media(resource.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            MainDesign root = new MainDesign(s);
            Scene scene1 = new Scene(root);

            s.setTitle("Main");
            s.setScene(scene1);
            s.show();
        });
        button.setOnMouseClicked((MouseEvent event) -> {
            if (audioClip.isPlaying()) {
                audioClip.stop();

            } else {
                audioClip.stop();
            }
        });

        for (Button[] btns : board) {
            for (Button btn : btns) {
                switch (level) {

                    case "Hard":
                        btn.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
                            if (flag == 0) {
                                btn.setText("O");
                                btn.setMouseTransparent(true);
                                if (moveNum + 1 < 10) {
                                    changeFlag(1);
                                    nextMove = HardLevel.findNextMove(board);
                                    Thread t = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {

                                            }
                                            Platform.runLater(() -> {
                                                if (moveNum < 9) {
                                                    board[nextMove.row][nextMove.col].setText("X");
                                                    board[nextMove.row][nextMove.col].setMouseTransparent(true);
                                                }
                                                changeFlag(0);
                                            });
                                            moveNum += 2;
                                            if (moveNum >= 5) {

                                                Platform.runLater(() -> {
                                                    scoreScreen(board);
                                                });
                                            }

                                        }
                                    });

                                    t.start();

                                }

                            }
                        });
                        break;
                    case "Easy":
                        btn.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
                            if (flag == 0) {
                                btn.setText("O");
                                btn.setMouseTransparent(true);
                                if (moveNum + 1 < 10) {
                                    changeFlag(1);
                                    nextMove = EasyLevel.findNextMove(board);
                                    Thread t = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {

                                            }
                                            Platform.runLater(() -> {
                                                if (moveNum < 9) {
                                                    board[nextMove.row][nextMove.col].setText("X");
                                                    board[nextMove.row][nextMove.col].setMouseTransparent(true);
                                                }
                                                changeFlag(0);
                                            });
                                            moveNum += 2;
                                            if (moveNum >= 5) {

                                                Platform.runLater(() -> {
                                                    scoreScreen(board);
                                                });
                                            }

                                        }
                                    });

                                    t.start();

                                }

                            }
                        });
                        break;
                    case "Medium":
                        btn.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
                            if (flag == 0) {
                                btn.setText("O");
                                btn.setMouseTransparent(true);
                                if (moveNum + 1 < 10) {
                                    changeFlag(1);
                                    nextMove = MediumLevel.findNextMove(board);
                                    Thread t = new Thread(new Runnable() {
                                        @Override
                                        public void run() {
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {

                                            }
                                            Platform.runLater(() -> {
                                                if (moveNum < 9) {
                                                    board[nextMove.row][nextMove.col].setText("X");
                                                    board[nextMove.row][nextMove.col].setMouseTransparent(true);
                                                }
                                                changeFlag(0);
                                            });
                                            moveNum += 2;
                                            if (moveNum >= 5) {

                                                Platform.runLater(() -> {
                                                    scoreScreen(board);
                                                });
                                            }

                                        }
                                    });

                                    t.start();

                                }

                            }
                        });
                        break;
                }
            }

        }

    }
}
