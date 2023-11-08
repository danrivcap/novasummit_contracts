# novasummit_contracts
Source code for novasummit samples every branch is organised in one step of the sample.

steps/03_contract-stubrunner contains how to configure and run contract stub runner in the project.

# ordersProducer
Microservice for getting orders, it is exposed at:
* [http://localhost:8080/order/{id}]
* H2 inmemory database at [http://localhost:8080/h2-console]

there is a data.sql for initilize orders at resources/data.sql


# deliveryConsumer
Microservice for deliver orders, it is exposed at:
* [http://localhost:8081/deliver]
* H2 inmemory database at [http://localhost:8081/h2-console]

there is a data.sql for initilize deliveries at resources/data.sql

There is no need to run OrdersProducer to test DeliveryConsumer

