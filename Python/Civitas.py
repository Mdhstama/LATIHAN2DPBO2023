from Human import Human

class Civitas(Human):
    # civitas adalah child dari Human
    
    # atribut privat
    __univ = ""
    __email = ""
    
    # constructor
    def __init__(self, nik="", name="", gender="", univ="", email=""):
        super().__init__(nik, name, gender)
        self.__univ = univ
        self.__email = email
    
    # getter setter
    def setUniv(self, univ):
        self.__univ = univ
    
    def getUniv(self):
        return self.__univ
    
    def setEmail(self, email):
        self.__email = email
    
    def getEmail(self):
        return self.__email