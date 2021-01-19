FROM openjdk:latest

COPY src/ /usr/local

WORKDIR /usr/local

RUN javac Main.java

CMD ["java", "Main"]
