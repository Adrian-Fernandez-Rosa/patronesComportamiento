package Iterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Usuarios implements UsuarioIterator{
    //private ArrayList<Usuario> usuarios = new ArrayList();
    //tambien funciona con otro tipo de colecciones
    private LinkedList<Usuario> usuarios = new LinkedList();

    private int posicion = 0; //pos por defecto

    public void crear(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = this.usuarios.get(posicion);
        posicion++;
        return usuario;
    }


    @Override
    public boolean hayMas() {


        return posicion < usuarios.size(); //si devuelve true hay mas usuarios
    }

    @Override
    public void reinicia() {
        posicion=0;
    }


}
