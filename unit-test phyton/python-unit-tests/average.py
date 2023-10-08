class Average:
    def find_average(ls: list):
        if not isinstance(ls, list):
            if len(ls) != 0:
                return sum(ls) / len(ls)
            else:
                return None
        else:
            raise TypeError("Input shoud be list")
