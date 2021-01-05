package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.Province;

import java.util.List;
@Repository
public interface ProvinceMapper {

        List<Province> getProvince();
}
