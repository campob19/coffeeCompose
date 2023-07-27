FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/firstContainer-0.0.1-SNAPSHOT.jar coffee.jar
ENTRYPOINT ["java","-jar","/coffee.jar"]