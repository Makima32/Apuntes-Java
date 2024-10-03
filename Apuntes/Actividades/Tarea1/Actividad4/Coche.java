//Crea una clase Coche con un método calcularConsumo() que tome como parámetros la distancia recorrida y el combustible consumido, y devuelva el consumo de combustible en litros por kilómetro.

public class Coche {

    
    //Atributos

   
    //Metodos

    public int calcularConsumo(int combustible, int distancia) {

        //Distancia en Km y Combustible en L

    return combustible / distancia;

    }

   


}
//Coreccion 
//4. Clase Coche con método calcularConsumo()
//Main: El método está bien, pero el cálculo de consumo es incorrecto. Actualmente, haces distancia / combustible, lo cual da kilómetros por litro, no litros por kilómetro.
//Corrección: El consumo debe ser combustible / distancia para obtener el consumo en litros por kilómetro.
