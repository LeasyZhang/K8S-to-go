FROM openjdk:8 as runtime
# config lang
ENV LANG en_US.UTF-8

EXPOSE 8080

WORKDIR /demo-api

COPY ./ /demo-api/build-dir

RUN cd build-dir \
      && ./gradlew -version

RUN cd build-dir \
      && ./gradlew build --build-cache -x test \
      && mv ./build/libs/demo-api-*.jar ../ \
      && mv ./start.sh ../ \
      && cd .. \
      && rm -rf ./build-dir

RUN mkdir -p /var/log/demo-api

RUN groupadd -g 100001 demogroup && \
    useradd -r -m -g demogroup -u 100001 demouser

RUN chown -R demouser:demogroup /demo-api
RUN chown -R demouser:demogroup /var/log/demo-api

USER demouser

RUN chmod +x *.sh