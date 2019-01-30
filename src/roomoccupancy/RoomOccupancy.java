/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomoccupancy;

/**
 *
 * @author Omar Acosta <omardil@itesm.mx>
 * 
 * Crea una clase RoomOccupancy que pueda ser utilizada para almacenar la 
 * cantidad de gente en una habitación de un edificio. 
 * La clase tiene las siguientes características:

* Atributos:
* • floorNumber: el piso en donde se encuentra la habitación. 
* Esta variable sólo podrá almacenar números entre 1 y 10.
* • roomNumber: el número de habitación.
* • peopleInRoom: la cantidad de gente que está en la habitación.

* Métodos
* • Constructor: recibe valores para floorNumber y roomNumber. La cantidad de 
*                gente en la habitación se establecerá inicialmente en cero.
* • addOneToRoom: incrementa la cantidad de gente en la habitación por 1.
* • getters: para todas las variables de instancia de la clase.
* • setters: para la variable roomNumber. Asegúrate de asegurarte que 
*          el contenido de la variable se mantenga consistente. 
* 
 */
public class RoomOccupancy {

    private int floorNumber;
    private int roomNumber;
    private int peopleInRoom;
    
    public RoomOccupancy(int floorNumber, int roomNumber) {
        this.floorNumber = floorNumber;
        this.setRoomNumber(roomNumber);
        this.peopleInRoom = 0;
    }
        

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getPeopleInRoom() {
        return peopleInRoom;
    }

    public void setRoomNumber(int roomNumber) {
        if (roomNumber > 0 ) 
            this.roomNumber = roomNumber;
    }
    
    public void addOneToRoom(){
        this.peopleInRoom += 1;
    }


    
}
