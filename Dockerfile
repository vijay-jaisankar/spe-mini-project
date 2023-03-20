FROM eclipse-temurin:11
ENV jarfile=calculator-1.0-SNAPSHOT-jar-with-dependencies.jar
COPY ./target/$jarfile ./release.jar
WORKDIR ./
CMD ["java", "-jar", "release.jar"]
