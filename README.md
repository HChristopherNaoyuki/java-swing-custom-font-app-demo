# Extending JFrame Application

## Overview
This Java application demonstrates how to create a custom JFrame using the Swing library. It includes a label with a custom font and a dark-themed background. 

## Features
- Displays a simple message using a JLabel.
- Custom font support using a TrueType font file.
- Dark-themed background color.

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to run Java code (e.g., IntelliJ IDEA, Eclipse, or command line).

## Setup

### Required Files
- **PixelFont.ttf**: Make sure you have the custom font file in the same directory as your Java files or adjust the path accordingly.

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/yourusername/extending-jframe.git
   ```
   
2. **Navigate to the Project Directory**:
   ```bash
   cd extending-jframe
   ```

3. **Compile the Java Files**:
   ```bash
   javac Solution/ExtandingJFrame.java Solution/JFrame1.java
   ```

4. **Run the Application**:
   ```bash
   java Solution.JFrame1
   ```

## Code Explanation
- **ExtandingJFrame Class**: This class extends `JFrame` and sets up the GUI components, including:
  - A JLabel that displays a welcome message.
  - A custom font loaded from a TTF file.
  - A dark background color.

- **JFrame1 Class**: This class contains the `main` method which creates an instance of `ExtandingJFrame` and handles any font loading exceptions.

## Exception Handling
If the custom font file is not found or there are issues with the font format, a message dialog will appear displaying the error.

## Customization
You can modify the label text, font size, background color, and other properties as needed to customize the appearance of the JFrame.
