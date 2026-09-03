FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY src/main/java/Calculator.java .

RUN java Calculator.java

CMD ["java", "Calculator"]