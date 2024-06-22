def isPrime(n):
	if n < 2:
		return False
	if n == 2:
		return True
	i = 2
	while i <= n/2:
		if n%i == 0:
			return False
		i+=1
	return True

def main():
	#n = int(input('Enter number'))
	
	for i in range(2,1000):
		if isPrime(i):
			print(i)

if __name__ == "__main__":
    main()

