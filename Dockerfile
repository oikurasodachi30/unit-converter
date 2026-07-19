# ==========================================
# Stage 1: Build the application using Maven
# ==========================================
FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /build

# Copy your pom.xml and source code into the container
COPY pom.xml .
COPY src ./src
COPY config.yml .

# Package the fat JAR
RUN mvn clean package

# ==========================================
# Stage 2: Run the application
# ==========================================
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copy ONLY the built JAR and config file from the builder stage
COPY --from=builder /build/target/unit-converter-1.0-SNAPSHOT.jar ./app.jar
COPY --from=builder /build/config.yml ./config.yml

# Tell Render we are using port 8080
EXPOSE 8080

# The command to start the server (with the 256MB memory limit for the free tier)
CMD ["java", "-Xmx256m", "-jar", "app.jar", "server", "config.yml"]
