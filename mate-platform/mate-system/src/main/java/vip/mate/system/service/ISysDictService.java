package vip.mate.system.service;

import com.alicp.jetcache.anno.Cached;
import vip.mate.core.common.api.Result;
import vip.mate.core.common.constant.SystemConstant;
import vip.mate.system.entity.SysDict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author xuzf
 * @since 2020-07-01
 */
public interface ISysDictService extends IService<SysDict> {

    @Cached(name= SystemConstant.SYS_DICT_CACHE, key="#code-#dictKey",  expire = 3600)
    Result<String> getValue(String code, String dictKey);

    @Cached(name= SystemConstant.SYS_DICT_CACHE, key="#code", expire = 3600)
    Result<List<SysDict>> getList(String code);

}
