public class main5 {

public static void main(String[] args) {
    

 Estudiante estudiante1 = new Estudiante();

 estudiante1.nombre = "Juan";
 estudiante1.edad = 12;
 double notaMedia1 = 7;
boolean final1 = estudiante1.aprobar(notaMedia1);

 System.out.println(final1);

 Estudiante estudiante2 = new Estudiante();

 estudiante2.nombre = "Alex";
 estudiante2.edad = 13;
 double notaMedia2 = 3;
boolean final2 = estudiante2.aprobar(notaMedia2);

System.out.println(final2);


}
    
}
