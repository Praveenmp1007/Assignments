fileptr=open("D:\Filehand.txt")
'''fileptr.read()
if fileptr:
    print("Successfully opened")
else:
    print("Some error occured")
fileptr.close()'''

with open("D:\Filehand.txt") as p:
    p.write("hello world")
    p.read()
