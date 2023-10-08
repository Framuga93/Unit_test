import pytest

from average import Average


def test_1():
    assert (Average.find_average([2, 2, 2]) == 2)


def test_2():
    assert (Average.find_average([]) is None)


def test_3():
    assert (Average.find_average([0, 0, 0]) == 0)


def test_4():
    with pytest.raises(TypeError):
        Average.find_average(['sdasd', 'asdasd'])
