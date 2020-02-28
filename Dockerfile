FROM openjdk:8-jdk-alpine
ADD target/customer-consumer*.jar customer-consumer.jar
ENTRYPOINT ["java", "-jar", "customer-consumer.jar"]
