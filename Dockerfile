# Use latest OpenJDK 22 as base image
FROM eclipse-temurin:22-jdk as runtime

# Set working directory
WORKDIR /app

# Copy WAR file from target/
COPY target/*.war app.war

# Expose HTTP and debug ports
EXPOSE 8080
EXPOSE 5005

# Enable remote debugging (JDWP) and run Spring Boot WAR
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "/app/app.war"]
