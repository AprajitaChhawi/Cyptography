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
        en=''.join(chr(st))
        print(en,end="")
st=input("enter the string")
key=int(input("enter the key"))
encrypt(st,key)
