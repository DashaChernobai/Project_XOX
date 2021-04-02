package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class Controller {

    @FXML
    private Button button_01;

    @FXML
    private Button button_11;

    @FXML
    private Button button_21;

    @FXML
    private Button button_00;

    @FXML
    private Button button_10;

    @FXML
    private Button button_20;

    @FXML
    private Button button_02;

    @FXML
    private Button button_12;

    @FXML
    private Button button_22;

    @FXML
    private Button button_reset;

    private int player=1;
    private int pole[][] = new int[3][3];
    private boolean game;
    private int check;
    private int sum;

    void IsWin(){
        check=0;
        for(int i=0; i<3; i++) {

            if ((pole[0][i]==pole[1][i])&&(pole[1][i]==pole[2][i])&&(pole[0][i])!=0){

                check=player;
            };
            if ((pole[i][0]==pole[i][1])&&(pole[i][1]==pole[i][2])&&(pole[i][1])!=0){

                check=player;
            };
            if ((pole[1][1]==pole[2][2])&&(pole[2][2]==pole[0][0])&&(pole[1][1])!=0){

                check=player;
            };
            if ((pole[2][0]==pole[1][1])&&(pole[0][2]==pole[1][1])&&(pole[1][1])!=0){

                check=player;
            };

        }
        if ((check!=0)&&(game)) {
            System.out.print("Выиграл игрок "+check+" !!! ");


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Инфа");

            // Header Text: null
            alert.setHeaderText(null);
            alert.setContentText("Выиграл игрок "+check+" !!! ");

            alert.showAndWait();


            System.out.println();
            game=false;

        }
        sum=0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (pole[i][j]!=0) {sum++;}
            }
        }
        System.out.print(sum);
        System.out.println();
        if ((sum==9)&&(game)){
            System.out.print("Ничья !!! ");


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Инфа");

            // Header Text: null
            alert.setHeaderText(null);
            alert.setContentText("Ничья !!! ");

            alert.showAndWait();


            System.out.println();
            game=false;
        }
    }


    @FXML
    void initialize(){
        game=true;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                pole[i][j]=0;
            }
        }
        button_reset.setOnAction(event->{
            game=true;
            player = 1;
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    pole[i][j] =0;
                }
            }
            button_00.setText("");
            button_01.setText("");
            button_02.setText("");
            button_10.setText("");
            button_11.setText("");
            button_12.setText("");
            button_20.setText("");
            button_21.setText("");
            button_22.setText("");



        });

        button_00.setOnAction(event->{
            if (player==1){button_00.setText("X");player=2;pole[0][0]=2;}
            else
                if (player==2){button_00.setText("O");player=1;pole[0][0]=1;}
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();

        });

        button_01.setOnAction(event->{
            if (pole[0][1]==0)
            {
                if (player==1){button_01.setText("X");player=2;pole[0][1]=2;}
                else
                if (player==2){button_01.setText("O");player=1;pole[0][1]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_02.setOnAction(event->{
            if (pole[0][2]==0)
            {
                if (player==1){button_02.setText("X");player=2;pole[0][2]=2;}
                else
                if (player==2){button_02.setText("O");player=1;pole[0][2]=1;}

            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_10.setOnAction(event->{
            if (pole[1][0]==0) {
                if (player==1){button_10.setText("X");player=2;pole[1][0]=2;}
                else
                if (player==2){button_10.setText("O");player=1;pole[1][0]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_11.setOnAction(event->{
            if (pole[1][1]==0) {
                if (player==1){button_11.setText("X");player=2;pole[1][1]=2;}
                else
                if (player==2){button_11.setText("O");player=1;pole[1][1]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_12.setOnAction(event->{
            if (pole[1][2]==0) {
                if (player==1){button_12.setText("X");player=2;pole[1][2]=2;}
                else
                if (player==2){button_12.setText("O");player=1;pole[1][2]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_20.setOnAction(event->{
            if (pole[2][0]==0) {
                if (player==1){button_20.setText("X");player=2;pole[2][0]=2;}
                else
                if (player==2){button_20.setText("O");player=1;pole[2][0]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });

        button_21.setOnAction(event->{
            if (pole[2][1]==0) {
                if (player==1){button_21.setText("X");player=2;pole[2][1]=2;}
                else
                if (player==2){button_21.setText("O");player=1;pole[2][1]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });
        button_22.setOnAction(event->{
            if (pole[2][2]==0) {
                if (player==1){button_22.setText("X");player=2;pole[2][2]=2;}
                else
                if (player==2){button_22.setText("O");player=1;pole[2][2]=1;}
            }

            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + "\t");
                }
                System.out.println();
            }
            IsWin();
        });


        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
