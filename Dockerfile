FROM openjdk:11-slim as builder
EXPOSE 10100
WORKDIR /opt/app
COPY .mvn .mvn
COPY bom bom
COPY modules modules
COPY mvnw mvnw
COPY pom.xml pom.xml
RUN chmod 777 ./mvnw
RUN ./mvnw package

ENTRYPOINT ["java","-jar","/opt/app/modules/main-app/target/main-app-1.0.0.jar"]

#FROM openjdk:11-slim
#ARG JAR_FILE=/opt/app/modules/main-app/target/*.jar
#COPY --from=builder ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
