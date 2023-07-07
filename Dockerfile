# Use a base image with OpenJDK and JRE pre-installed
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Java executable JAR file into the container
COPY ApplicationForm.jar .

# Set the entry point for the container
CMD ["java", "-jar", "ApplicationForm.jar"]
