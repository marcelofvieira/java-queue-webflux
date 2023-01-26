# java-queue-webflux
Usando ConcurrentLinkedQueue para distribuir a execução do trabalho para várias threads 

exemplo de uso: 

curl --location --request POST "http://localhost:8080/monitors/monitor01/config01"
curl --location --request POST "http://localhost:8080/monitors/monitor01/config02"
curl --location --request POST "http://localhost:8080/monitors/monitor01/config03"

curl --location --request POST "http://localhost:8080/monitors/monitor02/config01"
curl --location --request POST "http://localhost:8080/monitors/monitor02/config02"
curl --location --request POST "http://localhost:8080/monitors/monitor02/config03"

