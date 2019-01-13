package com.lsz.core.contract;

import com.lsz.core.dto.LayuiNavbarBO;
import com.lsz.core.dto.LoginDTO;
import com.lsz.core.dto.MiniAdminDTO;
import com.lsz.core.common.ResponseInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AdminContract {

    /**
     * 密码登录接口
     *
     * @param loginDTO 账号密码
     * @return 简单用户信息
     */
    @RequestMapping(value = "/login")
    ResponseInfo<MiniAdminDTO> login(@RequestBody LoginDTO loginDTO);

    /**
     * 后台菜单
     *
     * @return 菜单
     */
    @RequestMapping(value = "/menuTree")
    ResponseInfo<List<LayuiNavbarBO>> menuTree(HttpServletRequest request);
}
