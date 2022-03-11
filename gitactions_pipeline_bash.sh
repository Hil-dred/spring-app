#!/bin/bash


git pull origin master
mvn package
#docker kill hildredadebayo/spring-demo:latest
#docker rmi hildredadebayo/spring-demo:latest -f
docker build -t hildredadebayo/spring-demo:latest .
#docker login
#docker push hildredadebayo/spring-demo:latest
docker run -d --rm -p 7030:8080 hildredadebayo/spring-demo:latest 
sudo systemctl restart nginx

