# singleton-java
in this project i am trying to implement using singleton pattern using java

## Dev Environment Setup

1. Java 1.8.0_191

[Open this link to read how to install java](https://www.java.com/en/download/help/download_options.xml)

2. IntelliJ IDEA 2018.2.3 (Ultimate Edition) :

[Open this link to read how to install IntelliJ](https://www.jetbrains.com/help/idea/install-and-set-up-product.html)

3. Homebrew 1.8.4

[Open this link to read how to install HomeBrew](https://brew.sh/)

4. Maven 3.6.0

Install maven using homebrew by typing command below in terminal

```brew install maven```

4. JUnit 4.12

This project is using JUnit to do unit testing. Lines below in pom.xml used for adding JUnit as project's dependency

```
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
```

## How to test

Open terminal and move to this project directory and then type command

```mvn test```

