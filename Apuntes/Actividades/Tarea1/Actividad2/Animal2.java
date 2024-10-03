//Crea un método en la clase Animal que permita aumentar la edad del animal en 1 año cada vez que se llame al método. Llama a este método envejecer().

public class Animal2 {

    //Atributos
    String especie;

    int edad; 

    //Metodos
    public void detalles () {
        

        System.out.println( "El animal es de la especie " + especie + " y su edad es " + edad);
    }

      //Añade 1 año extra cada vez que se llame al metodo envejecer

      public void envejecer() {

    //Podemos sumar de 2 maneras
    edad += 1; 
    //o
    //edad++;
        

      }

    }
