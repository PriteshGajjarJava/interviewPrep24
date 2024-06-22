n = int(input('Enter a number: '))
original_n = abs(n)  # Ensure we work with the absolute value

rev = 0
while original_n != 0:
    rem = original_n % 10
    rev = rev * 10 + rem
    original_n //= 10

# If the input was negative, make the reversed number negative too
if n < 0:
    rev *= -1

print("Reversed number:", rev)
