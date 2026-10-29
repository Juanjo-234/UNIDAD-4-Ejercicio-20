public abstract class RolUsuario {
    protected String nombreRol;

    public RolUsuario(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public abstract boolean verificarPermisoAcceso(String moduloSistema);
}
