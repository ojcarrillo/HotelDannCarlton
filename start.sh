#!/bin/bash
echo "======================================================="
echo "inicia instalacion contenedor!"
echo "======================================================="
echo "compila aplicacion"
mvn clean package -Dmaven.test.skip=true
echo "======================================================="
echo "======================================================="
echo "compila imagen docker - terceros_hoteldann"
docker build -t terceros_hoteldann .
echo "======================================================="
echo "======================================================="
echo "corre imagen del contenedor"
docker run \
 --name terceros_hoteldann \
 -p 9092:8080 \
 -v /volume/docker/hoteldann/tmp:/tmp  \
 -v /volume/docker/hoteldann/log:/var/netgloo_blog/logs/application.log  \
 terceros_hoteldann
echo "======================================================="
echo "======================================================="
echo "fin"
exit
