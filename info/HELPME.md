1. Docker:
- image-> splunk/splunk:latest
- port-> 8087:8000
var -> SPLUNK_START_ARGS=--accept-license
var -> SPLUNK_PASSWORD=YOUR_SPLUNK_TOKEN
- http://localhost:8087
user -> admin
password -> YOUR_SPLUNK_TOKEN
search -> spring-boot-app

2. How to run:
   + Application run as debug
   - gradle build -x test
   - in git bash ./gradlew build -x test
   - 
3. http://localhost:8080/hello



