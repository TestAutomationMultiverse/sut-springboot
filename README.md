## API Endpoints

The application exposes the following API endpoints:

* `GET /api/products/{id}`: Retrieves a product by ID.
* `GET /api/products`: Retrieves a list of all products.
* `POST /api/products`: Creates a new product.
* `DELETE /api/products/{id}`: Deletes a product by ID.

## Database

The application uses H2 as the in-memory database. The database is configured using the properties in the `application.properties` file. 

## Build and Run

The application can be built and run using the following command:

`mvn spring-boot:run`

## Install and Run the Application

1. Install Java 21 and Maven on your machine.
2. Download the project from GitHub.
3. Navigate to the root directory of the project in your terminal.
4. Run the following command to start the application: `mvn spring-boot:run`
5. Open a web browser and navigate to `http://localhost:8000` to access the API endpoints.

