public class Main2 {
    public static void main(String[] args ) {
        //Crear objeto
        Animal2 Animal1 = new Animal2(); 
        Animal1.especie = "Mono";
        Animal1.edad = 11;
        //metodo
       
        //suma 1 a edad
        Animal1.envejecer();

        //Muestra en terminal especie y edad
        
        Animal1.detalles();
    }
    
}

