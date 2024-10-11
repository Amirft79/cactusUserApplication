FROM openjdk:21-jdk-slim
ADD target/cactusUserApplication-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8585
ENTRYPOINT ["java","-jar","app.jar"]