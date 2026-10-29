public class RolEditor extends RolUsuario{
    public RolEditor() {
        super("Editor");
    }

    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equalsIgnoreCase("Articulos") ||
                moduloSistema.equalsIgnoreCase("Multimedia") ||
                moduloSistema.equalsIgnoreCase("Comentarios");
    }
}
