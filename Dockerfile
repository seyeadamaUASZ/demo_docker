FROM openjdk:11
ADD target/demo_docker-0.0.1-SNAPSHOT.jar demo_docker-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo_docker-0.0.1-SNAPSHOT.jar"]