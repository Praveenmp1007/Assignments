class demo:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def printname(self):
        print(self.name,self.age)
class demo1(demo):
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def printname1(self):
        print(self.name,self.age)
a=demo1("Peter",23)
#a.printname()
a.printname1()
