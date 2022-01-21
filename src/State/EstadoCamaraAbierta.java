package State;

public class EstadoCamaraAbierta extends Estado{



    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "debloquear(): YA ESTABA DESBLOQUEADO EL MOVIL!!!!!";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): LA CAMARA YA LA HABÍAS ABIERTO !!!";
    }

    @Override
    public String HacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "La foto se va ha disparar ya";
    }
}
