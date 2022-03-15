package clases_examen;
public class Pelicula {
    private String titulo,estudio;
    private int rating;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public void imprimirDatos(){
        System.out.println("Nombre de la pelicula: "+titulo);
        System.out.println("Estudio de la pelicula: "+estudio);
        System.out.println("Rating/Edad recomendada para verla: "+rating);
    }
    public void evaluarEdad(int edad){
        if(edad>=rating) System.out.println("Puedes ver la pelicula");
        else System.out.println("No puedes ver la pelicula");
    }
    
}
