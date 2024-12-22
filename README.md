


.
├── Dockerfile
├── pokerController.groovy
├── README.md
├── src
│   └── org
│       └── addHand.R
└── var

to run docker run -it --rm \
  -v $(pwd)/src:/app/src \
  -v $(pwd)/pokerController.groovy:/app/pokerController.groovy \
  handtracker


# pokerController
Groovy program to record pokerhands really quickly and store them using R
