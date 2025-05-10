package web.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> found = new ArrayList<>();

    static  {
        found.add(new Car("Mazda", "blue", "H 311 HK 67"));
        found.add(new Car("BMW", "white", "O 104 ME 13"));
        found.add(new Car("Kia", "black", "E 871 XO 49"));
        found.add(new Car("Ford", "orange", "M 142 CM 14"));
        found.add(new Car("Volvo", "black", "M 769 MB 28"));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= found.size()) {
            return found;
        }
        return found.stream().limit(count).collect(Collectors.toList());
    }
}
