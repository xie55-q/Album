package com.hiki.wxmessage.controller;

import com.hiki.wxmessage.resultVO.ResultVO;
import com.hiki.wxmessage.service.AlbumCategoryService;
import com.hiki.wxmessage.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：hiki
 * 2019/8/6 17:26
 */
@RestController
@RequestMapping("/albumcategory")
public class AlbumCategoryShowController {
    @Autowired
    private AlbumCategoryService albumCategoryService;
    /**
     * 获取Album的所有分类的id和banner
     * @return
     */
    @GetMapping("/getbannerlist")
    public ResultVO getBannerList(){
        return ResultUtil.success_return(albumCategoryService.getBannerList());
    }

    @GetMapping("/getcategorylist")
    public ResultVO getAlbumCategoryList(){
        return ResultUtil.success_return(albumCategoryService.getAlbumCategoryList());
    }

//    /**
//     * 通过Album的分类获取列表
//     * @param code
//     * @return
//     */
//    @GetMapping("/getalbumcategorylistbycode")
//    public Map<String, String> getAlbumCategoryListByCode(@RequestParam("code") String code){
//        Gson gson = new Gson();
//        String data = gson.toJson(albumCategoryService.getAlbumCategoryListByCode(code));
//        return ResultUtil.success_return(data);
//    }
}
