FROM openjdk:8

WORKDIR /application/eurekaserver/jar

#for the gradle plugin uncomment the following ADD
#ADD *.jar .

#for docker cli use the following ADD
ADD build/libs/EurekaServer-1.0-SNAPSHOT.jar .

EXPOSE 8761

CMD ["java", "-jar", "EurekaServer-1.0-SNAPSHOT.jar"]