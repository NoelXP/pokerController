# Use the official Groovy image
FROM groovy:4.0.24-jdk11

# Set the working directory inside the container
WORKDIR /app

# Copy source files into the container
COPY src/org/addHand.R ./src/org/addHand.R
COPY pokerController.groovy ./pokerController.groovy

# Entrypoint to execute the Groovy script
ENTRYPOINT ["groovy", "./pokerController.groovy"]

