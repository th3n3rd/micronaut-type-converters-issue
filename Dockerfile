FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/micronaut-type-converters*.jar micronaut-type-converters.jar
CMD java ${JAVA_OPTS} -jar micronaut-type-converters.jar