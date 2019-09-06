FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER yangwulin911@163.com

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 8088

ADD /demo-0.0.1-SNAPSHOT.jar //

ENTRYPOINT java -jar /demo-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

#CMD ["--spring.profiles.active=test"]
