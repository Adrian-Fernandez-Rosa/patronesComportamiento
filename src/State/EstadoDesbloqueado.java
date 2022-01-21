package State;

public class EstadoDesbloqueado extends Estado{



    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): El movil ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "abrirCamara(): Camara abierta, puedes hacer la foto.";
    }

    @Override
    public String HacerFoto() {
        return "hacerfoto(): No se puede hacer una foto sin abrir la cámara";
    }
}
