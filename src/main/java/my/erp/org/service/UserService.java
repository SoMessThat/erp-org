package my.erp.org.service;

import java.util.List;
import java.util.Map;

import my.erp.org.domain.ApplyDepartment;
import my.erp.org.util.ResponseVo;
import my.erp.org.vo.PowerDTO;
import my.erp.org.vo.UserVo;

public interface UserService {
	
	/**
	 * 查找所有用户
	 * @createTime: 2019/11/18 10:10:26
	 * @author: wu.kaibin
	 */
	List<UserVo> queryUser(UserVo vo);

	/**
	 * 新增用户
	 * @createTime: 2019/11/18 10:10:26
	 * @author: wu.kaibin
	 */
	ResponseVo<UserVo> addUser(UserVo vo);
	
	/**
	 * 通过id查看用户信息
	 * @createTime: 2019/11/18 10:10:26
	 * @author: wu.kaibin
	 */
	UserVo findUserById(Long id);
	
	/**
	 * 通过id修改用户
	 * @createTime: 2019/11/18 10:10:26
	 * @author: wu.kaibin
	 */
	int updateUserById(UserVo vo);
	
	/**
	 * 通过id软删除用户信息
	 * @createTime: 2019/11/18 10:10:26
	 * @author: wu.kaibin
	 */
	int delUserById(Long id);

	/**
	 * 登录
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	ResponseVo<UserVo> login(UserVo user);

	/**
     * 根据角色id获取权限菜单
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	List<PowerDTO> queryMenu(Map<String, String> map);
	
	/**
     * 获取某部门的全部干事信息
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	List<UserVo> queryEmployeesInfo(UserVo user);

	/**
     * 辞退干事
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	int dismiss(Long id);

	/**
     * 任命社长
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	int appoint1(Long id);

    /**
     * 任命副社长
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	int appoint2(Long id);

	/**
	 * 修改密码
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	ResponseVo<UserVo> modifyPwd(Map<String, String> user);

	/**
	 * 申请加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	int joinDepartment(ApplyDepartment apply);

	/**
	 * 同意加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	int agreeJoin(Long id);

	/**
	 * 拒绝加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	int refuseJoin(Long id);

	/**
	 * 查找申请的用户
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	List<UserVo> queryApplyUser(UserVo vo);
	
	/**
     * 获取某个部门的干部
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
	List<UserVo> queryCadre(UserVo vo);
}
