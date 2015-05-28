This is Kieron Tasker's (u1258496) code submission for the AIBirds assignment.

This archive contains the following files:
	- AIAssignment2.java: A modified version of NaiveAgent (from the AIBirds project) which contains my development towards a Angry Birds playing agent that utilises a Bayesian learning component

	- NaiveBayesTest.java: A class containing the same NaiveBayes implementation as found in AIAssignment2.java. This class is a proof of concept that the learning component is able to be called and does classify the data provided in birds.level.arff.

	- birds.data.arff: A file containing the learning set of data for the AIAssignment2 agent.

	- birds.level.arff: A placeholder file which would contain an instance of a potential shot in a given level to be classified, the outcome of which determines whether the agent takes a shot in this level. Since the agent has never attempted to play the game, the data provided in birds.data.arff and birds.level.arff is dummy data.

	- libs/: contains several Java libraries to be appended to the build path of the AIBirds project. To be safe, all of the standard AIBirds libraries (from abV1.32/external) are included. weka.jar (the Weka library) is also included in this directory.



Note: Since chrome.angrybirds.com is now unavailable for testing purposes:
	- The agent contained in AIAssignment2 has never been tested with the Angry Birds game and likely does not function (needs testing)
	- The learning data in birds.data.arff is likely out of proportion to the actual data that would be gathered from the game with the algorithm developed in my Agent class (AIAssignment2.java)
	- The level data in birds.level.arff is also likely out of proportion.