from unittest.mock import Mock

import pytest

from programm import Programm


@pytest.mark.parametrize("a,b, expected", [([8, 8], [5, 5], "Первый список имеет большее среднее значение"),
                                           ([5, 5], [8, 8], "Второй список имеет большее среднее значение"),
                                           ([7, 7], [7, 7], "Средние значения равны")])
def test_1(a, b, expected):
    assert (Programm(a, b).compare_average()) == expected
