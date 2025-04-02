# Use the official OpenJDK image with JDK
FROM openjdk:11-slim

# Set the working directory
WORKDIR /app

# Set the environment variable for headless operation
ENV JAVA_OPTS="-Djava.awt.headless=true"

# Copy the Java files into the container
COPY . .

# Compile the Java application
RUN javac Calculator.java

# Command to run the application with input handling
CMD ["java", "-Djava.awt.headless=true", "Calculator"]
