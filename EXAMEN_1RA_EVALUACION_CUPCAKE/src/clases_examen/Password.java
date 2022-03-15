package clases_examen;

public class Password {
    private String usuario,password;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Password(){
        this.usuario = "user";
        this.password = "password";
    }

    public Password(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }
    
    public boolean verificarAcceso(String usuario, String password){
        boolean answer;
        if (this.usuario==usuario && this.password == password){
            answer = true;
        }else answer=false;
        return answer;
    }
}
