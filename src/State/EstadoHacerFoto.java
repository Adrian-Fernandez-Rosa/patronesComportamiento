package State;

public class EstadoHacerFoto extends Estado{



    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La cámara ya la habías abierto.";
    }

    @Override
    public String HacerFoto() {
       telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto se ha realizado";
    }
}
