/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mattemonwumpus;

/**
 *
 * @author Mushu, tsauvajon, BAECHLER, zieflo3
 */
public class MatteMaClass {

    public static void main(String[] args) {
 
        int[][][] map;
        
        BoardGenerator board = new BoardGenerator();
        map = board.getMap();
        AmonokBouge amonok = new AmonokBouge(map, board.getU_x(), board.getU_y());
        amonok.AmonokStart();

    }

}
