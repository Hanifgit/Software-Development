from collections import deque

def h(n):
    H = {
        'Arad': 366,
        'Zerind': 374,
        'Sibiu': 253,
        'Timisoara': 329,
        'Lugoj': 244,
        'Mehadia': 241,
        'Drobeta': 242,
        'Craiova': 160,
        'Pitesti': 100,
        'Giurgiu': 77,
        'Urziceni': 80,
        'Hirsova': 151,
        'Eforie': 161,
        'Vaslui': 199,
        'Iasi': 226,
        'Neamt': 234,
        'Fagaras': 176,
        'Rimnicu': 193,
        'Oradea': 380,
        'Bucharest': 0

    }

    return H[n]


class Graph:

    def __init__(self, adjacency_list):
        self.adjacency_list = adjacency_list

    def get_neighbors(self, v):
        return self.adjacency_list[v]

    def a_star_algorithm(self, start_node, stop_node):

        open_list = {start_node}
        closed_list = set([])

        g = {start_node: 0}

        parents = {start_node: start_node}

        while len(open_list) > 0:
            n = None

            for v in open_list:
                if n is None or g[v] + h(v) < g[n] + h(n):
                    n = v

            if n is None:
                print('Path does not exist!')
                return None

            if n == stop_node:
                reconst_path = []
                cost = 0
                while parents[n] != n:
                    reconst_path.append(n)
                    n = parents[n]

                reconst_path.append(start_node)

                reconst_path.reverse()

                for c in reconst_path:
                    cost = g[c]

                print('Path found: {}'.format(reconst_path))
                print('Path Cost:', cost)
                return reconst_path

            for (m, weight) in self.get_neighbors(n):

                if m not in open_list and m not in closed_list:
                    open_list.add(m)
                    parents[m] = n
                    g[m] = g[n] + weight

                else:
                    if g[m] > g[n] + weight:
                        g[m] = g[n] + weight
                        parents[m] = n

                        if m in closed_list:
                            closed_list.remove(m)
                            open_list.add(m)

            open_list.remove(n)
            closed_list.add(n)

        print('Path does not exist!')
        return None


adjacency_list = {'Arad': [['Zerind', 75], ['Sibiu', 140], ['Timisoara', 118]],
                  'Sibiu': [['Arad', 140], ['Fagaras', 99], ['Rimnicu', 80], ['Oradea', 151]],
                  'Rimnicu': [['Sibiu', 80], ['Craiova', 146], ['Pitesti', 97]],
                  'Fagaras': [['Sibiu', 99], ['Bucharest', 211]],
                  'Pitesti': [['Rimnicu', 97], ['Craiova', 138], ['Bucharest', 101]]
                  }

graph1 = Graph(adjacency_list)

print('ENTER SOURCE :', end=' ')
source = input().strip()
print('ENTER GOAL :', end=' ')
goal = input().strip()

graph1.a_star_algorithm(source, goal)
# graph1.a_star_algorithm('Arad', 'Bucharest')
