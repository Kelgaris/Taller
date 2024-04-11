/*
 Taller donde reparan: Coches, Motos, Camiones, Tractores, Grúas
 Con un menú donde ponga:
    1. ¿Qué vehiculo entra? (Nos tiene que dar la información del vehículo).
    2. ¿Qué hay que reparar?
    3. Seguir o Salir
    Mínimo de 5 piezas

    Vehículo: Tiene Matrícula, Color y Marca.
    Requisitos: Herecia y Polimorfismo.

    Pregunta 1: ¿Puede existir la siguiente estructura? Razona la respuesta.
    En JAVA puede exitir una Clase Padre - una Clase Hijo - una Clase Hijo del propio Hijo

    Pregunta 2: ¿Puede existir una clase que herede de 2 padres? Razona la respuesta.

    Las preguntas teoricas se responden en el README de GITHUB
*/

import javax.swing.JOptionPane;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String color;
    
    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public void reparacion(){
        JOptionPane.showMessageDialog(null,"Error al indicar el tipo de vehículo");
    }
}