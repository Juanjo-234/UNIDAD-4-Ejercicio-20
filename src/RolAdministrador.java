public class RolAdministrador extends RolUsuario{
    public RolAdministrador() {
        super("Administrador");
    }

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return true;
    }
}
