public class RolInvitado extends RolUsuario{
    public RolInvitado() {
        super("Invitado");
    }

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equalsIgnoreCase("PublicacionesPublicas");
    }
}
