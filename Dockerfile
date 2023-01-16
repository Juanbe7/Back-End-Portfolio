FROM amazoncorretto:11-alpine-jdk //de que imagen de java partimos
MAINTAINER Juanbe //quien es el dueño de esta imagen
COPY target/juan.bustos-0.0.1-SNAPSHOT.jar portfolio-jb-app.jar //Copia el empaquetado y lo sube a git
ENTRYPOINT ["java","-jar","/portfolio-jb-app.jar"]  //una vez se crea el empaquetado, se ejecuta primero
