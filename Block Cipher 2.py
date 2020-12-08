file1=open("aprajita1.txt","r")
file2=open("chhawi1.txt","a")
name=file1.readline()
s=name
for i in s:
    s=""
    temp=(ord(i)^127)+67
    file2.write(chr(temp))
file1.close()
file2.close()
