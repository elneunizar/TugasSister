import xmlrpclib

decrypted=""
encoded="a2Vsb21wb2sga2l0YQ=="
proxy = xmlrpclib.ServerProxy("http://localhost:8000/")	

print "Decoding %s......." %encoded
print "Decoded result:",proxy.dec(encoded)

