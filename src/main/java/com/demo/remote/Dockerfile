FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/springboot-docker-debug.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "/app.jar"]
