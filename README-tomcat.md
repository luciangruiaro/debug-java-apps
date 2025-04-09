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

1. Copy `target/demo.war` into `C:\tomcat\webapps\`.

2. Configure Tomcat to run in debug mode:
   - Create a file `C:\tomcat\bin\setenv.bat` with the following content:
     ```bat
     set JPDA_ADDRESS=5005
     set JPDA_TRANSPORT=dt_socket
     ```

3. Start Tomcat with JPDA:
   ```cmd
   catalina.bat jpda start
   ```

## 🧠 Debug from IntelliJ

1. Run > Edit Configurations > `+` > Remote JVM Debug
2. Set Host: `localhost`, Port: `5005`
3. Attach debugger.

> ✅ Breakpoints in your Spring code will trigger!

