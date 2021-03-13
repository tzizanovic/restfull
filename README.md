# springRestOracle
testing spring boot and oracle db

Simple helloController is using jdbcTemplate and dataSource configured in application.properties:

git clone https://github.com/tzizanovic/springRestOracle.git
cd springRestOracle/
mvn clean package
java -jar /home/tomo/spring/springRestOracle/target/restfull-0.0.1-SNAPSHOT.war

Test:
http://localhost:8080/billing/38763363358


