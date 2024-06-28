# UnifiedRepository
# Spring Boot HAPI FHIR and EHRbase Integration

This project integrates HAPI FHIR and EHRbase into a single Spring Boot application using a single MySQL database.

## Prerequisites

- Java 11+
- MySQL
- Docker (optional)

## Setup

1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-repo/spring-boot-hapi-ehrbase.git
   cd spring-boot-hapi-ehrbase

### Running the Application in Eclipse
1. **Import the project**:
   - Open Eclipse.
   - Go to `File` -> `Import` -> `Maven` -> `Existing Maven Projects`.
   - Select the project directory.

2. **Run the application**:
   - Right-click on the project in the Project Explorer.
   - Select `Run As` -> `Spring Boot App`.

This setup will allow you to run both the `/fhir` and `/ehrbase/rest` endpoints simultaneously within a single Spring Boot application, connected to a single MySQL database instance.
