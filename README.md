# Sanrio Corner Java Project README
![_](https://user-images.githubusercontent.com/98183566/235280978-6b4e04ca-dda7-4a6e-8b94-de4fd82da234.jpeg)

This project is a Java program that allows users to interact with the Sanrio characters by taking a quiz and getting information about their favorite characters.

## How to run the program

To run the program, follow these steps:

1. Clone the repository to your local machine
2. Open a terminal window and navigate to the project directory
3. Compile the program by running the following command:
```
javac *.java
```
4. Run the program by running the following command:
```
java Main
```

## Program Flow

When the program starts, the user is presented with a menu with four options:

1. **Sanrio Quiz**: The user is prompted with a series of questions to determine their Sanrio character. The program stores the answers and displays the character at the end of the quiz.
2. **Generate a Happy Message**: The user is prompted to enter a number from 1 to 10. The program generates a happy message based on the user's input.
3. **Get Character Information**: The user is prompted to enter a letter representing a Sanrio character (e.g., "h" for Hello Kitty). The program displays information about the character.
4. **Quit**: The user exits the program.

## Classes and Interfaces

The program is organized using the Model-View-Controller (MVC) pattern. There are three classes in the project:

- `Controller`: This class represents the controller of the project, handling user input and making calls to the model and view respectively. 
- `Model`: This class represents the model of the project. It contains the logic of the program, such as calculating the user's Sanrio character and generating happy messages.
- `View`: This class represents the view of the project. It is responsible for displaying information to the user.

In addition, there are three interfaces in the project:

- `IModel`: This interface defines the methods that the `Model` class must implement.
- `IController`: This interface defines the methods that the `Controller` class must implement.
- `IView`: This interface defines the methods that the `View` class must implement.

## Dependencies

This project does not have any external dependencies. It is written in pure Java and does not require any third-party libraries.
