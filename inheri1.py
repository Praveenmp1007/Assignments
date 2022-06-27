class A:
    def test1(self):
        print("Peter")
class B:
    def test2(self):
        print("Praveen")
class C(A,B):
    def test3(self):
        print("--------")
c1=C()
c1.test1()
c1.test2()
c1.test3()
print(issubclass(C,A))
print(issubclass(A,B))
print(issubclass(C,B))
#print(isinstance(c1.C))