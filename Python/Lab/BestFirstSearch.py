
SuccList = {'Arad': [['Zerind', 374], ['Sibiu', 253] , ['Timisoara', 329]], 'Sibiu': [['Fagaras', 176], ['Rimnicu', 193], ['Oradea', 380]],
            'Fagaras': [['Sibiu', 253], ['Bucharest', 0]]}
Start = 'Arad'
Goal = 'Bucharest'
Closed = list()
SUCCESS = True
FAILURE = False
State = FAILURE


# estimated

def GOALTEST(N):
    if N == Goal:
        return True
    else:
        return False


def MOVEGEN(N):
    New_list = list()
    if N in SuccList.keys():
        New_list = SuccList[N]

    return New_list


def APPEND(L1, L2):
    New_list = list(L1) + list(L2)
    return New_list


def SORT(L):
    L.sort(key=lambda x: x[1])
    return L


def BestFirstSearch():
    OPEN = [[Start, 366]]
    CLOSED = list()
    global State
    global Closed

    while (len(OPEN) != 0) and (State != SUCCESS):
        print("------------")
        N = OPEN[0]
        print("N=", N)
        del OPEN[0]  # delete the node we picked

        if GOALTEST(N[0]):
            State = SUCCESS
            CLOSED = APPEND(CLOSED, [N])
            print("CLOSED=", CLOSED)

        else:
            CLOSED = APPEND(CLOSED, [N])
            print("CLOSED=", CLOSED)

            CHILD = MOVEGEN(N[0])
            print("CHILD=", CHILD)

            for val in OPEN:
                if val in CHILD:
                    CHILD.remove(val)
            for val in CLOSED:
                if val in CHILD:
                    CHILD.remove(val)

            OPEN = APPEND(CHILD, OPEN)  # append movegen elements to OPEN
            print("Unsorted OPEN=", OPEN)
            SORT(OPEN)
            print("Sorted OPEN=", OPEN)
    Closed = CLOSED
    return State


result = BestFirstSearch()
# print(Closed,result)
