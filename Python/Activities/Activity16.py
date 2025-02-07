class car:
    'This is my class'
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


tata_car = car("Tata","Altroz","2021","Manual","White")
volks_car = car("Volkswagen","Polo","2021","Manual","Red")
hyundai_car = car("Hyundai","i20","2020","Manual","White")

tata_car.accelerate()
tata_car.stop()

volks_car.accelerate()
volks_car.stop()

hyundai_car.accelerate()
hyundai_car.stop()