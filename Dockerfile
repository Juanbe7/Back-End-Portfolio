FROM amazoncorretto:11-alpine-jdk
MAINTAINER Juanbe
COPY target/juan.bustos-0.0.1-SNAPSHOT.jar portfolio-jb-app.jar
ENTRYPOINT ["java","-jar","/portfolio-jb-app.jar"]
