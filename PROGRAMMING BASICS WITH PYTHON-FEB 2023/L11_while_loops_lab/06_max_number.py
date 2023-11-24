import sys

max_number = - sys.maxsize
command = input()
while command != "Stop":
    current_number = int(command)
    if current_number > max_number:
        max_number = current_number
    command = input()
print(max_number)

# Vtori variant bez sys max size
#max_number = 0
#command = input()
#if command != "Stop":
#    max_number = int(command)
#command = input()
#while command != "Stop":
#    current_number = int(command)
#    if current_number > max_number:
#        max_number = current_number
#        command = input()
#print(max_number)
