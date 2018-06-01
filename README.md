# junit-tests
This project is intended to teach beginners working with unit tests using , junit and (power)mockito.

## Project Structure
Example Code is found in `src`, the associated tests can be found in `src-test`,
the needed libraries are in `libs`.

## Free Use
This repository may be used freely, providing that changes are not comitted on the master branch.
To clone it from the command line, use:

    git clone https://github.com/maegges65/junit-tests

## Description

For each example, there is a separate package in both the `src` and the `src-test` folder.

### demo

This has a simple class with a method whose logic depends solely on the method's parameters. The test class demonstrates how to cover the complete code.

### demo2

A hypothetical example of a servo system with actors and sensors, where the latter are described as interfaces. 

The test class demonstrates the use of mocks and verification of method calls.

### demo3

Similar to demo2, but now actor and sensor are (stupid) concrete classes.

The test class demonstrates the use of spies.

### demo4

Based on demo3, but this time a factory is used to create actor and sensor.

The test class demonstrates the use of the factory to avoid spies.

### demo5

Based on demo4, but this time with a `try {...} finally {...}` block.

The test class demonstrate how to test behaviour for exceptions.