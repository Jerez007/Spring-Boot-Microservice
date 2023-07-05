# Spring Boot Microservices
Original repo and tutorial by: https://github.com/s4kibs4mi/

This repository contains the latest source code of the spring-boot-microservices tutorial

You can watch the tutorial on Youtube here - https://www.youtube.com/watch?v=mPPhcU7oWDU

## How to run the application using Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the docker image locally.
2. Run `docker-compose up -d` to start the applications.

## How to run the application without Docker

1. Run `mvn clean verify -DskipTests` by going inside each folder to build the applications.
2. After that run `mvn spring-boot:run` by going inside each folder to start the applications.


![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

![img_3.png](img_3.png)

![img_4.png](img_4.png)

![img_5.png](img_5.png)

![img_6.png](img_6.png)

We introduce an API Gateway below.
![img_7.png](img_7.png)

Benefits of API Gateway shown below.
![img_8.png](img_8.png)

Secure Services by adding an Auth Server (KeyCloak)
![img_9.png](img_9.png)

Introduces Circuit Breaker for resilient communication between services. 
Open state = Won't allow calls for a certain duration
Half Open = Goes to this state after being in Open State for a certain duration
![img_10.png](img_10.png)
![img_11.png](img_11.png)

Introduces a way to track down issues related to performances using distributed tracing (tracks request from start to finish).
Uses Spring Cloud Sleuth and Zipkin (UI to visualize this information)
![img_12.png](img_12.png)

Implement event driven architecture
![img_13.png](img_13.png)

Dockerize the components
![img_14.png](img_14.png)