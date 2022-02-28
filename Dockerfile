FROM openjdk:15-jdk-alpine
MAINTAINER io.noman
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1.jar"]