x = 5
y = "John"
print(x)
print(y)

x = str(3)    # x will be '3'
y = int(3)    # y will be 3
z = float(3)  # z will be 3.0

x = 5
y = "John"
print(type(x))
print(type(y))

# Many Values to Multiple Variables

x, y, z = "Orange", "Banana", "Cherry"
print(x)
print(y)
print(z)

x = y = z = "Orange"
print(x)
print(y)
print(z)

fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
print(x)
print(y)
print(z)

x = "awesome"
print("Python is " + x) # Python is awesome

x = 5
y = "John"
print(x + y) # TypeError: unsupported operand type(s) for +: 'int' and 'str'

# If you use the global keyword, the variable belongs to the global scope:

def myfunc():
  global x
  x = "fantastic"

myfunc()

print("Python is " + x) # Python is fantastic
