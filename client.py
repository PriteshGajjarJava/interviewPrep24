import socket
# Client program
s = socket.socket()
s.connect(('127.0.0.1', 9999))
s.send('CLIENT: Hi I am client'.encode())

