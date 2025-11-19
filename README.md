# 🏥 MDTrack - Sistema de Gestión Médica

## 📋 Descripción
*MDTrack* es un sistema de gestión médica completo para la clínica *GeneralMed* desarrollado en Java con interfaz Swing. Digitaliza expedientes médicos, citas, historiales clínicos y administración de pacientes/empleados.

## 🚀 Características Principales

### 🔐 Módulos del Sistema
- *👥 Gestión de Empleados* - CRUD completo de personal médico y administrativo
- *🏥 Gestión de Pacientes* - Registro y seguimiento de pacientes
- *📅 Gestión de Citas* - Programación, modificación y seguimiento de citas
- *🩺 Consultas Médicas* - Historial clínico completo y diagnósticos
- *📊 Reportes y Estadísticas* - Dashboard con métricas del sistema
- *💊 Inventario* - Control de medicamentos y suministros

### 👨‍💼 Sistema de Roles
- *ADMIN* - Acceso completo al sistema
- *MÉDICO* - Gestión de consultas y pacientes
- *ENFERMERO* - Funciones limitadas de consulta

## 🛠 Tecnologías Utilizadas

- *Java 17* - Lenguaje de programación
- *Swing* - Interfaz gráfica personalizada
- *MySQL 8.0+* - Base de datos
- *Maven* - Gestión de dependencias
- *JDBC* - Conexión a base de datos

## 📥 Instalación Rápida

