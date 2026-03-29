class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = []
        fleets = []

        # compile list of cars based on their position and speed
        for i in range(len(position)):
            cars.append([position[i], speed[i]])        

        # reverse list so that it starts at the last car
        cars = sorted(cars, key=lambda p: cars[0])
        cars.sort(reverse=True)

        for car in cars:
            # calculate time each car takes to reach destination
            distance = target - car[0]
            time = distance / car[1]

            # if the time that it takes for the current car
            # is less than or equal to the time of the current fleet
            # then this car belongs to the current
            # so move on to the next car
            if fleets and time <= fleets[-1]:
                continue
            fleets.append(time)
        return len(fleets)





