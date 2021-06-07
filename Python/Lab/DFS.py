# R = int(input("Enter the number of rows:"))
# C = int(input("Enter the number of columns:"))

# graph representation
adj_list = {
    "A": ["B", "C"],
    "B": ["D", "E"],
    "C": ["B", "F"],
    "D": [],
    "E": ["F"],
    "F": []
}

# Required array and dictionary
color = {}  # W, G, B
parent = {}
travers_time = {}  # Start - End
dfs_traversal_output = []
time = 0

# initialize
for node in adj_list.keys():
    color[node] = "W"
    parent[node] = None
    travers_time[node] = [-1, -1]


# print(color)
# print(parent)
# print(travers_time)

def dfs_util(u):
    global time
    color[u] = "G"
    travers_time[u][0] = time
    dfs_traversal_output.append(u)
    time += 1
    for v in adj_list[u]:
        if color[v] in "W":
            parent[v] = u
            dfs_util(v)
    color[u] = "B"
    travers_time[u][1] = time
    time += 1


# for v in adj_list.keys():
#     if color[v] in "W":
dfs_util("A")

print(dfs_traversal_output)
print(parent)
print(travers_time)

# for node in adj_list.keys():
#     print(node, " ->", travers_time[node])
