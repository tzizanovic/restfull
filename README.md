# springRestOracle
testing spring boot rest service selecting from multiple oracle db

Simple helloController is using jdbcTemplate and multiple Oracle dataSources configured in application.properties and webconfig.java:

```
git clone https://github.com/tzizanovic/springRestOracle.git
mvn install:install-file -Dfile=/home/tomo/Desktop/spring/restfull/src/main/resources/ojdbc6-11.2.0.4.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar
mvn clean package

java -jar /home/tomo/spring/springRestOracle/target/restfull-0.0.1-SNAPSHOT.war --spring.db1.username=user1 --spring.db1.password=password1 --spring.db2.username=user2 --spring.db2.password=password2  

Test:  
http://localhost:8080/billing/38763363358

check db versions:
http://localhost:8080/database/1
http://localhost:8080/database/2

netstat -na |grep 192.168.123.30 |grep EST |wc -l
netstat -na |grep 192.168.123.64 |grep EST |wc -l
```
![result](https://user-images.githubusercontent.com/80390138/111069409-3e1a3880-84cd-11eb-80ad-f614bd9fd891.png)
