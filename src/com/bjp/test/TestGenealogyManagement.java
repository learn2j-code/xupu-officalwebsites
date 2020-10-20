package com.bjp.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjp.bam_usermanagement.service.UserInfoService;
import com.bjp.bam_xupumanagement.service.XuPuService;
import com.bjp.pojo.SEntry;
import com.bjp.pojo.SModule;
import com.bjp.pojo.UserInfo;
import com.bjp.util.Page;
import com.bjp.util.jpinyin.PinyinException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGenealogyManagement {
	@Autowired
	UserInfoService userInfoService;
	
	@Autowired
	XuPuService xupuService;
//	@Test
	public void findByPage() {
		Page page = new Page();
		int count = 6;
		int num = 1;
		page.setStart(count*(num-1));
		page.setCount(count);
		PageHelper.offsetPage(page.getStart(),page.getCount());
		List<UserInfo> userList = userInfoService.list();
		int total = (int) new PageInfo<>(userList).getTotal();
        page.setTotal(total);
		for(UserInfo user:userList){
//			System.out.println("ID："+navigateBar.getNbId());
//			System.out.println("Comments："+navigateBar.getComments());
//			System.out.println("Name："+navigateBar.getNavName());
//			System.out.println("Location："+navigateBar.getNavBitmapLocation());
		}
	}
	
	@Test
	public void findBJXArticalListByModuleName() throws PinyinException {
		SModule smodule = new SModule();
		smodule.setModuleName("百家姓");
		Map<String,List<SEntry>> map = xupuService.findBJXArticalListByModuleName(smodule.getModuleName());
		System.out.println(map.get("a"));
	}
}
