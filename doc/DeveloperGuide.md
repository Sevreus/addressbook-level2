# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.

### User Stories.

* As a user, I'd like to be able to edit persons in the addres book in case I made a mistake when adding them.
* As a user, I'd like to be able to add more than one phone number for a given person (i.e. work/ cellular/ home).

### Use Case

* Software System: AddressBook
* Use Case: Rename tag
* Actor: User
* Main success:
* 1. User types in command to rename certain tag (i.e. "friends").
* 2. User types in replacement tag (i.e. "buddies").
* 3. User confirms (or not) with "yes/no".
* 4. Program prints out updated list.

### Non Functional Requirements

* Program should provide certain private aspects by using password protection.
* Program should respond fast to the user.
