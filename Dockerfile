FROM dmreiland/alpine-oraclejre10

EXPOSE 6555

ADD target/demo-0.0.1-SNAPSHOT.jar	/usr/local/simple_java_10/
RUN mkdir /var/simple_java_10
WORKDIR /usr/local/simple_java_10

CMD java -jar demo-0.0.1-SNAPSHOT.jar --spring.config.additional-location=file:/var/simple_java_10/conf/application.properties
VOLUME /var/bonus_system

