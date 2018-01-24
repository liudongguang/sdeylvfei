package com.sdey.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sdey.api.po.HatArea;
import com.sdey.api.po.HatCity;
import com.sdey.api.po.HatProvince;
import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.po.Lvfeimanager;
import com.sdey.api.service.AreaService;
import com.sdey.api.service.LFXDService;
import com.sdey.api.vo.AddressInfo;

@Controller
@RequestMapping(value = "/sdey")
public class SDEYController {
	@Autowired
	private AreaService areaSV;
	@Autowired
	private LFXDService LFXDService;

	/**
	 * 获取省列表信息
	 * 
	 * @param pageUrl
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getSheng")
	public String getSheng(String pageUrl, HttpServletRequest request) {
		List<HatProvince> allSheng = areaSV.getAllProvinces();
		// allSheng.forEach(item->System.out.println(item));
		request.setAttribute("provinces", allSheng);
		return "/lvfei/address.jsp";
	}

	/**
	 * 获取城市列表通过省id
	 * 
	 * @param address
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getCityByProvinceID")
	public String getCityByProvinceID(AddressInfo address, HttpServletRequest request) {
		List<HatCity> allCity = areaSV.getCityByProvinceID(address.getProvinceID());
		// allSheng.forEach(item->System.out.println(item));
		request.setAttribute("citys", allCity);
		return "/lvfei/address_city.jsp";
	}

	/**
	 * 获取地区信息通过城市id
	 * 
	 * @param address
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getAreasByCityID")
	public String getAreasByCityID(AddressInfo address, HttpServletRequest request) {
		List<HatArea> allAreas = areaSV.getAreasByCityID(address.getCityID());
		// allSheng.forEach(item->System.out.println(item));
		request.setAttribute("areas", allAreas);
		return "/lvfei/address_area.jsp";
	}

	@RequestMapping(value = "/saveLFInfo")
	public String saveLFInfo(Lvfeibaseinfo lfxdInfo, HttpServletRequest request) {
		lfxdInfo.setCreatetime(new Date());
		int saveSate = LFXDService.saveLFInfo(lfxdInfo);
		return "/lvfei/success.jsp";
	}

	@RequestMapping(value = "/login")
	public String login(Lvfeimanager manager, HttpServletRequest request) {
		Lvfeimanager managerDB = LFXDService.login(manager);
		if (managerDB == null) {
			request.setAttribute("message", "用户名或密码错误！");
			request.setAttribute("manager", manager);
			return "/lvfeimanager/login.jsp";
		}
		request.getSession().setAttribute("manager", managerDB);
		return "redirect:/lvfeimanager/index.jsp";
	}

	@RequestMapping(value = "/jumpPage")
	public String jumpPage(String pageUrl) {
		//System.out.println(pageUrl);
		return pageUrl;
	}
}
