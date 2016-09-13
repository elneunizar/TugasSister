from SimpleXMLRPCServer import SimpleXMLRPCServer
import xmlrpclib 
import sys
import base64

def dec(e):
	decstr=base64.b64decode(e)
	print "Decoding %s......." %e
	return xmlrpclib.Binary(decstr)
server=SimpleXMLRPCServer(("localhost",8000))
print "Starting xml server on port 8000...."
server.register_function(dec,'dec')

try:
	print "Use Control-C to exit"
	server.serve_forever()
except KeyboardInterrupt:
	print "Exiting"
#if __name__=='__main__':
#	main()


		

