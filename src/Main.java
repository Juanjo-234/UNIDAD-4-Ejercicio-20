//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<RolUsuario> rolesSistema = new ArrayList<>();
    rolesSistema.add(new RolAdministrador());
    rolesSistema.add(new RolEditor());
    rolesSistema.add(new RolInvitado());

    List<String> modulosSistema = new ArrayList<>();
    modulosSistema.add("Articulos");
    modulosSistema.add("ConfiguracionSistema");
    modulosSistema.add("PublicacionesPublicas");

    GestorSeguridad gestor = new GestorSeguridad();

    gestor.simularIntentosAcceso(rolesSistema, modulosSistema);
}
