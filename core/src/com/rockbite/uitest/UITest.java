package com.rockbite.uitest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class UITest extends ApplicationAdapter {

	private Stage stage;

	@Override
	public void create () {
		stage = new Stage();

		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("pack.atlas"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act();
		stage.draw();
	}

	@Override
	public void resize (int width, int height) {
		stage.getViewport().update(width, height);
	}

	@Override
	public void dispose () {
		stage.dispose();
	}
}
