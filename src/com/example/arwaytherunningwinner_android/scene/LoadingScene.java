package com.example.arwaytherunningwinner_android.scene;

import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.util.color.Color;

import com.example.arwaytherunningwinner_android.manager.SceneManager.SceneType;
import com.kpfu.arwaytherunningwinner_android.base.BaseScene;

public class LoadingScene extends BaseScene
{
	@Override
	public void createScene()
	{
		setBackground(new Background(Color.BLACK));
		attachChild(new Text(300, 200, resourcesManager.font, "Loading...", vbom));
	}

	@Override
	public void onBackKeyPressed()
	{
		return;
	}

	@Override
	public SceneType getSceneType()
	{
		return SceneType.SCENE_LOADING;
	}

	@Override
	public void disposeScene()
	{

	}
}