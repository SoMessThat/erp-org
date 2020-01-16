package my.erp.org.mapper;

import java.util.List;
import java.util.Map;

import my.erp.org.domain.Ref;
import my.erp.org.domain.User;
import my.erp.org.vo.PowerDTO;
import my.erp.org.vo.UserVo;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);

	List<UserVo> queryUser(UserVo vo);

	UserVo selectUser(UserVo user);

	List<PowerDTO> selectPowerRootByUserID(Map<String, String> map);

	List<UserVo> queryEmployeesInfo(UserVo user);

	Map<String, Object> getRole(Long id);

	int dismiss(Long id);

	int appoint1(Long id);

	int appoint2(Long id);

	int delUserRole(Long id);

	int delRef(Long id);

	List<UserVo> queryApplyUser(UserVo vo);

	int addRole(Ref ref);

	int ToEmployee(Long id);

	List<UserVo> queryCadre(UserVo vo);
}