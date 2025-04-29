# Use an official OpenJDK runtime as the base image

FROM openjdk:17-jdk-slim


# Set the working directory inside the container

WORKDIR /app


# Copy the Maven configuration file

COPY pom.xml .


# Copy the source code

COPY src ./src


# Build the application using Maven

RUN apt-get update && apt-get install -y maven && mvn clean package


# Expose the port your app runs on (if applicable, adjust if your app uses a different port)

EXPOSE 8080


# Run the JAR file

CMD ["java", "-jar", "target/todo-list-1.0-SNAPSHOT.jar"]
