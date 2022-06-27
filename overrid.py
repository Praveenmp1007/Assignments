class Parent1:
    def test1(self):
        print(Parent1)
class Parent2:
    def test1(self):
        print(Parent2)
class Child(Parent1,Parent2):
    def test2(self):
        print(Child)
ch=Child()
ch.test1()