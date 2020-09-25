FROM oracle/graalvm-ce:20.0.0-java8 as graalvm
# For JDK 11
#FROM oracle/graalvm-ce:20.0.0-java11 as graalvm
RUN gu install native-image

COPY . /home/app/brucestreet
WORKDIR /home/app/brucestreet

RUN native-image --no-server -cp build/libs/brucestreet-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/brucestreet/brucestreet /app/brucestreet
ENTRYPOINT ["/app/brucestreet"]
