# U5S3 - Using break and continue statements

* Part A - Foundations 7.2
* Part B - UML Practice


## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the class `Player`.
#### Step 02

* Implement two players and assign them the following properties:
    * Player 1: 
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
      * variable: Michael Jordan 
      * Name: Michael Jordan
      * Height: 6'6
      * Years in the League: 15 years

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `BballTeamTest`.

#### Step 02

* Experiment with the `BballTeamTest`class
  * Can players fool security by impersonating each
    other?
    * Write a print statement with a boolean expression that tests
    if Stephen == Michael
    * Change the properties of Stephen so that they match Michael
    * Then test the equality of these objects again
  * Is the Referee fooled when reference variables change?
    * Instantiate two players and assign them the properties
    below
    * Test the equality of these objects
    * Then set the reference variable for Stephen equal to Michael
    * Test the equality of these objects again

    * Player 1:
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
        * variable: Michael Jordan
        * Name: Michael Jordan
        * Height: 6'6
        * Years in the League: 15 years

### Exercise 03

#### Step 01

In the package `partA.ex03` look at the file `BballTeamTest`.

#### Step 02

* Experiment with the `BballTeamTest`class
    * Instantiate two players with the names shown below
      * Set their names by using the new keyword and test the
      equality of these Strings by using ==
      * Set their names without using the new keyword and test the
      equality of these Strings by using ==

    * Player 1:
      * variable: Stephen Curry
      * Name: Stephen Curry
      * Height: 6'2
      * Years in the League: 13 years
    * Player 2:
        * variable: Michael Jordan
        * Name: Michael Jordan
        * Height: 6'6
        * Years in the League: 15 years
      
## Part B
Use this table to generate the UML for Shaquille O'Neal with [Draw.io](https://app.diagrams.net/)

| Property        | Type |
|-----------------| ---- |
| name            | String|
| height          | String |
| Years in league | Integer |
