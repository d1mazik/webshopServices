FROM eclipse-temurin:17
VOLUME /tmp
ARG JAR_FILE=build/libs/ItemService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]