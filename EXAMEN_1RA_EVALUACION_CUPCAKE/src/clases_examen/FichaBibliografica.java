package clases_examen;

public class FichaBibliografica {

    private String autor, titulo, ciudad, editorial, estado, pais, editor, volumen, traductor, tituloBreve, Comentarios,
            Medio, URL, DOI;
    private int año, paginas, numVolumenes, numeroEstandar, edicion, añoConsulta, mesConsulta, diaConsulta;

    public FichaBibliografica() {
        this.autor = "John Katzenbach";
        this.titulo = "El psicoanalista";
        this.ciudad = "Princeton";
        this.editorial = "Ediciones b";
        this.año = 2003;
        this.paginas = 195;

    }

    public FichaBibliografica(String autor, String titulo, String ciudad, String editorial, int año, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.ciudad = ciudad;
        this.editorial = editorial;
        this.año = año;
        this.paginas = paginas;
    }

    public void imprimirFicha() {
        System.out.println( autor + " (" + año + "). " + titulo + "(p." + paginas + "). " + ciudad + ": " + editorial + ".");
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getTraductor() {
        return traductor;
    }

    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }

    public String getTituloBreve() {
        return tituloBreve;
    }

    public void setTituloBreve(String tituloBreve) {
        this.tituloBreve = tituloBreve;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getMedio() {
        return Medio;
    }

    public void setMedio(String Medio) {
        this.Medio = Medio;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDOI() {
        return DOI;
    }

    public void setDOI(String DOI) {
        this.DOI = DOI;
    }

    public int getNumVolumenes() {
        return numVolumenes;
    }

    public void setNumVolumenes(int numVolumenes) {
        this.numVolumenes = numVolumenes;
    }

    public int getNumeroEstandar() {
        return numeroEstandar;
    }

    public void setNumeroEstandar(int numeroEstandar) {
        this.numeroEstandar = numeroEstandar;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getAñoconsulta() {
        return añoConsulta;
    }

    public void setAñoConsulta(int añoConsulta) {
        this.añoConsulta = añoConsulta;
    }

    public int getMesConsulta() {
        return mesConsulta;
    }

    public void setMesConsulta(int mesConsulta) {
        this.mesConsulta = mesConsulta;
    }

    public int getDiaConsulta() {
        return diaConsulta;
    }

    public void setDiaConsulta(int diaConsulta) {
        this.diaConsulta = diaConsulta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
