print("Hello")

a = """Lorem ipsum dolor sit amet,
consecrated advising elite,
sed do emus temper incident
ut labor et door magna alia."""
print(a)

a = '''Lorem ipsum dolor sit amet,
consecrated advising elite,
sed do emus temper incident
ut labor et door magna alia.'''
print(a)

a = "Hello, World!"
print(a[1]) # e

for x in "banana":
  print(x)
'''
b
a
n
a
n
a
'''

a = "Hello, World!"
print(len(a)) # 13

txt = "The best things in life are free!"
print("free" in txt) # true

txt = "The best things in life are free!"
print("expensive" not in txt) # true

txt = "The best things in life are free!"
if "free" in txt:
  print("Yes, 'free' is present.")

# Slicing Strings
# Get the characters from position 2 to position 5 (not included):

b = "Hello, World!"
print(b[2:5]) # llo

# Get the characters from the start to position 5 (not included):

b = "Hello, World!"
print(b[:5]) # Hello

# Get the characters from position 2, and all the way to the end:

b = "Hello, World!"
print(b[2:]) # llo, World!

# Modify Strings
a = "Hello, World!"
print(a.upper()) # HELLO, WORLD!

a = "Hello, World!"
print(a.lower()) # hello, world!

# The strip() method removes any whitespace from the beginning or the end:

a = " Hello, World! "
print(a.strip()) # returns "Hello, World!"

a = "Hello, World!"
print(a.replace("H", "J")) # Jello, World!

#The split() method splits the string into substrings if it finds instances of the separator:

a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!']
print(b[0]) # Hello

# String Concatenation
a = "Hello"
b = "World"
c = a + b
print(c)

# Format - Strings

age = 36
txt = "My name is John, I am " + age
print(txt) #ERROR

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price)) # I want 3 pieces of item 567 for 49.95 dollars.
