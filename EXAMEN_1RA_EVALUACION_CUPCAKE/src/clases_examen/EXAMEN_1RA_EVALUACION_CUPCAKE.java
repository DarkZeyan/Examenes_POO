package clases_examen;
import java.util.Scanner;


public class EXAMEN_1RA_EVALUACION_CUPCAKE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String opcion;
        DatosIntegrantes.imprimirDatosEquipo("#21550317","ISC","Jorge Eduardo","Escobar Bugarini");
        DatosIntegrantes.imprimirDatosEquipo("#21550297","ISC","Edgar Gerardo","Delgado Cerrillo");
        DatosIntegrantes.imprimirDatosEquipo("#21550740","ISC","Luis Antonio","Garcia Colunga");
        System.out.println("Seleccione una opción para continuar: \n a)Lista de problemas resueltos \t b)Mostrar resultado de problemas");
        opcion = read.next();
        while(opcion.equalsIgnoreCase("a")==false && opcion.equalsIgnoreCase("b")==false){
            System.out.println("Seleccione una opción válida");
            opcion = read.next();
        }
        switch(opcion){
            case "a": 
                DatosIntegrantes.imprimirProblemasResueltos();
                break;
            case"b":
                System.out.println("///////// Clase Contraseña /////////");
                Password p1 = new Password();
                p1.setPassword("asd");
                System.out.println(p1.verificarAcceso("user", "asd"));
                System.out.println(p1.verificarAcceso("asd", "asd"));
                System.out.println("///////// Clase Pelicula /////////");
                Pelicula peli1 = new Pelicula();
                peli1.setTitulo("Transformers");
                peli1.setEstudio("Paramount");
                peli1.setRating(15);
                peli1.imprimirDatos();
                peli1.evaluarEdad(16);
                System.out.println("///////// Clase FichaBibliografica /////////");
                FichaBibliografica ficha = new FichaBibliografica();
                ficha.imprimirFicha();
                System.out.println("///////// Clase TestCovid /////////");
                TestCovid vicho19 = new TestCovid();
                vicho19.setEdad(18);
                vicho19.setPeso(80);
                vicho19.setEstatura(1.72);
                vicho19.setTieneEnfermedadCronica(false);
                vicho19.calcularPersonaRiesgo();
                System.out.println("///////// Clase cuenta bancaria /////////");
                CuentaBancaria cuenta1 = new CuentaBancaria();
                cuenta1.imprimirDatos();
                CuentaBancaria cuenta2 = new CuentaBancaria("0022115", "002266", 6500.20);
                cuenta2.imprimirDatos();
                cuenta2.depositarEnCuenta(250);
                cuenta2.imprimirDatos();
                cuenta2.retirarDeCuenta(9999.00);
                cuenta2.retirarDeCuenta(400.00);
                cuenta2.imprimirDatos();
        }
        
        
      
      
    }

}
