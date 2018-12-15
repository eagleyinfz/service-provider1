FROM @docker.image.prefix@/java:8
VOLUME /tmp
ADD target/service-provider1-1.0-SNAPSHOT.jar /app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
