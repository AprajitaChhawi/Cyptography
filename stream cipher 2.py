def encrypt(st,key):
    en=""
    for i in st:
        if(i.isupper()):
            st=ord(i)+(key%26)
            if(st>ord('Z')):
                st=st-26
        if(i.islower()):
            st=ord(i)+(key%26)
            if(st>ord('z')):
                st=st-26
        file2.write(chr(st))
file1=open("aprajita2.txt","r")
file2=open("chhawi2.txt","a")
s,address,key=file1.readline().split(" ")
st=s+address
encrypt(st,int(key))
file1.close()
file2.close()
