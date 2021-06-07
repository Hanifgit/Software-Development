a = [("A", "B")]
adj_list = []


def add_edge(self, u, v):
    self.adj_list[u].append(v)


for u, v in a:
    add_edge(u, v)

print(adj_list)
