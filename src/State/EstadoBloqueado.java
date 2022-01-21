package State;

public class EstadoBloqueado extends Estado{



    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {

        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));

        return "Desbloquear(): Móvil desbloqueado, procede.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara():La cámara esta bloqueada, Desbloquea el móvil antes.";
    }

    @Override
    public String HacerFoto() {
        return "HacerFoto(): La cámara está bloqueada. Desbloquea el móvil antes.";
    }
}
