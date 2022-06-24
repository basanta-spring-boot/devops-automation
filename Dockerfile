FROM openjdk:8
EXPOSE 8080
ADD target/devops-auto.jar devops-auto.jar
ENTRYPOINT ["java","-jar","/devops-auto.jar"]