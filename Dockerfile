# Build stage
FROM bellsoft/liberica-openjdk-alpine-musl:17 AS builder

WORKDIR /app

# Copying necessary files for dependency resolution
COPY build.gradle settings.gradle gradlew ./
COPY gradle/ gradle/
COPY src/ src/

# Making the gradlew script executable
RUN chmod +x ./gradlew

# Running the gradle build to resolve dependencies
RUN ./gradlew clean bootJar

# Final stage
FROM bellsoft/liberica-openjdk-alpine-musl:17

WORKDIR /app

# Copying the built JAR from the builder stage
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
