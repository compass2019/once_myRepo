package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.ACVSFund;
@Repository
public interface ACVSFundTest {

    public ACVSFund findById(Integer id);

    public ACVSFund findByIdACVSFund(Integer id);
}
