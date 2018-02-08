/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Exercise2 {
    public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
        
            objetos = new City("Exercise2.txt");
	    objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.canPickThing();
            estudiante.pickThing();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
        }
}
