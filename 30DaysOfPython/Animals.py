#intro to OOP in python and syntax conventions



class Animals:
    name = str()
    home = str()
    population = int()
    noise = "Rrrrrr"

    def __init__(self,name,home,population):
        self.name = name
        self.home = home
        self.population = population

    def get_name(self):
        return self.name
    def get_home(self):
        return self.home
    def get_population(self):
        return self.population
    def get_noise(self):
        return self.noise

    def set_name(self,name):
        self.name = name
    def set_home(self,home):
        self.home = home
    def set_population(self,population):
        self.population = population
    def set_noise(self,noise):
        self.noise = noise


    def make_noise(self):
        print(self.noise)

    def __str__(self):
        return f"there are {str(self.population)} {self.name}s living in {self.home}"

