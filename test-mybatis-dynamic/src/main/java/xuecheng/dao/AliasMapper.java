package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.Alias;
@Repository
public interface AliasMapper {

        Alias findAliasByPid(Long id);


}
