FROM openjdk:8

WORKDIR /application/gateway/jar

# In this format the jar must already exist.
# Run bootJar task to create the jar
COPY ./build/libs/*.jar .

CMD ["java", "-jar", "SpringZuulGateway-1.0-SNAPSHOT.jar"]