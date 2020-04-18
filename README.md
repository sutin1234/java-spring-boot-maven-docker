![Spring Boot Rest Api](https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs/135358933/original/51c00d1fcfa61a4ebfe7fa5eead62ba57ecb820a/create-rest-api-using-java-spring-boot.png)
### Java Spring Boot Rest API Maven
``` Build Rest API with Java Spring Boot ```

#### Prepared Environment
* install JDK 8 or more [JDK Downloads](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
* Maven CLI [Maven Installer](http://maven.apache.org/)

#### Clone Project
``` $ git clone https://github.com/sutin1234/java-spring-boot-maven-docker.git  proj-name  && cd proj-name```

#### Build project With Gradle
`` ./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar ``

#### Build project With Maven
`` ./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar ``

### Serve Spring boot Project
``` http://localhost:8080 ```

![rertertertertertert](https://miro.medium.com/max/1000/1*9Q5avdoWUDt6gvy67oHv5w.jpeg))
#### Using Docker image
``` build docker image to usage ```

#### Make Dependencies
``` $ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar) # for maven```

``` $ mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar) # for gradle```

#### Build Docker images
``` 
$ docker build -t springio/gs-spring-boot-docker . #build docker image
$ docker run -p 8080:8080 -t springio/gs-spring-boot-docker #run docker conatiner
$ docker ps #see docker container
```

### Serve Spring boot Project
``` http://localhost:8080 ```