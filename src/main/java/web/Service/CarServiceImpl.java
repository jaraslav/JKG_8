package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDaoImpl carDao;


    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
