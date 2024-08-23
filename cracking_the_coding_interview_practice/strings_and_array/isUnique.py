#Question 1.1 from Cracking the Coding Interview
#Implement an algorithm to determine if a string has all unique characters.
#What if you cannot use additional data structures?

def isUnique(str):
    #U: This problem wants me to determine if all letters in a string are unique. No repeating letters
    #M: Most likely a map implementation to count all instances of letters or set to remove duplicates
    #P: I will use a map to count all instances of the letters in the string.

    #Implementation:

    map = {}

    for i in str:
        if i in map:
            return False
        else:
            map[i] = 1
    return True


#Test Cases
print(isUnique("hello"))  # -> False since there are 2 l's
print (isUnique("world")) # -> True since all letters are unique

def isUniqueNoMap(str):
    #UMPIRE -> Understand, Match, Plan, Implement, Review, Evaluate
    #U: This problem wants me to determine if all letters in a string are unique. No repeating letters
    #M: Attempting to solve this problem wit an array

    #Implementation:

    print("helo")
