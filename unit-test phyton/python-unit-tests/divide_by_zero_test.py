import pytest

from Tasks import Tasks


def test_1():
    with pytest.raises(ZeroDivisionError):
        Tasks.divide(1, 0)


@pytest.mark.parametrize("a, b, expected", [(10, 0, 0),
                                            (-1, 5, -5),
                                            (3, 3, 9),
                                            (-2, -2, 4),
                                            (0, 0, 0)])
def test_2(a, b, expected):
    assert Tasks.multiply(a, b) == expected


@pytest.mark.parametrize("my_str, expected", [("hello", 5),
                                              ("world!", 6),
                                              ("buggggy", 7)])
def test_3(my_str, expected):
    assert Tasks.lenth_string(my_str) == expected
