package javalife;


import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Алексей
 */
public class Model {

    int[][] field, lastConfig;
    private ArrayDeque<int[][]> Deq=new ArrayDeque<>();
    boolean stopped;
    Controller contr;
    String rules = "Условия жизни клеток:\n"
            + "в пустой (мёртвой) клетке, рядом с которой ровно три живые клетки, зарождается жизнь;\n"
            + "• если у живой клетки есть две или три живые соседки, то эта клетка продолжает жить; в противном\n"
            + "случае, если соседей меньше двух или больше трёх, клетка умирает («от одиночества» или «от\n"
            + "перенаселённости»)\n"
            + "\n"
            + "Игра прекращается, если\n"
            + "• на поле не останется ни одной «живой» клетки,\n"
            + "• конфигурация на очередном шаге в точности (без сдвигов и поворотов) повторит себя же на одном из\n"
            + "более ранних шагов (складывается периодическая конфигурация),\n"
            + "• при очередном шаге ни одна из клеток не меняет своего состояния (складывается стабильная\n"
            + "конфигурация; предыдущее правило, вырожденное до одного шага назад)";

    public int[][] getField(){
        return field;
    }
    public void gameProcess(int[][] field) {
        // System.out.println("Заглушка из метода gameProcess");
        
        //test();
        int n = field.length;
        int m = field[0].length;
        this.field=field;
        lastConfig=new int[n][m];
        for(int i=0; i<n; ++i){
            for(int j=0; j<m; ++j){
            
                lastConfig[i][j]=this.field[i][j];
            }
        }
        
        //Рождение клеток
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 0) {
                    
                    //Считаем соседей, если их 3, то рождается клетка
                    if (countSosed(i, j, n, m, field) == 3) {
                        this.field[i][j] = 1;
                    
                    }
                }
            }
        }
    
      //Смерть клеток
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 1) {
                    if ((countSosed(i, j, n, m, field) < 2) || (countSosed(i, j, n, m, field) > 3)) {
                        this.field[i][j] = 0;
                      
                    }
                }
            }
        }
        autoStop();
        
    }
    //Метод останавливает игру если конфигурция не изменилась
    public void autoStop(){
        
     
        
    }
    public void showRules() {
        JOptionPane.showMessageDialog(null, rules);
    }

    public void subscribe(Controller c) {
        this.contr = c;
    }

    public void notifySub() {
        contr.update(field);
    }

    public void test() {
        field = new int[8][8];
        System.out.println("qqq" + field.length);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field[i][j] = 1;
                // System.out.print(field[i][j]+" ");
            }
            //System.out.println("");
        }
        field[1][1] = 0;
        field[1][5] = 0;

        contr.update(field);
    }

    public int endMassive(int i0, int j0, int n, int m, int[][] field) {
        //System.out.println("DEBUG");
        if (i0 < 0 || j0 < 0 || i0 > n || j0 > m) {
            return 0;
        }
        try {
            int item = field[i0][j0]>0 ? 1: 0;
            return item;
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NullPointerException e){
            
        }
        return 0;

    }

    /**
     * Считает соседей
     * @param i0
     * @param j0
     * @param n
     * @param m
     * @return 
     */
    public int countSosed(int i0, int j0, int n, int m, int[][] field) {
        int count = 0;
        count += endMassive(i0 - 1, j0, n, m, field);
        count += endMassive(i0 - 1, j0 + 1, n, m, field);
        count += endMassive(i0, j0 - 1, n, m, field);
        count += endMassive(i0, j0 + 1, n, m, field);
        count += endMassive(i0 + 1, j0 - 1, n, m, field);
        count += endMassive(i0 + 1, j0 + 1, n, m, field);
        count += endMassive(i0 + 1, j0, n, m, field);
        count += endMassive(i0 - 1, j0 - 1, n, m, field);
        return count;
    }
    
    public void interactionPopulations(int[][] field) {
        int n = field.length;
        int m = field[0].length;
        int countOwnPopulation = 0;
        int countEnemies = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (!(field[i][j] == 0)) {
                    if (i - 1 >= 0 && field[i - 1][j] != 0 && field[i][j] == field[i - 1][j]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (i - 1 >= 0 && j - 1 >= 0 && field[i - 1][j] != 0 && field[i][j] == field[i - 1][j - 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (j - 1 >= 0 && field[i - 1][j] != 0 && field[i][j] == field[i][j - 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (i - 1 >= 0 && j + 1 <= m - 1 && field[i - 1][j] != 0 && field[i][j] == field[i - 1][j + 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (i + 1 <= n - 1 && j - 1 >= 0 && field[i - 1][j] != 0 && field[i][j] == field[i + 1][j - 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (i + 1 <= n - 1 && field[i - 1][j] != 0 && field[i][j] == field[i + 1][j]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (j + 1 <= m - 1 && field[i - 1][j] != 0 && field[i][j] == field[i][j + 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (i + 1 <= n - 1 && j + 1 <= m - 1 && field[i - 1][j] != 0 && field[i][j] == field[i + 1][j + 1]) {
                        countOwnPopulation++;
                    } else {
                        countEnemies++;
                    }
                    if (countEnemies >= countOwnPopulation) {
                        field[i][j]=0;
                    }
                }
            }
        }
    }

}
