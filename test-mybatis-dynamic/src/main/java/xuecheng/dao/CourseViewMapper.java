package xuecheng.dao;

import org.springframework.stereotype.Repository;
import xuecheng.domain.TmpCourseView;

import java.util.List;

@Repository
public interface CourseViewMapper {

    public List<TmpCourseView> findSid();
}
