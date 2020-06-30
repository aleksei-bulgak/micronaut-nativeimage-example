FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY target/demo /app/demo
ENTRYPOINT ["/app/demo"]
