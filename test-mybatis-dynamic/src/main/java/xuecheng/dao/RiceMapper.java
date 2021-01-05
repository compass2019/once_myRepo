package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.Rice;

import java.util.List;

@Repository
public interface RiceMapper {



   public List<Rice> findRiceByArea();
}
