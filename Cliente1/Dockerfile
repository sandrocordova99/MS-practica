# Este Dockerfile solo prepara el entorno base.
# El código fuente se montará desde tu máquina local usando un bind mount.
# Usa la misma versión de JDK que tienes en tu proyecto local
FROM maven:3-openjdk-17

WORKDIR /app

# Opcional: Si usas Maven y quieres precargar dependencias en la imagen base
# para que las compilaciones sean más rápidas dentro del contenedor
# COPY pom.xml .
# RUN mvn dependency:go-offline

# No copies tu código fuente aquí (ej. src/, target/, etc.).
# Eso se hará con el bind mount en docker-compose.

# Solo exponemos el puerto de tu aplicación (asegúrate de que Spring Boot escuche aquí)
# Es el puerto por defecto de Spring Boot. Si quieres 8081, configúralo en Spring.
EXPOSE 8081

# No ponemos un CMD aquí, ya que el comando de ejecución (ej. mvn spring-boot:run)
# se definirá en el docker-compose.yml, lo que nos da más flexibilidad.

# En resumen esta es una imagen basica para desarrollo , con las dependencias listas.
