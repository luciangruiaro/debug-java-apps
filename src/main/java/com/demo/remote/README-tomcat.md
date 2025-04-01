# Debug Spring Boot App Deployed to Tomcat on Windows

## 🧰 Requirements

- Apache Tomcat installed (e.g., `C:\tomcat`)
- IntelliJ IDEA Ultimate

## 📦 Package the WAR

1. Modify `pom.xml` to use:
   ```xml
   <packaging>war</packaging>
   ```

2. Add Tomcat dependencies:
   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-tomcat</artifactId>
       <scope>provided</scope>
   </dependency>
   ```

3. Build the WAR:
   ```bash
   ./mvnw clean package
   ```

## 🚀 Deploy to Tomcat

1. Copy `target/springboot-docker-debug.war` into `C:\tomcat\webapps\`.

2. Start Tomcat with debug options:
   ```cmd
   set JPDA_ADDRESS=5005
   set JPDA_TRANSPORT=dt_socket
   catalina.bat jpda start
   ```

## 🧠 Debug from IntelliJ

1. Run > Edit Configurations > `+` > Remote JVM Debug
2. Port: `5005`, Host: `localhost`
3. Attach debugger.

> Breakpoints in your Spring code will trigger!
