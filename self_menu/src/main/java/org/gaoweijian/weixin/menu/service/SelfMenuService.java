package org.gaoweijian.weixin.menu.service;

import org.gaoweijian.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu getMenu();

	void saveMenu(SelfMenu selfMenu);

}
