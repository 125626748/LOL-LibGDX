package edu.bjfu.lol.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ��������Ա�� extends Actor
{
	TextureRegion ǰ;
	TextureRegion ��;
	float ����;
	public ��������Ա��(TextureRegion ǰ, TextureRegion ��, float ��, int ��)
	{
		this.ǰ = ǰ;
		this.�� = ��;
		setSize(��, ��);
	}
	public void set����(float ����)
	{
		this.���� = ����;
	}
	public boolean is���()
	{
		return ���� >= 1;
	}
	@Override
	public void draw(SpriteBatch batch, float parentAlpha)
	{
		batch.draw(��, getX(), getY(), getWidth(), getHeight());
		batch.draw(ǰ, getX(), getY(), getWidth() * ����, getHeight());
	}
}
