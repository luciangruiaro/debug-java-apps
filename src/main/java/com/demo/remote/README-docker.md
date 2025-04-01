# Debug Spring Boot App in Docker with IntelliJ

## 🔧 Requirements

- Docker Desktop (on Windows)
- IntelliJ IDEA Ultimate

## 🐳 Build & Run in Docker

1. Build the JAR:
   ```bash
   ./mvnw clean package
   ```

2. Build and run the Docker container:

   ```bash
   docker-compose up --build
   ```

3. Confirm the app runs: http://localhost:8080/hello?name=Docker

## 🧠 Debug from IntelliJ

1. Open IntelliJ > Run > Edit Configurations > + > Remote JVM Debug.
2. Name: Remote Docker Debug
3. Port: 5005
4. Click Debug.

> You can now set breakpoints and inspect the running container from IntelliJ!
