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
# print(isUnique("hello"))  # -> False since there are 2 l's
# print (isUnique("world")) # -> True since all letters are unique

def isUniqueNoMap(str):
    #UMPIRE -> Understand, Match, Plan, Implement, Review, Evaluate
    #U: This problem wants me to determine if all letters in a string are unique. No repeating letters
    #M: Attempting to solve this problem wit an array.
    #P: I will create an array of length 26. I will iterate through the string and get the ASCII value of the char.
    #   Initially the array will contains values of all False. Iterate over the string, get the char ASCII value and
    #   subtract the current ASCII value by the ASCII value of 'a'. The resulting value is the respective index of the char
    #   in the array of False. if the  letter is present in the string then at that index change the value to True.
    #   Then if the value in the array is already True, return False.

    #Implementation:

    alphabet_arr = [False] * 26 # creates an array of length 26 that contains all False values

    for char in str:
        char_index = ord(char) - ord('a')
        if alphabet_arr[char_index]:
            return False
        else:
            alphabet_arr[char_index] = True

    return True

print(isUniqueNoMap("hello"))  # -> False since there are 2 l's
print (isUniqueNoMap("bbbbb")) # -> False since all letters are the same
print(isUniqueNoMap("world")) # -> True since all letters are unique
print(isUniqueNoMap("a")) # -> True since a is the only letter
