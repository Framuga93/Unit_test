import pytest
from array_average import array_average


def test_1():
    assert (array_average([2, 2, 2]) == 2)


def test_2():
    assert (array_average([]) is None)


def test_3():
    assert (array_average([0, 0, 0]) == 0)


def test_4():
    with pytest.raises(TypeError):
        array_average(['sdasd', 'asdasd'])
