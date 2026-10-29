Resolución del ejercicio N°20 de la unidad 4 de programación 2.
El programa simula un sistema de control de acceso basado en roles (RBAC) y gestión de seguridad aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de polimorfismo y herencia/interfaces para verificar de manera unificada si diferentes perfiles de usuario (administradores, editores e invitados) tienen los permisos necesarios para navegar o acceder a distintos módulos del sistema, evaluando cada solicitud a través de un gestor de seguridad centralizado.

Clases y Componentes Utilizados
RolUsuario (Interfaz o Clase Abstracta)

Propósito: Actúa como el contrato base para todos los perfiles de usuario del sistema. Declara el método abstracto boolean verificarPermisoAcceso(String moduloSistema), obligando a las clases concretas a implementar su propia matriz o lógica de permisos.

RolAdministrador (Clase Concreta)

Propósito: Modela el rol de administrador. Implementa el contrato otorgando acceso total e irrestricto a todos los módulos y configuraciones del sistema.

RolEditor (Clase Concreta)

Propósito: Modela el rol de editor. Sobrescribe la verificación de permisos permitiendo el acceso únicamente a los módulos de gestión de contenido, reportes y edición, denegando zonas exclusivas de administración.

RolInvitado (Clase Concreta)

Propósito: Modela el rol de invitado o usuario de consulta. Aplica una matriz de permisos restrictiva, permitiendo únicamente el acceso a vistas públicas o de lectura general.

GestorSeguridad (Clase Coordinadora)

Propósito: Funciona como el componente central de control de acceso. Recibe el rol del usuario de forma polimórfica junto con el módulo solicitado, evaluando y decidiendo si se aprueba o deniega la navegación sin necesidad de conocer la clase específica del rol evaluado.
<img width="577" height="565" alt="Captura de pantalla 2026-10-29 154440" src="https://github.com/user-attachments/assets/f26ac1c6-ae8b-417f-9a86-99761734f25e" />
<img width="561" height="447" alt="Captura de pantalla 2026-10-29 154448" src="https://github.com/user-attachments/assets/46e0e271-db4d-495d-916d-6da2219c395f" />
<img width="548" height="445" alt="Captura de pantalla 2026-10-29 154453" src="https://github.com/user-attachments/assets/7bfccc0a-7bac-4d62-aa02-b01ee5950aa2" />

