# novasummit_contracts
Source code for novasummit samples every branch is organised in one step of the sample.

steps/01_initial contains base project to demostrate the problem we face.

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

