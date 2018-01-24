package com.sdey.api.service;

import com.github.pagehelper.Page;
import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.po.Lvfeimanager;
import com.sdey.api.vo.LvfeibaseinfoExport;
import com.sdey.api.vo.PageParam;
import com.sdey.api.vo.SearchInfo;
import com.sdey.api.vo.UpdatePSDVO;

public interface LFXDService {

	int saveLFInfo(Lvfeibaseinfo lfxdInfo);

	Page<Lvfeibaseinfo> getDataList(PageParam pageParam);

	Lvfeibaseinfo getDataById(Integer id);

	Page<Lvfeibaseinfo> search(SearchInfo searchInfo, PageParam pageParam);

	Page<LvfeibaseinfoExport> searchForExport(SearchInfo searchInfo, PageParam pageParam);

	Lvfeimanager login(Lvfeimanager manager);

	int updatepsd(UpdatePSDVO upd);

	int selectBypsd(UpdatePSDVO upd);


    int deleteRowsByIds(String delIDS);
}
