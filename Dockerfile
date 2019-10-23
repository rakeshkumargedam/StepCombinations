FROM openjdk:8
ENV APP_HOME=/janu/ndccjanu/StepCombinations/
EXPOSE 9000
RUN mkdir app
ADD build/libs/*.jar /app/step.jar
ENTRYPOINT ["java", "-jar", "/app/step.jar"]
