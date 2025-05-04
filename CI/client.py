import xmlrpc.client

# Set up the client
server = xmlrpc.client.ServerProxy("http://localhost:8000/")
number = input("Enter an integer to calculate its factorial: ")
result = server.factorial(number)
print(f"The factorial of {number} is {result}.")

