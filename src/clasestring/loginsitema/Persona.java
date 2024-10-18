package clasestring.loginsitema;

public class Persona {

        private String usuario;
        private String contrasena;

        //constructor
        public Persona(String usuario, String contrasena) {
            this.usuario = usuario;
            this.contrasena = contrasena;
        }

        public String getUsuario() {
            return usuario;
        }

        public String getContrasena() {
            return contrasena;
        }
    }

