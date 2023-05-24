FROM maven:3.6.0-jdk-11-slim AS build
RUN mvn -f /pom.xml clean package

FROM openjdk:11
COPY target/*.jar kcmainmicro-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","kcmainmicro-0.0.1-SNAPSHOT.jar"] CMD ["-start"]