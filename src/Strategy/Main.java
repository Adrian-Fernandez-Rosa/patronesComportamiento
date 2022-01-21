package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // UsuariosMemoria usuarios = new UsuariosMemoria();
        int tipo = 1;

        Usuarios usuarios;
        if (tipo == 0) { //imagina que segun el vento se modifica la variable
             usuarios = new UsuariosMemoria();
        }else {
            usuarios = new UsuariosFichero();
        }

        //como se puede notar se puede seguir usando reutilizando el código
        /*
        usuarios.crear("fulano");
        usuarios.crear("mengano");
        usuarios.crear("pepe");

         */
        crear(usuarios,"fulano");
        crear(usuarios,"mengano");
        crear(usuarios,"pepe");

        for (String usuario : listar(usuarios)){
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuario,String nombre) { //primer parametro la interfaz
        usuario.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
