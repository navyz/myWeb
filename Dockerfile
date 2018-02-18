FROM tomcat:alpine
EXPOSE 8116
ARG WAR_FILE
COPY ${WAR_FILE} .
RUN ["rm", "-rf", "/usr/local/tomcat/webapps/ROOT"]
RUN mv $WAR_FILE /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]
