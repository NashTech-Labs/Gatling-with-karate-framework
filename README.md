Karate with Gatling.

API Performance Testing Made Simple.

Capabilities

    1. Re-use Karate tests as performance tests executed by Gatling
    2. Use Gatling (and Scala) only for defining the load-model, everything else can be in Karate
    3. Karate assertion failures appear in Gatling report, along with the line-numbers that failed
    4. Leverage Karate's powerful assertion capabilities to check that server responses are as expected under load - which is much harder to do in Gatling and other performance testing tools
    5. API invocation sequences that represent end-user workflows are much easier to express in Karate.

The Single unified framework allows us to do functional and performance testing side by side. We even can use use functional test feature file to do performance testing. 

Integration of Gatling with Karate:-

It is quite simple, it seems complex but it is not in reality. One may hesitate a bit because gatling script is written in scala, but it is quite simple once you do some hands-on work.

```<dependency>
    <groupId>com.intuit.karate</groupId>
    <artifactId>karate-gatling</artifactId>
    <version>${karate.version}</version>
    <scope>test</scope>
</dependency>
```


We also need to add karate-apache dependency as well if it is not already there in our pom.xml.

```<dependency>
        <groupId>com.intuit.karate</groupId>
        <artifactId>karate-apache</artifactId>
        <version>${karate.version}</version>
        <scope>test</scope>
    </dependency>
````

Other than these, we will also be required to add Gatling maven plugin. We can find the latest one form here https://search.maven.org/search?q=g:io.gatling%20AND%20a:gatling-maven-plugin&core=gav.

```<plugins>
        <plugin>
            <groupId>net.alchim31.maven</groupId>
            <artifactId>scala-maven-plugin</artifactId>
            <version>${scala.plugin.version}</version>
        </plugin>
        <plugin>
            <groupId>io.gatling</groupId>
            <artifactId>gatling-maven-plugin</artifactId>
            <version>${gatling.plugin.version}</version>
            <configuration>
                <simulationsFolder>src/test/java</simulationsFolder>
                <includes>
                    <include>Performance.GatlingTest</include>
                </includes>
            </configuration>
            <executions>
                <execution>
                    <phase>test</phase>
                    <goals>
                        <goal>test</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
```

You can manually invoke the Gatling plugin from the command-line by using.

```mvn clean test-compile gatling:test```

For better understanding, you may refer to this blog.
https://blog.knoldus.com/karate-with-gatling/

Refernce:-
https://github.com/intuit/karate/tree/master/karate-gatling#karate-gatling
