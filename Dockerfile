FROM docker:22.06.0-beta.0-cli-alpine3.16 as builder
EXPOSE 8443
RUN apk update && apk add nodejs npm docker-cli-compose openjdk11 python3
WORKDIR /opt/app
COPY .mvn .mvn
COPY bom bom
COPY modules modules
COPY mvnw mvnw
COPY pom.xml pom.xml
RUN chmod 777 ./mvnw
RUN ./mvnw package

COPY docker-compose.yml .
RUN dockerd
# RUN docker-compose -p "my" up -d --build --force-recreate

ENTRYPOINT ["java","-jar","/opt/app/modules/main-app/target/main-app-1.0.0.jar"]

#FROM openjdk:11-slim
#ARG JAR_FILE=/opt/app/modules/main-app/target/*.jar
#COPY --from=builder ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
