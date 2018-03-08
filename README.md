Android Basics Nanodegree Program Project Two

Score Keeper App 

Task: the goal is to create an Score Keeper app which gives a user the ability to keep track of the score of two different teams playing a game of your choice.

My comment: I choose to implement basketball tracking app. Extra functionality: saving a state of variables in case of screen rotation. Tested on Nexus 5X (emulator, API 27) and Samsung Galaxy S4 mini (live, API 19).

PROJECT SPECIFICATION

The chosen game has either multiple amounts of points that can be scored, as in american football, or multiple important metrics to track, such as fouls, outs, and innings in baseball. 

App is divided into two columns, one for each team. Each column contains a large TextView to keep track of the current score for that team. Optionally, a second TextView to track another important metric such as fouls can be added.

Each column contains multiple buttons. The buttons must track either:

Each track a different kind of scoring or each track a different metric (one score, the other fouls, for instance).

The layout contains a 'reset’ button.

The code adheres to all of the following best practices:

Text sizes are defined in sp
Lengths are defined in dp
Padding and margin is used appropriately, such that the views are not crammed up against each other.

Functionality: 
The code runs without errors. 
Each score button updates the score TextView in its column by adding the correct number of points.
The reset button resets the scores on both of the score TextViews.

Code Readability:
Any classes are named after the object they represent.All variables are named by their intended contents.
All methods are named by their intended effect or in the style required by a callback interface.
There are no unnecessary blank lines.One variable is declared per declaration line.
The code within a method is indented with respect to the method declaration line. 
