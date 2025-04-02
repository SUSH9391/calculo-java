# Scientific Calculator

This is a simple scientific calculator web application built using Java. 

## Features
- Basic arithmetic operations: addition, subtraction, multiplication, division
- Scientific functions: square root, power, sine, cosine
- Attractive UI/UX design

## How to Run
1. Open `index.html` in a web browser to use the web version.
2. Compile and run `Calculator.java` for the desktop version.

## Technologies Used
- HTML, CSS, JavaScript for the web app
- Java Swing for the desktop app
# Console Calculator

## Building the Docker Image

To build the Docker image for the console calculator, navigate to the directory containing the `Dockerfile` and run the following command:

```bash
docker build -t calculator-app .
```

## Running the Docker Container

To run the console calculator in an interactive terminal, use the following command:

```bash
docker run --rm -it calculator-app
```

You can then enter arithmetic expressions to calculate results. Type 'exit' to quit the application.

## Pulling the Docker Image

If the Docker image is available on a Docker registry, you can pull it using the following command:

```bash
docker pull <calculator-app>/calculator-app
```
here '<calculator app>' refers to your repository name where you want to pull my docker image.

## Running the Docker Container from the pulled image

bash

docker run --rm -it <calculator-app>/calculator-app

## Further you can also check out my docker container in packages.
https://github.com/SUSH9391?tab=packages

