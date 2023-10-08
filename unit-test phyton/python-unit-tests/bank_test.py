import pytest
from Tasks import Person, Bank


def test_1():
    with pytest.raises(TypeError):
        Person.transfer_money(Person(0), 0, Bank())


def test_2():
    with pytest.raises(ValueError):
        Person.transfer_money(Person(100), 120, Bank())


def test_3():
    with pytest.raises(ValueError):
        Person.transfer_money(Person(0), -1, Bank())


def test_4():
    bank = Bank()
    person = Person(100)
    Person.transfer_money(person, 50, bank)
    assert person.balance == 50
    assert bank.balance == 50


