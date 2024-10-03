//Crea una clase llamada Libro con los atributos titulo, autor y numeroDePaginas. Crea un método detalles() que imprima todos esos atributos, y un método adicional llamado esLargo() que devuelva true si el libro tiene más de 300 páginas, y false si no.


public class Libro {

    //Atributos 

    String Titulo;
    String Autor; 
    int numero_de_paginas;

    //Metodo 

    public void detalles() { 


        System.out.println(" El titulo del libro es " + Titulo + ", el autor es " + Autor +", y el numero de paginas es de " + numero_de_paginas);
    }

    //Metodo que devuelva true o falso en funcion de si tiene mas de 300 paginas, false si tiene - de 300, true si tiene + de 300

    public void Largo() {

if (numero_de_paginas >= 300) {

System.out.println("Verdadero");



} else { 

    System.out.println("Falso");


}



    }


}

