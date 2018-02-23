FROM tomcat:alpine
EXPOSE 8116

#ARG WAR_FILE
#COPY ${WAR_FILE} .
COPY myweb-0.1.0.war .

RUN ["rm", "-rf", "/usr/local/tomcat/webapps/ROOT"]

#RUN mv $WAR_FILE /usr/local/tomcat/webapps/ROOT.war
RUN mv myweb-0.1.0.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]
