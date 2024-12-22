/*
This script allows you to record shorthand poker hands (e.g., AsJd) during a session. 
You can enter commands for various actions:
  - Type a poker hand (e.g., AsJd) to add it to the session.
  - Use 'printHands' or 'ph' to print all recorded hands.
  - Use 'q' or 'quit' to terminate the script.
  - Type '/?' to display this list of commands.
Hands are validated to ensure correct formatting (e.g., AsJd, 2h9c).

Usage:
  Run the script and follow the prompts to enter hands or commands.
*/

def sessionHands = []  // List to store all poker hands for the session
def running = true     // Boolean flag to control the loop

println "Welcome to the Poker Hand Recorder!"
println "Type '/?' for a list of commands."

// Function to validate hand format
boolean isValidHand(String hand) {
    hand ==~ /^[2-9TJQKA][shdc][2-9TJQKA][shdc]$/
}

// Function to display commands
void printCommands() {
    println """
Commands:
  - Enter a poker hand in shorthand notation (e.g., AsJd, KcTh)
  - 'printHands' or 'ph': Print all recorded hands
  - 'q' or 'quit': Quit the script
  - '/?': Print this list of commands
"""
}

// Main loop
while (running) {
    print "Enter a poker hand or command: "
    def input = System.console().readLine()?.trim()

    switch (input?.toLowerCase()) {
        case 'q':
        case 'quit':
            println "Exiting. Goodbye!"
            running = false
            break
        case 'printHands':
        case 'ph':
            println "Recorded Hands: ${sessionHands.isEmpty() ? 'No hands recorded yet.' : sessionHands.join(', ')}"
            break
        case '/?':
            printCommands()
            break
        default:
            if (isValidHand(input)) {
                sessionHands << input.toUpperCase()
                println "Hand added: ${input.toUpperCase()}"
            } else {
                println "Invalid input. Use '/?' for commands or enter a valid poker hand (e.g., AsJd)."
            }
    }
}

