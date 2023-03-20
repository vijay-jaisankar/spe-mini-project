FROM openjdk
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
