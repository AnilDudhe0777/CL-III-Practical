import xmlrpc.server

def factorial(n):
    try:
        n = int(n)
    except ValueError:
        raise ValueError("Input must be an integer.")
    
    if n < 0:
        raise ValueError("Factorial is not defined for negative numbers.")
    if n > 100:
        raise ValueError("Input is too large! Try a smaller number.")
    if n == 0 or n == 1:
        return "1"
    else:
        return str(n * int(factorial(n - 1)))

# Set up the server
server = xmlrpc.server.SimpleXMLRPCServer(("localhost", 8000))
print("Server is running on port 8000...")
server.register_function(factorial, "factorial")
server.serve_forever()

