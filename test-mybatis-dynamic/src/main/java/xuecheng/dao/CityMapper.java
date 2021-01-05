package xuecheng.dao;

import xuecheng.domain.City;

import java.util.List;

public interface CityMapper {


    public List<City> findById(Long id);
}
