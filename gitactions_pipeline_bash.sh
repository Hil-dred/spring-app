#!/bin/bash
## Gitactions Pipeline

git pull origin main
#mvn package
#docker kill hildredadebayo/spring-demo:latest
docker rmi hildredadebayo/spring-demo:latest -f
mvn package
docker build -t hildredadebayo/spring-demo:latest .
#docker login
#docker push hildredadebayo/spring-demo:latest
docker run -d --rm -p 7070:8080 hildredadebayo/spring-demo:latest 
sudo systemctl restart nginx

