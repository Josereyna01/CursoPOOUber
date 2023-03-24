from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "ASM2717"
    car.driver = "Manuel Reyna"
    print(vars(car))

    car2 = Car()
    car2.license = "GOODVIBES"
    car2.driver = "Rosa Ortiz"
    print(vars(car2))