
FROM eclipse-temurin:17

WORKDIR /app

COPY target/myname.jar /app/kafka.jar

ENTRYPOINT ["java", "-jar", "kafka.jar"]