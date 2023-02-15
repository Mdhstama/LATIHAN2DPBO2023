class Human():
    # parent class
    
    # atribut privat
    __nik = ""
    __name = ""
    __gender = ""
    
    # constructor
    def __init__(self, nik="", name="", gender=""):
      self.__nik = nik
      self.__name = name
      self.__gender = gender
    
    #getter setter
    def setNik(self, nik):
      self.__nik = nik
    
    def getNik(self):
      return self.__nik
    
    def setName(self, name):
      self.__name = name 
    
    def getName(self):
      return self.__name
    
    def setGender(self, gender):
      self.__gender = gender   
    
    def getGender(self):
      return self.__gender