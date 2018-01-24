package com.sdey.impl.service;

import com.sdey.api.vo.SearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.po.Lvfeimanager;
import com.sdey.api.service.LFXDService;
import com.sdey.api.vo.LvfeibaseinfoExport;
import com.sdey.api.vo.PageParam;
import com.sdey.api.vo.UpdatePSDVO;
import com.sdey.impl.mapper.LvfeibaseinfoMapper;
import com.sdey.impl.mapper.LvfeimanagerMapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LFXDServiceImpl implements LFXDService {
	@Autowired
	private LvfeibaseinfoMapper lvfeibaseinfoDao;
	@Autowired
	private LvfeimanagerMapper lvfeimanagerDao;

	@Override
	public int saveLFInfo(Lvfeibaseinfo lfxdInfo) {
		return lvfeibaseinfoDao.insertSelective(lfxdInfo);
	}

	@Override
	public Page<Lvfeibaseinfo> getDataList(PageParam pageParam) {
		PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true);
		return lvfeibaseinfoDao.getDataList();
	}

	@Override
	public Lvfeibaseinfo getDataById(Integer id) {
		return lvfeibaseinfoDao.selectByPrimaryKey(id);
	}

	@Override
	public Page<Lvfeibaseinfo> search(SearchInfo searchInfo, PageParam pageParam) {
		PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true);
		return lvfeibaseinfoDao.search(searchInfo);
	}

	@Override
	public Page<LvfeibaseinfoExport> searchForExport(SearchInfo searchInfo, PageParam pageParam) {
		PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true);
		return lvfeibaseinfoDao.searchForExport(searchInfo);
	}

	@Override
	public Lvfeimanager login(Lvfeimanager manager) {
		return lvfeimanagerDao.login(manager);
	}

	@Override
	public int updatepsd(UpdatePSDVO upd) {
		return lvfeimanagerDao.updatepsd(upd);
	}

	@Override
	public int selectBypsd(UpdatePSDVO upd) {
		return lvfeimanagerDao.selectBypsd(upd);
	}

	@Override
	public int deleteRowsByIds(String delIDS) {
		List<Integer> collect = Arrays.asList(delIDS.split(",")).stream().map(item -> {
			return Integer.valueOf(item);
		}).collect(Collectors.toList());
		return lvfeibaseinfoDao.deleteRowsByIds(collect);
	}
}
