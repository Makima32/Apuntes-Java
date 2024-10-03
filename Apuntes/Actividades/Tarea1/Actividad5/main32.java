
public class main32 {
    


public static void main(String[] args) {
   
    
 //creamos un objeto con la clase estudiante2 y creamos un objeto llamado estudiante32 para asignarle sus atributos.

Estudiante2 estudiante32 = new Estudiante2();

estudiante32.nombre = "Alberto";
estudiante32.edad = 24;
estudiante32.nota = 5;

//pasamos la variable de nota a resultadoNota, simplemente para tener un nombre mas corto y que sea mas facil entender 
double resultadoNota = estudiante32.nota;

boolean notaFinal = estudiante32.aprobar(resultadoNota);

//anotacion, si el caso del if la variable es de tipo bolean entonces con poner la variable ya da por hecho que antes del else es cuando es true y lo de despues de else es falso.
if (notaFinal) {

    System.out.println("Has aprobado");
    
}else{
    System.out.println("Has suspendido");

}


}
}
