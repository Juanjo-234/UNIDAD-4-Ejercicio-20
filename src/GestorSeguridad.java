import java.util.List;

public class GestorSeguridad {
    public void validarAcceso(RolUsuario rol, String modulo) {
        boolean autorizado = rol.verificarPermisoAcceso(modulo);

        System.out.println("--------------------------------------------------");
        System.out.println("Rol Evaluado: " + rol.getNombreRol());
        System.out.println("Módulo Solicitado: " + modulo);
        if (autorizado) {
            System.out.println("ACCESO AUTORIZADO: Bienvenido a la sección.");
        } else {
            System.out.println("ACCESO DENEGADO: Permisos insuficientes.");
        }
        System.out.println("------------------ O -----------------------------");
    }
    public void simularIntentosAcceso(List<RolUsuario> roles, List<String> modulos) {
        System.out.println("==================================================");
        System.out.println("      SIMULADOR DE ACCESOS Y PERMISOS RBAC        ");
        System.out.println("==================================================\n");

        for (RolUsuario rol : roles) {
            System.out.println(">>> Evaluando credenciales para: " + rol.getNombreRol() + " <<<");
            for (String modulo : modulos) {
                validarAcceso(rol, modulo);
            }
            System.out.println();
        }
    }
}
