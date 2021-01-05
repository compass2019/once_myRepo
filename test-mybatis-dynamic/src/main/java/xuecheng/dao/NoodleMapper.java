package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.Noodle;

import java.util.List;
@Repository
public interface NoodleMapper {

  public   List<Noodle> findNoodleByArea();
}
