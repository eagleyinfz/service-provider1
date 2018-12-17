FROM ${env.DOCKER_REGISTRY_ADDR}/openjdk:8u181-jdk
VOLUME /tmp
COPY ../target/lib/*.jar /app/lib/
CMD ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/lib/service-provider1-1.0-SNAPSHOT.jar"]
