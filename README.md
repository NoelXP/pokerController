To run the Docker container:


🃏 Poker Hand Tracker 🃏

A Groovy and R-powered program to help you record poker hands quickly and efficiently! This project uses Docker to package and run the application, making it easy to set up and use anywhere.
📂 Project Structure
```bash
.
├── Dockerfile                 # 🐋 Docker configuration for the project
├── pokerController.groovy     # 🤖 Groovy script to manage poker hand input
├── README.md                  # 📖 You're reading it right now!
├── src                        # 📂 Source directory for additional files
│   └── org
│       └── addHand.R          # 📊 R script for storing and analyzing poker data
└── var                        # 🗃️ Placeholder for additional project data
```

🛠️ Setup Instructions
Step 1: Clone the Repository

git clone https://github.com/yourusername/poker-hand-tracker.git
cd poker-hand-tracker

Step 2: Build the Docker Image

docker build -t handtracker .

Step 3: Run the Application

Run the Docker container with the following command:

docker run -it --rm \
  -v $(pwd)/src:/app/src \
  -v $(pwd)/pokerController.groovy:/app/pokerController.groovy \
  handtracker

🧠 How It Works

    Input Poker Hands:
    The Groovy script, pokerController.groovy, prompts you to input poker hands or commands.
        Example: As Ks 10d 5c 3h
        Type /help for a list of commands.

    Process with R:
    The addHand.R script processes and stores the hands for future analysis.

    Dockerized Environment:
    All dependencies (Groovy, R, Java) are packaged in Docker for easy setup and cross-platform compatibility.

🐋 Why Docker?

    📦 Simplified Setup: No need to manually install Groovy, R, or Java.
    🌍 Cross-Platform: Runs anywhere Docker is supported.
    🔒 Isolated Environment: Keeps your system clean and dependency conflicts at bay.

🎮 Features

    🖋️ Quick Input: Type poker hands or commands directly into the terminal.
    🧠 Smart Analysis: Use R to analyze and store your poker data.
    📈 Customizable: Easily edit the Groovy or R scripts to fit your needs.
    🔄 Docker-Powered: Rebuild and run the container as needed without hassle.
