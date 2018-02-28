FROM java:8-jre

ADD ./build/libs/spring_boot_cd_poc-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 8080
