FROM openjdk:17-oracle
WORKDIR /usr/src/app
COPY target/api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
CMD ["java", "-jar", "app.jar"]


