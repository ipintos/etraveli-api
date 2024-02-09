# etraveli-api

To run the project, you'll need to generate the executable using the following command: ./mvnw clean package -DskipTests

After that, you can execute the project with: docker-compose up --build

For your convenience, here are the details for the .env file to help you create the JAR.

SPRING_SERVER_PORT = 8080  
SPRING_DATASOURCE_URL = jdbc:postgresql://localhost:5432/card-cost-db  
SPRING_DATASOURCE_USERNAME = postgres  
SPRING_DATASOURCE_PASSWORD = postgres  

DATABASE_URL = postgres://myuser:secret@postgres:5432/mydatabase  

POSTGRES_PORT = 5432  
POSTGRES_DB = card-cost-db  
POSTGRES_PASSWORD = postgtres  
POSTGRES_USER = postgtres  
