FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ProductService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/ProductService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081