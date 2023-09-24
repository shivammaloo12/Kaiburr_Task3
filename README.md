# Kaiburr Task 3
## Requirements

Before you begin, ensure you have the following requirements met:

- Docker Desktop or another Kubernetes cluster setup.
- `kubectl` command-line tool installed.
- Maven for building the Spring Boot application.
- Java development environment.



## Project Structure
The project structure is organized as follows:

- `task3/` 
  - `target/`
    - `Dockerfile`: Dockerfile for the Spring Boot application
    - `mongo/`
      - `Dockerfile`: Dockerfile for MongoDB   
    - `k8s`
      - `mongo-deployment.yaml`: Kubernetes YAML manifest for MongoDB
      - `task1-app-deployment.yaml`: Kubernetes YAML manifest for the Spring Boot application
  - `src/`: Source code for the Spring Boot application
    - `...`
  - `pom.xml `: Maven project configuration
  - `README.md`: Project documentation

## How the Task is Completed

The task is completed by following these steps:

- Creation of a Spring Boot application named task1.
- Building the Spring Boot application into a JAR file using mvn clean package.
- Creation of Docker images for both the Spring Boot application and MongoDB.
- Definition of Kubernetes YAML manifests for the application and MongoDB.
- Deployment of the application to the Kubernetes cluster using kubectl apply.
- Verification of the application's accessibility from the host machine.

## Screenshots

### Docker image for the Spring Boot application
![App Screenshot](https://drive.google.com/uc?id=1qNmPuNn9soiiMQjQRVbLbWzmuamLA0_2)

### Docker image for the MongoDB
![App Screenshot](https://drive.google.com/uc?id=1tTtZ94dwaTwYaScjrJzcW-OoYOsKRzih)

### Kubernetes YAML manifest for MongoDB
![App Screenshot](https://drive.google.com/uc?id=1gTjrDU8l80aBmjLVIF86S8yU7Onov15r)

![App Screenshot](https://drive.google.com/uc?id=13BFTG9EyBHLOydLHm5iDPQ26wcsyCqUk)

### Kubernetes YAML manifest for the Spring Boot application
![App Screenshot](https://drive.google.com/uc?id=1Y0vpEowL2nHVKFoMEDTVzFWCvz4AvGsy)

![App Screenshot](https://drive.google.com/uc?id=1PCJiaqewLDhkbx-u2-oO5tdo_x_x52jO)

### MongoDB in a separate pod
![App Screenshot](https://drive.google.com/uc?id=1BlMDx5ryjeMT6r8fEYCmbi38AXOzD6we)

### The application is taking MongoDB connection details from environment variables

![App Screenshot](https://drive.google.com/uc?id=1Pa9270qbBuKWnRRrhsdPwXMUjyfbsoLZ)

![App Screenshot](https://drive.google.com/uc?id=11DFJZexUMQW3joMEJDIbwxM2Nn3ZQywM)

### The application endpoints are available from host machine
![App Screenshot](https://drive.google.com/uc?id=1CciCdD8crNDUyAe6C7HXFMQmzifB98j-)

![App Screenshot](https://drive.google.com/uc?id=1b_7U5wU_oJKm-8PWEo3GhyY5blNhkx78)
