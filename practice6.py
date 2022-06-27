class peter:
    def hello(self,name,age):
       self.name=name
       self.age=age
       print(self.name,self.age)
    def display(self):
       print(self.hello())
emp1=employee("Peter",23)
emp2=employee("Praveen",23)
emp1.display()
emp2.display()