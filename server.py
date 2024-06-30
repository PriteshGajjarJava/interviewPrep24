import socket

s = socket.socket()
s.bind(('',9999)) # 9999 is port number
s.listen()
c, addr = s.accept()
print(c.recv(1024).decode())
