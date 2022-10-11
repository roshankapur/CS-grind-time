#arrays are called lists in python and are dynamic, meaning they can store more than one datatype at a time unlike Java/C/C++

mycart = [12.99, 312, 32, 142, 39.99]
my_items = ["mouse", "laptop", "mic", "monitor", "lunch"]

#hashmaps are called dictionaries in python
hashmap = dict()


for i in range(len(mycart)):
    hashmap[my_items[i]] = mycart[i]

print(hashmap)

