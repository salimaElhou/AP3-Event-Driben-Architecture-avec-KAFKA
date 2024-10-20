## Salima EL HOU SDIA 2

# 1- Utilisation de kafka 

<img src="captures/1-kafka.png">

### 1. Démarrer Zookeeper
### 2. Démarrer Kafka
### 3. Tester avec Kafka-console-producer et kafka-console-consumer
### 3.1 Kafka Producer
### 3.2 Kafka Consumer

# 2- Utilisation de Docker avec Kafka

## Étapes d'utilisation

### 1. Créer le fichier `docker-compose.yml`

<img src="captures/1-dockerCompose.png">

### 2. Démarrer les conteneurs Docker

Dans le répertoire où se trouve votre fichier `docker-compose.yml`, exécutez la commande suivante pour démarrer les conteneurs Docker :

```bash
docker-compose up -d
```
<img src="captures/2-docker up.png">

### 3. Tester avec Kafka-console-producer et Kafka-console-consumer


#### Tester avec kafka-console-producer

Pour envoyer des messages à un topic Kafka, utilisez la commande suivante dans le conteneur :

```bash
kafka-console-producer --broker-list localhost:9092 --topic test
```
<img src="captures/producer.png">

#### Tester avec kafka-console-consumer

Pour lire les messages depuis un topic Kafka, exécutez la commande suivante :

```bash
kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning
```
<img src="captures/cunsumer.png">

# 3- Projet avec Kafka et Spring Cloud Streams

### PageEvent :

<img src="captures/PageEvent.png">
<img src="captures/PageEventRestController.png.png">
