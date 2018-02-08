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
public class Exercise1 {
     public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            objetos = new City("Exercise1.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move ();
            estudiante.move ();
            estudiante.turnLeft();
            estudiante.turnLeft();
            
        }
}
