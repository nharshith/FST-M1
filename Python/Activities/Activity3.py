# Enter User names
firstUser = input("Enter first player name: ")
secondUser = input("Enter second player name: ")

# Enter user inputs
validOptions = ['rock','paper','scissors']
firstUserInput = input("Select one option amoung Rock, Paper or Scissors: ").lower()
secondUserInput = input("Select one option amoung Rock, Paper or Scissors: ").lower()

# Choose the winner
if(firstUserInput in validOptions and secondUserInput in validOptions):
    if(firstUserInput == secondUserInput):
        print("This is a Tie")

    if(firstUserInput == 'rock'):
        if(secondUserInput == 'paper'):
            print(f"{secondUser} is the winner")
        else:
            if(secondUserInput == 'scissors'):
                print(f"{firstUser} is the winner")
    elif(firstUserInput == 'paper'):
        if(secondUserInput == 'scissors'):
            print(f"{secondUser} is the winner")
        else:
            if(secondUserInput == 'rock'):
                print(f"{firstUser} is the winner")
    elif(firstUserInput == 'scissors'):
        if(secondUserInput == 'rock'):
            print(f"{secondUser} is the winner")
        else:
            if(secondUserInput == 'paper'):
                print(f"{firstUser} is the winner")
else:
    print("Invalid option selected")