FROM maven:3.8.5-openjdk-17 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package -DskipTests=true

FROM openjdk:17

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/challenge-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "challenge-0.0.1-SNAPSHOT.jar", "-Dspring.profiles.active=docker"]