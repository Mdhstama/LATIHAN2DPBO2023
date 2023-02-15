from Civitas import Civitas

class Mahasiswa(Civitas):
    # mahasiswa adalah child dari civitas
    
    # atribut private
    __nim = ""
    __fakultas = ""
    __prodi = ""
    
    #constructor
    def __init__(self, nik="", name="", gender="", univ="", email="", nim = "", fakultas = "", prodi = ""):
        super().__init__(nik, name, gender, univ, email)
        self.__nim = nim
        self.__fakultas = fakultas
        self.__prodi = prodi
    
    # getter setter
    def setNim(self, nim):
        self.__nim = nim
    
    def getNim(self):
        return self.__nim
    
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas
    
    def getFakultas(self):
        return self.__fakultas
    
    def setProdi(self, prodi):
        self.__prodi = prodi
    
    def getProdi(self):
        return self.__prodi