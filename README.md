# spring-boot-3

## Run docker compose
```shell
$ docker compose up -d
```

## Access docker container
```shell
$ docker exec -it postgres_customer bash
```

## Login postgres
```shell
$ psql -U yeahbutstill
```
## Insert data
```postgres-psql
INSERT INTO customer(id, name, email, age) VALUES(nextval('customer_id_sequence'), 'Dani', 'fuckem@yeahbutstill.com', 30);
INSERT INTO customer(id, name, email, age) VALUES(nextval('customer_id_sequence'), 'Maya', 'maya@yeahbutstill.com', 30);
INSERT INTO customer(id, name, email, age) VALUES(nextval('customer_id_sequence'), 'Winda', 'winda@yeahbutstill.com', 30);
```

