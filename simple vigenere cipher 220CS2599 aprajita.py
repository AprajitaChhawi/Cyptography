file1=open("simple vignere cipher input.txt","r")
file=open("simple vignere cipher output.txt","w")
def vigencypt(plaintext,key):
    print(plaintext,key)
    key_length=len(key)
    key_int=[ord(i)for i in key]
    plaintext_int=[ord(i)for i in plaintext]
    ciphertext=''
    for i in range(len(plaintext_int)):
        value=(plaintext_int[i]+key_int[i%key_length])%26
        print(chr(value+65),end="")
        file.write(chr(value+65))
def vigdecypt(ciphertext,key):
    key_length=len(key)
    key_int=[ord(i)for i in key]
    ciphertext_int=[ord(i)for i in ciphertext]
    plaintext=''
    for i in range(len(ciphertext_int)):
        value=(ciphertext_int[i]-key_int[i%key_length]+26)%26
        plaintext+=chr(value+65)
    print(plaintext)
t=input("enter enc or dec")
if(t=='enc'):
    plaintext,key=file1.readline().split()
    vigencypt(plaintext.upper(),key.upper())
elif(t=='dec'):
    ciphertext="AIKALSYROBKHNIWVEGJAAG"
    key="APRAJITA"
    vigdecypt(ciphertext.upper(),key.upper())
    
        
