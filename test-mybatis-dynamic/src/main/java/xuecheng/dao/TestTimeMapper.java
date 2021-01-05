package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.TestTime;

@Repository
public interface TestTimeMapper {

    public TestTime selectById(Integer id);
}
