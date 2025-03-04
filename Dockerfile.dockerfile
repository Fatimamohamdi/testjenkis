# Utiliser une image Java officielle
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré
COPY target/*.jar app.jar

# Exposer le port utilisé par Spring Boot
EXPOSE 8080

# Commande pour exécuter l'application
CMD ["java", "-jar", "app.jar"]
