FROM openjdk:11.0.16-jdk
MAINTAINER RockyRen

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

ADD forum/target/forum*.jar app.jar

COPY forum/src/main/resources/bootstrap.yml /opt/eighteener/forum/bootstrap.yml
COPY forum/src/main/resources/application.yml /opt/eighteener/forum/application.yml

EXPOSE 8101

VOLUME ["/logs", "/opt/eighteener/forum/logs"]

ENV CONFIGFILE="/opt/eighteener/forum/bootstrap.yml,/opt/eighteener/forum/application.yml"
ENV PROFILE="prod" LOGLEVEL="INFO" PARAMS=""

ENTRYPOINT ["sh", "-c", "java $PARAMS -Djava.security.egd=file:/dev/./urandom -jar app.jar --spring.config.location=$CONFIGFILE --spring.profiles.active=$PROFILE --logback.level.root=$LOGLEVEL"]