### 🔧 Requisitos Previos
- *Java 17* o superior ([Descargar](https://adoptium.net/))
- *XAMPP* con MySQL ([Descargar](https://www.apachefriends.org/))
- *NetBeans IDE* ([Descargar](https://netbeans.apache.org/))
- *Git* ([Descargar](https://git-scm.com/))

### 📋 Paso a Paso

#### 1. 🐘 Configurar Base de Datos
bash
# Iniciar XAMPP y MySQL
# Abrir phpMyAdmin: http://localhost/phpmyadmin

# Importar base de datos:
# 1. Ir a pestaña "Importar"
# 2. Seleccionar: BaseDeDatos/medtrack (7).sql
# 3. Click "Continuar"


#### 2. 📥 Clonar el Proyecto
bash
git clone https://github.com/Linda1997382/MDTrack.git
cd MDTrack


#### 3. ⚙ Configurar Conexión
bash
# Copiar archivo de configuración
cp src/main/resources/config.properties.example src/main/resources/config.properties

# Editar config.properties con tus credenciales:
# database.user=root
# database.password=   # (vacío por defecto en XAMPP)


#### 4. 💻 Configurar en NetBeans

1. File > Open Project > Seleccionar carpeta MDTrack
2. Click derecho > Maven > Update Project
3. Click derecho > Clean and Build
4. Click derecho > Run


## 👥 Usuarios de Prueba

| Rol | Usuario | Contraseña | Acceso |
|-----|---------|------------|---------|
| 👨‍💼 Administrador | admin | admin123 | Acceso completo |
| 👩‍⚕ Médico General | arodriguez | medico123 | Gestión de consultas |
| 🧑‍⚕ Enfermero | pmartinez | enfermero123 | Funciones limitadas |
| 👩‍⚕ Médico Especialista | lgutierrez | medico123 | Especialidades |
| 👨‍⚕ Cardiólogo | rfernandez | medico123 | Consultas cardíacas |

## 🏗 Estructura del Proyecto


MDTrack/
├── 📁 BaseDeDatos/
│   └── 📄 medtrack (7).sql          # Base de datos COMPLETA con datos reales
├── 📁 src/main/java/com/mycompany/mdtrack/
│   ├── 📄 Login.java                # Autenticación y roles
│   ├── 📄 Conexion.java             # Manejo de conexión MySQL
│   ├── 📁 Form/                     # Formularios de la aplicación
│   │   ├── 📄 Form_Home.java        # Dashboard principal
│   │   ├── 📄 Form_Empleados.java   # Gestión de empleados
│   │   ├── 📄 Form_Pacientes.java   # Gestión de pacientes
│   │   ├── 📄 Form_Citas.java       # Gestión de citas
│   │   ├── 📄 Form_Consultas.java   # Consultas médicas
│   │   └── 📄 Form_Reportes.java    # Reportes y estadísticas
│   └── 📁 Modelo/                   # Lógica de negocio
│       ├── 📄 Model_Empleado.java   # Operaciones empleados
│       ├── 📄 Model_Paciente.java   # Operaciones pacientes
│       ├── 📄 Model_Citas.java      # Lógica de citas
│       └── 📄 Model_Reportes.java   # Consultas de reportes
├── 📁 src/main/resources/
│   ├── 📄 config.properties.example # Plantilla de configuración
│   └── 📁 imagenes/                 # Recursos gráficos
└── 📄 pom.xml                       # Dependencias Maven


## 🗃 Base de Datos Incluida

### 📊 Datos de Prueba Disponibles
- *11 empleados* con diferentes roles y especialidades
- *11 pacientes* con historiales médicos completos
- *24 citas* programadas con diferentes estados
- *24 consultas* médicas realizadas
- *5 empresas* asociadas
- *Inventario* de medicamentos
- *Recetas* médicas y antecedentes

### 🗂 Tablas Principales
- empleado - Personal de la clínica
- paciente - Información de pacientes
- cita - Gestión de citas médicas
- consulta - Historial médico y diagnósticos
- historial_medico - Antecedentes y signos vitales
- empresa - Empresas asociadas
- inventario - Control de medicamentos

## 🎯 Flujos Principales para Probar

### 1. 🔐 Autenticación y Roles
- Login con diferentes usuarios y ver permisos
- Navegación según rol (Admin, Médico, Enfermero)

### 2. 👥 Gestión de Empleados
- Agregar nuevo empleado
- Editar información existente
- Cambiar estado (Activo/Inactivo)

### 3. 📅 Gestión de Citas
- Programar nueva cita
- Cambiar estado (Programada, Completada, Cancelada)
- Ver historial de citas

### 4. 🩺 Consultas Médicas
- Registrar nueva consulta
- Agregar diagnóstico y tratamiento
- Ver historial médico completo

## 🔧 Solución de Problemas Comunes

### ❌ Error: "No se puede conectar a MySQL"
properties
# Verificar en config.properties:
database.user=root
database.password=   # Vacío por defecto en XAMPP


### ❌ Error: "Driver no encontrado"

Click derecho en proyecto > Maven > Update Project
> Force Update of Snapshots/Releases > OK


### ❌ Error: Dependencias Maven
bash
# En NetBeans:
# Maven > Update Project > Force Update > OK


### ❌ Error: Versión de Java

Project Properties > Libraries > Java Platform: JDK 17


## 🚀 Comandos Git para Desarrollo

### 📥 Actualizar Proyecto
bash
git pull origin main


### 📤 Subir Cambios
bash
git add .
git commit -m "feat: descripción del cambio"
git push origin main


### 🔍 Ver Estado
bash
git status
git log --oneline


## 📝 Convenciones de Desarrollo

### 🔤 Nomenclatura
- *Clases*: PascalCase (Ej: FormEmpleados)
- *Métodos*: camelCase (Ej: cargarTablaEmpleados)
- *Variables*: camelCase (Ej: listaPacientes)
- *Constantes*: UPPER_CASE (Ej: DATABASE_URL)

### 🏗 Patrones Implementados
- *MVC* - Separación Modelo-Vista-Controlador
- *DAO* - Acceso a datos en clases Modelo
- *Singleton* - Conexión a base de datos

## 🐛 Debug y Logging

### 🔍 Agregar Mensajes de Debug
java
System.out.println("=== DEBUG [NombreMétodo] ===");
System.out.println("Parámetros: " + parametros);


### 📋 Verificar Flujo de Login
1. Login exitoso → Obtener ID empleado
2. Cargar datos empleado → Verificar puesto
3. Mostrar Home → Aplicar permisos por puesto

## 🤝 Contribución al Proyecto

### 📋 Proceso de Desarrollo
1. *Actualizar* siempre con git pull antes de empezar
2. *Crear ramas* para nuevas funcionalidades
3. *Probar* completamente antes de hacer commit
4. *Documentar* cambios en los commits

### 🎯 Áreas de Mejora Identificadas
- [ ] Optimización de consultas a base de datos
- [ ] Validación más robusta de formularios
- [ ] Mejora en manejo de errores
- [ ] Documentación de API interna

## 📞 Soporte y Contacto

### 🔧 Para Problemas Técnicos
- Verificar que MySQL esté corriendo en XAMPP
- Revisar archivo config.properties
- Ejecutar mvn clean compile para recompilar

### 📋 Checklist de Instalación
- [ ] Java 17 instalado y configurado
- [ ] XAMPP con MySQL funcionando
- [ ] Base de datos importada correctamente
- [ ] Proyecto abre en NetBeans sin errores
- [ ] Login funciona con usuarios de prueba

## ⚠ Notas Importantes

- *NO subir* config.properties a Git (contiene credenciales)
- Usar siempre **config.properties.example** como plantilla
- La base de datos incluye *datos realistas* para testing
- El proyecto usa *Maven* para dependencias automáticas

---