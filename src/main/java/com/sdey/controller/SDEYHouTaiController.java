package com.sdey.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.ldg.api.vo.ResultMsg;
import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.po.Lvfeimanager;
import com.sdey.api.service.LFXDService;
import com.sdey.api.util.ExcelColumns;
import com.sdey.api.util.ExcelView;
import com.sdey.api.util.StringUtil;
import com.sdey.api.vo.LvfeibaseinfoExport;
import com.sdey.api.vo.PageParam;
import com.sdey.api.vo.UpdatePSDVO;

@Controller
@RequestMapping(value = "/lvfeimanager")
public class SDEYHouTaiController {
	@Autowired
	private LFXDService LFXDService;

	@RequestMapping(value = "/login_out")
	public String login_out(PageParam pageParam, HttpServletRequest request) {
		request.getSession().invalidate();
		return "/lvfeimanager/login.jsp";
	}

	@RequestMapping(value = "/getDataList")
	public String getDataList(PageParam pageParam, HttpServletRequest request) {
		Page<Lvfeibaseinfo> page = LFXDService.getDataList(pageParam);
		request.setAttribute("page", page.toPageInfo());
		return "/lvfeimanager/dataDisList.jsp";
	}

	@RequestMapping(value = "/getXQByID")
	public String getXQByID(Integer id, HttpServletRequest request) {
		Lvfeibaseinfo info = LFXDService.getDataById(id);
		request.setAttribute("info", info);
		return "/lvfeimanager/dataDis.jsp";
	}

	/**
	 * 查询
	 * 
	 * @param searchInfo
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/search")
	public String search(Lvfeibaseinfo searchInfo, PageParam pageParam, HttpServletRequest request) {
		Page<Lvfeibaseinfo> page = LFXDService.search(searchInfo, pageParam);
		request.setAttribute("page", page.toPageInfo());
		return "/lvfeimanager/dataDisList.jsp";
	}

	@RequestMapping("/export")
	public ModelAndView export(Lvfeibaseinfo searchInfo, PageParam pageParam, ModelMap model,
			HttpServletRequest request) {
		pageParam.setPageNum(0);
		pageParam.setPageSize(0);
		Page<LvfeibaseinfoExport> page = LFXDService.searchForExport(searchInfo, pageParam);
		Map<String, String> basic_columns = ExcelColumns.getBasicColumns();
		ExcelView viewExcel = new ExcelView(StringUtil.getExcelFileNameByDate("信息导出.xlsx", new Date(), new Date()));
		Map<String, Object> mp = new HashMap<String, Object>();
		for (LvfeibaseinfoExport lv : page.getResult()) {
			lv.initData();
		}
		mp.put("data", page.getResult());
		mp.put("columns", basic_columns);
		model.addAllAttributes(mp);
		return new ModelAndView(viewExcel, model);
	}

	@RequestMapping(value = "/updatepsd")
	public String updatepsd(UpdatePSDVO upd, PageParam pageParam, HttpServletRequest request) {
		Lvfeimanager manager = (Lvfeimanager) request.getSession().getAttribute("manager");
		upd.setManagerID(manager.getUid());
		int exists = LFXDService.selectBypsd(upd);
		ResultMsg msg = new ResultMsg();
		if (exists != 0) {
			int updateCount = LFXDService.updatepsd(upd);
			if (updateCount == 1) {
				msg.setErrorMsg("修改完成");
			} else {
				msg.setErrorCode(1);
				msg.setErrorMsg("修改失败！");
			}
		} else {
			msg.setErrorCode(1);
			msg.setErrorMsg("旧密码错误！");
		}
		request.setAttribute("msg", msg);
		return "/lvfeimanager/psdupdate.jsp";
	}

}
