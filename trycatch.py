try:
    fileptr=open("D:\Filehand")
except:
    print("pass")
finally:
    fileptr.close()
