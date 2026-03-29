class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = []
        fleets = []

        # compile list of cars based on their position and speed
        for i in range(len(position)):
            cars.append([position[i], speed[i]])
        
        cars = sorted(cars, key=lambda p: cars[0])
        cars.sort(reverse=True)

        for car in cars:
            distance = target - car[0]
            time = distance / car[1]
            if fleets and time <= fleets[-1]:
                continue
            fleets.append(time)
        return len(fleets)





