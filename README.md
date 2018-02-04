# Spring Bootiful Microservices (Discovery-Service)

#### Navigation Guide: [`Previous Repo: Config-Repo`](https://github.com/Prempeh-Gyan/1.1-Config-Repo)   |   [`Next Repo: OAuth2-Service`](https://github.com/Prempeh-Gyan/1.3-OAuth2-Service)

### Travis
[![Build Status](https://travis-ci.org/Prempeh-Gyan/1.2-Discovery-Service.svg?branch=master)](https://travis-ci.org/Prempeh-Gyan/1.2-Discovery-Service)

### Heroku
To deploy this project to Heroku, update the [`configuration file`](https://github.com/Prempeh-Gyan/1.1-Config-Repo/blob/master/services/Discovery-Service/discovery-service.yml) to point to the Heroku locations of the dependent services before deploying this to Heroku.

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy?template=https://github.com/Prempeh-Gyan/1.2-Discovery-Service)

### Getting Started
*Required*
* [`Maven`](https://maven.apache.org/) 3.3+
* [`JDK`](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 8+
Get the project from the source repository
>`git clone https://github.com/Prempeh-Gyan/1.2-Discovery-Service.git`

### About This Service
The Discovery Service is the registry for all the services in the `Bootiful Microservices` series (in other words its the phone book in which all the services in the series are registered).

Each service registers itself with the service registry and tells the registry where it lives (host, port, node name) and perhaps other service-specific metadata - things that other services can use to make informed decisions about it.

Spring Cloud supports both Netflix’s Eureka service registry and Consul but this Discovery Service uses Eureka since it can be bootstrapped automatically in Spring Cloud’s auto-configurations.

### Running the Project (and its Dependencies)
* Run the [`Config-Server`](https://github.com/Prempeh-Gyan/1.0-Config-Server) to serve the property file for this Discovery-Service
* Navigate into the source directory `cd 1.2-Discovery-Service` and execute the following command: `mvn spring-boot:run`
