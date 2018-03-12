package com.yuanfei.picture_lib.observable;

import com.yuanfei.picture_lib.entity.LocalMedia;
import com.yuanfei.picture_lib.entity.LocalMediaFolder;

import java.util.List;

/**
 * author：luck
 * project：PictureSelector
 * package：com.yuanfei.picture_lib.observable
 * email：893855882@qq.com
 * data：17/1/16
 */
public interface ObserverListener {
    void observerUpFoldersData(List<LocalMediaFolder> folders);

    void observerUpSelectsData(List<LocalMedia> selectMedias);
}
