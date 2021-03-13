# springRestOracle
testing spring boot and oracle db

Simple helloController is using jdbcTemplate and dataSource configured in application.properties:

```
git clone https://github.com/tzizanovic/springRestOracle.git
cd springRestOracle/
mvn install:install-file -Dfile=/home/tomo/Desktop/spring/restfull/src/main/resources/ojdbc6-11.2.0.4.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=19.3 -Dpackaging=jar
mvn clean package
java -jar /home/tomo/spring/springRestOracle/target/restfull-0.0.1-SNAPSHOT.war
Test:http://localhost:8080/billing/38763363358
```

![result](https://user-images.githubusercontent.com/80390138/111033780-2ed6b480-8413-11eb-8bf8-379a95d43e94.png)
