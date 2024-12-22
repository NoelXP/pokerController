# Initialize an empty vector to store the hands
session_hands <- c()

# Function to add a hand to the session vector
add_hand <- function(hand) {
  # Use global assignment to modify the session_hands vector
  if (grepl("^[2-9TJQKA][shdc][2-9TJQKA][shdc]$", hand, ignore.case = TRUE)) {
    session_hands <<- c(session_hands, toupper(hand))
    message("Hand added: ", toupper(hand))
  } else {
    stop("Invalid hand format. Please use valid shorthand, e.g., AsJd.")
  }
}

# Example usage
add_hand("AsJd")  # Adds Ace of spades and Jack of diamonds to the session
add_hand("KcQh")  # Adds King of clubs and Queen of hearts
print(session_hands)  # Displays the session hands

