package web.Dao;

import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarDaoImpl implements CarDao {
    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1,"BMW","Black",1998));
        car.add(new Car(2,"Lada","White",2015));
        car.add(new Car(3,"MERCEDES","Green",2008));
        car.add(new Car(4,"Audi","Red",2012));
        car.add(new Car(5,"TOYOTA","Grey",2001));
    }

    @Override
    public List<Car> show(int id) {
        if (id < 5) {
            return car.stream().limit(id).collect(Collectors.toList());
        }
        return car;
    }

    @Override
    public List<Car> show() {
        return car;
    }
}
