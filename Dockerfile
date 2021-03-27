FROM hseeberger/scala-sbt:8u282_1.4.9_2.12.13

RUN apt-get update
RUN apt-get install -y nodejs npm

RUN mkdir /data
VOLUME /data

EXPOSE 3000 8000
