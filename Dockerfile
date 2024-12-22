# Use Debian Bullseye Slim as the base image
FROM debian:bullseye-slim

# Install required dependencies
RUN apt-get update && apt-get install -y --no-install-recommends \
    bash \
    openjdk-11-jdk \
    groovy \
    r-base \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# Set the working directory inside the container
WORKDIR /app

# Copy the source files into the container
COPY ./src/org/addHand.R ./src/org/addHand.R
COPY ./pokerController.groovy ./pokerController.groovy

# Define the entrypoint to execute the Groovy script
ENTRYPOINT ["groovy", "./pokerController.groovy"]

