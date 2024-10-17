FROM openjdk:21-jdk-slim
LABEL authors="gisee"
COPY ./target/ejercicio2-0.0.1-SNAPSHOT.jar ejercicio2-0.0.1-SNAPSHOT.jar
EXPOSE 8085

ENTRYPOINT ["java", "-jar","/ejercicio2-0.0.1-SNAPSHOT.jar"]