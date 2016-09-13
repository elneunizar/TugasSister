import xmlrpclib

decrypted=""
proxy = xmlrpclib.ServerProxy("http://localhost:8000/")	
f=open("encoded.txt","r")
encoded=f.read()
#print encoded
#encodedx=bytes()
print "Decoding ",encoded,"........"

decoded=str(proxy.dec(encoded))
f=open("decrypted.jpeg","wb")
f.write(decoded)

	#f=open("decrypted.jpeg","wb")
	#f.write(proxy.decrypt("encoded.txt"))
#if __name__=='__main__':
#	main()
