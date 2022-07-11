import re
str="peterpraveen1007@gmailcom"
a=["peterpraveen","1007","@","gmail","com"]
for i in a:
    print(i)
    result=re.search(i,str)
    if result !=None:
        print("email matching")
    else:
        print("email is not matching")