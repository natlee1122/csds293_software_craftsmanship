# Program Assignment 6

Written by Anthony Wang and Natalie Lee

## Social Network Analyzer Overview

This social network analyzer project is organized in the standard java convention. 

The social network is represented as a graph, where Nodes are individuals and edges represent the connections between them. The algorithm uses data structures to reresent the social network graph, store all data, and perform operations. This invovles:
* A dictionary to map user IDs to user details
* An adjacency list to represent connections between users
* Graph traversal algorithms

The social network analyzer consists of several classes and interface, which invovles:
* `User`: An interface to represent any kind of users
* `NormalUser`: A class representing a normal user
* `Influencer`: A class representing an influencer
* `SocialNetwork`: A class representing the social network
* `InfluencerAnalyzer`: A class representing the influence a user has in the social network
* `SocialNetworkAnalyzer`: A class analyzing the social network