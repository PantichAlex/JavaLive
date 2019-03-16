
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Алексей
 */
public class Controller {

    View view;
    Model model;
   

    Controller(View v, Model m) {
        this.model = m;
        this.view = v;
        model.subscribe(this);
        view.controller = this;
    }

    public void startGame(int [][]field) {
        model.gameProcess(field);
    }

    public void stopGame() {
        System.out.println("Заглушка из метода stopGame");
        model.stopped = true;

    }

    public void showRules() {
        model.showRules();
    }

    public void update(int[][] field) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                
//                System.out.print(field[i][j]+" ");
//            }
//            System.out.println("");
//        }

        view.update(field);

    }

}
