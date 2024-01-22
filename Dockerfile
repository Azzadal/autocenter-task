#FROM nginx:latest as builder
#WORKDIR /opt/app
#COPY .mvn .mvn
#COPY bom bom
#COPY modules modules
#COPY mvnw mvnw
#COPY pom.xml pom.xml
#RUN chmod 777 ./mvnw
#RUN ./mvnw package
#
#RUN apk update
#RUN apk add nodejs nginx npm
#
#WORKDIR /front
#COPY autocenter-task-ui/package*.json ./
#RUN npm ci
#COPY autocenter-task-ui/* .
#RUN npm run build
#EXPOSE 8443
#ENTRYPOINT ["java","-jar","/opt/app/modules/main-app/target/main-app-1.0.0.jar"]

#FROM openjdk:11-slim
#ARG JAR_FILE=/opt/app/modules/main-app/target/*.jar
#COPY --from=builder ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]



#FROM node:lts-alpine as front
#WORKDIR /app
#COPY package*.json ./
#RUN npm ci
#COPY ./autocenter-task-ui .
#RUN npm run build

FROM adoptopenjdk/openjdk11 as back
WORKDIR /opt/app
COPY .mvn .mvn
COPY bom bom
COPY modules modules
COPY mvnw mvnw
COPY pom.xml pom.xml
RUN chmod 777 ./mvnw
RUN ./mvnw package

EXPOSE 8443


ENTRYPOINT ["java","-jar","/opt/app/modules/main-app/target/main-app-1.0.0.jar"]

