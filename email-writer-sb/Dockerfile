# Use a slim OpenJDK 24 image as the base
FROM openjdk:24-jdk-slim

# The application will be running from this directory
WORKDIR /app

# Copy the Maven wrapper files to make the build reproducible
COPY mvnw .
COPY .mvn .mvn

# Make the Maven wrapper executable
RUN chmod +x ./mvnw

# Copy the pom.xml file to build dependencies
COPY pom.xml .

# Download all the dependencies first to speed up subsequent builds
RUN ./mvnw dependency:go-offline

# Copy the rest of the source code
COPY src src

# Package the application into a JAR file
RUN ./mvnw package -DskipTests

# Command to run the application
CMD ["java", "-jar", "target/email-writer-sb-0.0.1-SNAPSHOT.jar"]