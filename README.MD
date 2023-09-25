<h1 align="center">Java-Basics-Workshop</h1>
<h3 align="center">Free sample exercises to get started with Java</h3>

---

This is a github repository with exercises for a Java basics workshop.
The repository is divided into several folders, which contain the exercises for the different topics.
The java file with the name of the topic (e.g. Operators.java) contains examples for reference. In addition, there are files with the attachments _task and _solution. The task file contains a task with exercises for the respective topic. The solution file contains a corresponding solution. It should be noted that these are only sample solutions, as there are different ways of solving the problem.

# Content

This project contains multiple topics with Java code for learning purposes.

| No | Topic                                                                                                                                                             |
|:--:|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|   1| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/01_HelloWorld">Hello World</a>                                |
|   2| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/02_Operators">Operators</a>                                   |
|   3| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/03_ControlStructures">Control Structures</a>                  |
|   4| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/04_Arrays">Arrays</a>                                         |
|   5| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/05_InputOutput">Input & Output</a>                            |
|   6| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/06_Methods">Methods</a>                                       |
|   7| <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/07_ObjectOrientedProgramming">Object Oriented Programming</a> |

# Getting started

Detailed instructions on how to open and complete the exercises as projects in Eclipse and IntelliJ follow.

## Installing the Java Development Kit (JDK)

The Java Development Kit combines development tools, libraries, the Java Runtime Environment (JRE), and the Java Virtual Machine (JVM).

As of August 2023 JDK 17 ist the most recent Long-Term-Support (LTS) Version.

### What is the difference between LTS and Non-LTS versions?

**LTS:** These versions receive long-term support and updates for an extended period.\
**Non-LTS:** These versions are suitable if you want to take advantage of the latest language features and libraries, but they might have a shorter support window.

### Download

You can download the JDK from the <a target="_blank" rel="noopener noreferrer" href="https://www.oracle.com/java/technologies/downloads/#java17">official Oracle website</a> or directly via the following links (JDK 17).

<details>
  <summary>Windows</summary>
  
  - [x64 Installer](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe)
  - [x64 MSI Installer](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.msi)
</details>

<details>
 <summary>macOS</summary>

 - [Intel](https://download.oracle.com/java/17/latest/jdk-17_macos-x64_bin.dmg)
 - [Apple Silicon (M)](https://download.oracle.com/java/17/latest/jdk-17_macos-aarch64_bin.dmg)
</details>

<details>
 <summary>Linux</summary>

 - [ARM64 Compressed Archive](https://download.oracle.com/java/17/latest/jdk-17_linux-aarch64_bin.tar.gz)
 - [ARM64 RPM Package](https://download.oracle.com/java/17/latest/jdk-17_linux-aarch64_bin.rpm)
 - [x64 Compressed Archive](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz)
 - [x64 Debian Package](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.deb)
 - [x64 RPM Package](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm)
</details>

## Compile and Execute .java files in Command Prompt

This tutorial will guide you through the process of compiling and executing Java programs using the Command Prompt (CMD) on Windows.

### Step 1: Open Command Prompt
Press `Win + R`, type `cmd`, and press Enter to open the Command Prompt.

### Step 2: Navigate to the Directory
Use the `cd` command to navigate to the directory where your `.java` file is located. For example:

```shell
cd path\to\your\java\file\directory
```

Replace `path\to\your\java\file\directory` with the actual path to your Java file's directory.

### Step 3: Compile the Java File
To compile the Java file, use the `javac` command followed by the filename with the `.java` extension. For our example, use:

```shell
javac HelloWorld.java
```

If there are no errors in your code, this command will generate a `HelloWorld.class` file in the same directory.

### Step 4: Execute the Java Program
To execute the compiled Java program, use the `java` command followed by the name of the class containing the `main` method (without the `.class` extension). For our example, use:

```shell
java HelloWorld
```

You should see the output on the screen:

```shell
Hello, World!
```

## Troubleshooting
- If you encounter errors during compilation, review your code for syntax errors and ensure that your JDK is installed correctly.

- Ensure that your Command Prompt is using the correct Java version. You can check the Java version with `java -version`.

- Make sure you are in the correct directory when compiling and running your Java program. Use the `cd` command to navigate to the correct directory.

---

<p align="center">
Author:<br>
<a href="https://github.com/tokro">tokro</a>
</p>
