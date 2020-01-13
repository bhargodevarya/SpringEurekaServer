FROM openjdk:8u171-jdk-alpine3.8

WORKDIR "/application/userservice/jar"

# In this format the jar must already exist.
# Run bootJar task to create the jar
ADD ./build/libs/*.jar .

CMD ["java", "-jar","UserService-1.0-SNAPSHOT.jar"]