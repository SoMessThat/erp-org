package my.erp.org.api;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import my.erp.org.util.PageVo;
import my.erp.org.util.ResponseVo;
import my.erp.org.vo.PowerDTO;
import my.erp.org.vo.UserVo;

@RequestMapping("/user")
public interface UserApi {
	
	/**
	 * 查找所有用户
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryUser")
	PageVo<UserVo> queryUser(@RequestBody UserVo vo);

	/**
	 * 新增用户
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/addUser")
	ResponseVo<UserVo> addUser(@RequestBody UserVo vo);
	
	/**
	 * 通过id查看用户信息
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/findUserById")
	UserVo findUserById(@RequestParam("id") Long id);
	
	/**
	 * 通过id修改用户
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateUserById")
	int updateUserById(@RequestBody UserVo vo);
	
	/**
	 * 通过id软删除用户信息
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/delUserById")
	int delUserById(@RequestParam("id") Long id);
	
	/**
	 * 登录
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	@RequestMapping("/login")
	ResponseVo<UserVo> Login(@RequestBody UserVo user, HttpServletRequest req);
	
	/**
     * 登出操作
     * @createTime: 2019年11月18日 上午10:18:22
     * @author: wuzhb 
     */
    @RequestMapping("/logout")
    ResponseVo<UserVo> logout(HttpServletRequest req);

    /**
     * 根据角色id获取权限菜单
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/queryMenu")
    List<PowerDTO> queryMenu(HttpServletRequest request);
    
    /**
     * 获取某部门的全部干事信息
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/queryEmployeesInfo")
    PageVo<UserVo> queryEmployeesInfo(@RequestBody UserVo vo, HttpServletRequest request);
    
    /**
     * 辞退干事
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/dismiss")
    ResponseVo<Object> dismiss(@RequestParam("id") Long id);
    
    /**
     * 任命社长
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/appoint1")
    ResponseVo<Object> appoint1(@RequestParam("id") Long id);
    
    /**
     * 任命副社长
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/appoint2")
    ResponseVo<Object> appoint2(@RequestParam("id") Long id);
    
    /**
	 * 修改密码
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	@RequestMapping("/modifyPwd")
	ResponseVo<UserVo> modifyPwd(@RequestBody Map<String, String> user, HttpServletRequest req);
	
	/**
	 * 申请加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	@RequestMapping("/joinDepartment")
	int joinDepartment(@RequestBody Map<String, String> obj, HttpServletRequest req);
	
	/**
	 * 同意加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	@RequestMapping("/agreeJoin")
	int agreeJoin(@RequestParam("id") Long id);
	
	/**
	 * 拒绝加入社团
	 * @createTime: 2019年11月18日 上午10:18:22
	 * @author: wu.kaibin
	 */
	@RequestMapping("/refuseJoin")
	int refuseJoin(@RequestParam("id") Long id);
	
	/**
	 * 查找申请的用户
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/queryApplyUser")
	PageVo<UserVo> queryApplyUser(@RequestBody UserVo vo, HttpServletRequest req);
	
	/**
	 * 查看个人信息
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/getMyInfo")
	UserVo getMyInfo(HttpServletRequest request);
	
	/**
	 * 修改个人信息
	 * @createTime: 2019/11/18 10:09:59
	 * @author: wu.kaibin
	 */
	@RequestMapping("/updateMyInfo")
	int updateMyInfo(@RequestBody UserVo vo, HttpServletRequest request);
	
	/**
     * 获取某个部门的干部
     * @createTime: 2019年11月18日 上午10:48:51
     * @author: wu.kaibin
     */
    @RequestMapping("/queryCadre")
    List<UserVo> queryCadre(@RequestBody UserVo vo, HttpServletRequest request);
}
