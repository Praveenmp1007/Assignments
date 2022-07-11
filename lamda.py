a=lambda x,y,z:x*y*z
print(a(1,2,3))

def f1(b):
    return lambda b:b*b*b
f2=f1(2)
print(f2(2))
list1=[10,20,33,40,50]
x=list(filter(lambda y:(y%2==0),list1))
print(x)