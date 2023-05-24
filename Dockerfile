FROM openjdk:11
#ARG JAR_FILE=*.jar
COPY kcmainmicro-0.0.1-SNAPSHOT.jar kcmainmicro-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","kcmainmicro-0.0.1-SNAPSHOT.jar"] CMD ["-start"]