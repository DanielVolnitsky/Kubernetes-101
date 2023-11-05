FROM gradle:7.6.2-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle assemble
RUN ls build/libs

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/greeting-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "greeting-0.0.1-SNAPSHOT.jar"]