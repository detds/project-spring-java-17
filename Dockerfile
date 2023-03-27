FROM amazoncorretto:17-alpine-jdk

# Copiar os arquivos da aplicação para dentro do contêiner
COPY target/*.jar javaspring.jar

# Definir as variáveis de ambiente necessárias para a aplicação
ENV DB_URL=${DB_URL}
ENV DB_USERNAME=${DB_USERNAME}
ENV DB_PASSWORD=${DB_PASSWORD}

# Expor a porta 8080 para a aplicação Spring Boot
EXPOSE 8080

# Rodar a aplicação Spring Boot
CMD ["java", "-jar", "javaspring.jar"]
