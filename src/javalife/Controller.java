package javalife;

import java.util.Timer;
import java.util.TimerTask;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Класс контроллера
 * @author Алексей
 */
public class Controller {

    //Создаем модель и представление
    View view;
    Model model;
   

    /**
     * Конструктор контроллера, инициализируем модель и представление
     * @param v
     * @param m 
     */
    Controller(View v, Model m) {
        this.model = m;
        this.view = v;
        model.subscribe(this);
        view.controller = this;
    }

    /**
     * Старт игры
     * @param field 
     */
    public void startGame(int [][]field) {
        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
               if(model.stopped){
                      System.out.println("Game Over");
                   timer.cancel();
               } 
               
               model.gameProcess(field);
               update(model.getField());
            }
            
        };
        
        timer.schedule(task, 0,300);
    
    }

    /**
     * Останавливаем игру
     */
    public void stopGame() {
     
        model.stopped = true;

    }

    /**
     * Показать результаты
     */
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
