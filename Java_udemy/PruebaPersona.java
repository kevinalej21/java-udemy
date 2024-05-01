public class PruebaPersona {

    public static void main(String[] args) {

        persona Persona1 = new persona();
        Persona1.Nombre = "Juan";
        Persona1.Apellido = "perez";
        Persona1.desplegarInformacion();

        
        persona Persona2 = new persona();

        System.out.println("Persona2"+Persona2);
        System.out.println("Persona1"+Persona1);

        Persona2.desplegarInformacion();
        Persona2.Nombre = "Karla" ;
        Persona2.Apellido ="Lara";
        Persona2.desplegarInformacion();


    }

}