FROM openjdk:21

COPY target/tutorials-0.0.1-SNAPSHOT.jar /tutorialsapp2.jar

CMD ["java", "-jar", "/tutorialsapp2.jar"]
