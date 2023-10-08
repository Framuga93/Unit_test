def array_average(my_array):
    if isinstance(my_array, list):
        if len(my_array) != 0:
            return sum(my_array) / len(my_array)
        else:
            return None
    else:
        raise TypeError("Input shoud be array")