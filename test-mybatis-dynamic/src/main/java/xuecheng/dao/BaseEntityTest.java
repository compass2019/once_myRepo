package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.BaseEntity;

import java.util.List;

@Repository
public interface BaseEntityTest {

    public List<BaseEntity> find();
}
