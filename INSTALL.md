# INSTALL — MDTrack (Windows)

Guía rápida para colaboradores: instalar dependencias, verificar entorno, importar la base de datos y ejecutar la aplicación desde `cmd` o PowerShell.

## 1) Requisitos y descargas

- Java JDK 17 o superior
  - Descargar desde Eclipse Adoptium: https://adoptium.net/ o proveedor de preferencia.
  - Instalar y establecer la variable `JAVA_HOME` apuntando al folder del JDK.

- Maven (obligatorio; el wrapper fue eliminado del repo)
  - Descargar Apache Maven (3.8/3.9 recomendado).
  - Añadir la carpeta `bin` de Maven al `PATH` y opcionalmente `MAVEN_HOME`.

- NetBeans (opcional para desarrollo)
  - Instalar la versión que soporte Java 17.

- XAMPP (o MySQL separado)
  - Instalar XAMPP y arrancar MySQL desde el panel.

---

## 2) Verificaciones básicas (PowerShell / cmd)

- Verificar Java:

```powershell
java -version
# Debe mostrar Java 17.x o superior
```

- Verificar Maven:

```powershell
mvn -v
# Debe mostrar Apache Maven y la ruta de JAVA_HOME usada
```

- Verificar MySQL puerto 3306:

```powershell
netstat -ano | findstr 3306
```

---

## 3) Importar la base de datos

### Opción gráfica (phpMyAdmin)

1. Abrir `http://localhost/phpmyadmin`.
2. Crear la base `medtrack` si no existe.
3. Pestaña **Importar** → seleccionar `BaseDeDatos/medtrack (7).sql` → **Continuar**.

### Opción CLI (MySQL)

```powershell
mysql -u root -p
CREATE DATABASE IF NOT EXISTS medtrack CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
exit
mysql -u root -p medtrack < "C:\ruta\a\MDTrack\BaseDeDatos\medtrack (7).sql"
```

---

## 4) Crear usuario y asignar permisos (recomendado)

Ejecutar en phpMyAdmin → SQL o en la consola MySQL:

```sql
CREATE USER 'medtrack_user'@'localhost' IDENTIFIED BY 'medtrack123';
GRANT ALL PRIVILEGES ON medtrack.* TO 'medtrack_user'@'localhost';
FLUSH PRIVILEGES;
```

Prueba rápida:

```powershell
mysql -u medtrack_user -p -e "SHOW TABLES IN medtrack;"
```

> Sustituye la contraseña por una más segura en entornos reales.

---

## 5) Configurar la aplicación (local)

- Copia la plantilla de configuración y edítala con las credenciales locales:

```powershell
copy src\main\resources\config.properties.example src\main\resources\config.properties
```

- Ajusta `src\main\resources\config.properties` con:

```properties
database.url=jdbc:mysql://127.0.0.1:3306/medtrack?useSSL=false&serverTimezone=UTC
database.user=medtrack_user
database.password=medtrack123
```

> No subas credenciales al repositorio; mantén `config.properties` localmente.

---

## 6) Construir y copiar dependencias (Maven)

Desde la raíz del proyecto:

```powershell
cd "C:\Users\LENOVO\Desktop\New folder (2)\MDTrack"
mvn clean package
mvn dependency:copy-dependencies -DoutputDirectory=target\dependency
```

Verifica que `mysql-connector-j-*.jar` aparece en `target\dependency`.

---

## 7) Ejecutar la aplicación desde `cmd` / PowerShell

Ejemplo (ajusta la clase principal si es otra):

```powershell
java -cp "target\classes;target\dependency/*" com.mycompany.mdtrack.Login
```

Notas:
- En Windows el separador de classpath es `;`.
- Asegúrate de usar la clase principal correcta si el proyecto arranca con otra clase.

---

## 8) Comprobaciones y solución de problemas

- `JAVA_HOME not found` → establece `JAVA_HOME` al JDK 17.
- `mvn` no reconocido → añade Maven `bin` al `PATH`.
- `Access denied for user` → revisa usuario/contraseña y permisos en MySQL.
- `No suitable driver found` → confirma que `mysql-connector` está en `target\\dependency` y que usas `-cp` correctamente.
- `mvnw.cmd` falla con `"}" was unexpected at this time.` → esto aparece si el proyecto está en una ruta con paréntesis/espacios; solución: mover el proyecto a una ruta sin paréntesis (ej. `C:\projects\MDTrack`) o usar Maven global.

---

## 9) Checklist (rápido)

- [ ] Java 17 instalado y `java -version` OK
- [ ] Maven instalado y `mvn -v` OK
- [ ] MySQL (XAMPP) corriendo
- [ ] Base `medtrack` importada
- [ ] Usuario DB creado y con permisos
- [ ] `config.properties` configurado localmente
- [ ] `mvn clean package` → BUILD SUCCESS
- [ ] `mvn dependency:copy-dependencies` → `mysql-connector` en `target\dependency`
- [ ] `java -cp ...` → UI abre sin excepción

---

Si quieres, lo commitéo ahora en `ramaEH`. Si prefieres revisarlo primero, dime y no hago el commit.