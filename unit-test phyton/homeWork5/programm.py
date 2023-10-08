from array_average import array_average


class Programm:
    def __init__(self, first_array, second_array):
        self.first_array = first_array
        self.second_array = second_array

    def avarage_of_array(self):
        print(array_average(self.first_array))
        print(array_average(self.second_array))

    def compare_average(self):
        if array_average(self.first_array) > array_average(self.second_array):
            return "Первый список имеет большее среднее значение"
        if array_average(self.first_array) == array_average(self.second_array):
            return "Средние значения равны"
        else:
            return "Второй список имеет большее среднее значение"
