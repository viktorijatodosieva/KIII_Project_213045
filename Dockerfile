
FROM openjdk:19-jdk-alpine

WORKDIR /app

COPY target/eshop-0.0.1-SNAPSHOT.jar app/eshop-0.0.1-SNAPSHOT.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app/eshop-0.0.1-SNAPSHOT.jar"]






