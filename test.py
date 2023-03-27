num ="123456789"
strr = ""
for i in range(len(str(num))):
	if(flag==0):
		if(i%2!=0):
			strr+=num[i]

print(strr)