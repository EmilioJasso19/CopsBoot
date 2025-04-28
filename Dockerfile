# Utilizar una imagen oficial de Java para construir la app
FROM eclipse-temurin:21-jdk AS build

# Crear directorio de trabajo
WORKDIR /app

# Copiar todos los archivos del proyecto
COPY . .

# Dar permisos de ejecución al wrapper de gradle
RUN chmod +x gradlew

# Construir el jar
RUN ./gradlew clean build -x test

# Segunda etapa: crear una imagen más liviana
FROM eclipse-temurin:21-jre

# Crear directorio de la app
WORKDIR /app

# Copiar el jar desde la imagen de build
COPY --from=build /app/build/libs/*.jar app.jar

# Exponer el puerto en el que la app corre
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
