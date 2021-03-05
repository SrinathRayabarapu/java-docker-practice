FROM adoptopenjdk/openjdk13:jdk-13.0.2_8-centos-slim

ADD build/libs/DockerTest-0.1.0.jar DockerTest.jar

CMD java -XX:+UseSerialGC -jar DockerTest.jar
